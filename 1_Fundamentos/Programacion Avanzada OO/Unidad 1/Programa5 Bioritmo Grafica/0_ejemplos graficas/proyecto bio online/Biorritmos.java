import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
/*import Fecha;
import PanelExt;
import CanvasExt;
*/

/**
 * Esta clase es una aplicaci&oacute;n que calcula las curvas de
 * <b>biorritmos</b> de una persona.<p>
 * La aplicacion muestra una grafica de las curvas centrada
 * en la fecha del biorritmo y a lo largo de una escala de
 * tiempo determinada.<p>
 * Para calcular los biorritmos se necesita conocer la fecha
 * de nacimiento y la fecha del biorritmo. Las curvas
 * consisten simplemente en funciones senoidales dependientes
 * del numero de dias transcurridos entre ambas fechas y de
 * periodos 23 dias (biorritmo f&iacute;sico), 28 (emocional) y
 * 33 (mental). Tambien se calcula la media de las curvas
 * anteriores y su sincronismo.<p>
 * Existen campos de texto que permiten al usuario introducir
 * las fechas de nacimiento, biorritmo y la escala temporal
 * a representar, as&iacute; como un bot&oacute;n para
 * seleccionar como fecha de biorritmo la actual.
 * Adem&aacute;s, se permite que el usuario interaccione
 * con la gr&aacute;fica de la siguiente forma:
 * <ul>
 * <li>Arrastrando con el raton sobre la gr&aacute;fica el usuario
 * puede cambiar la fecha del biorritmo.
 * <li>Arrastrando con el raton sobre una el triangulo de
 * escala de la gr&aacute;fica se puede cambiar la escala temporal.
 * <li>Pulsando sobre el nombre de una curva se puede indicar
 * que se represente o no en la gr&aacute;fica.
 * </ul>
 *
 * @author  <a href="mailto:cvaca@infor.uva.es">
            C&eacute;sar Vaca Rodr&iacute;guez</a>
 * @version Esta versi&oacute;n hace uso de caracter&iacute;sticas de
            Java 1.1, por lo que s&oacute;lo funcionara en navegadores
            que implementen esa version de Java o superiores
            (Explorer 4.0+, Netscape 4.1+).
 * @see     java.applet.Applet
 */
public class Biorritmos extends Applet
                        implements ActionListener,
                                   ComponentListener,
                                   MouseListener,
                                   MouseMotionListener
{
   /* --- Constantes --- */
   static int TAMX = 540;          // Tamano optimo de ventana
   static int TAMY = 380;   
   static int NUM_PTOS = 100;      // Numero de puntos para las graficas
   static int GAP = 10;
   static int ALTO_MARCAS_X = 10;
   static Font FNT_TITULO = new Font( "Helvetica", Font.BOLD, 12 );
   static Font FNT_MARCAS = new Font( "Helvetica", Font.PLAIN, 10 );
   static Color COL_FONDO = new Color(255,255,197);
   static Color COL_FONDO_GRAFICA = Color.white;
   static Color COL_MARCAS = Color.darkGray;
   static Color COL_MARCAS_LINEA = Color.lightGray;
   static Color COL_BORDES = Color.black;
   static Color COL_RESALTAR = Color.red;
   static Color COL_CURVAS[] = {
     new Color(0,127,0), Color.red, Color.blue, Color.orange, Color.darkGray
   };
   static String NOM_CURVAS[] = {
     "Fisico", "Emocional", "Mental", "Media", "Sincronismo"
   };
   
   /* --- Variables de calculo --- */
   // Fechas de nacimiento y biorritmo
   protected Fecha fecNac = new Fecha(1,1,1960,0,0,0);
   protected Fecha fecBio = new Fecha();
   protected double escala = 20.0;       // Escala de la grafica
   protected double tpoIni;              // Limites de la gr fica (dias)
   protected double tpoFin;
   protected double tpoInc; 
   // Valores de biorritmos
   protected double val[][] = new double[5][NUM_PTOS];
   // Puntos de biorritmos
   protected int vecy[][] = new int[5][NUM_PTOS];
   protected int vecx[] = new int[NUM_PTOS];
   // Seleccion de curvas
   protected boolean bioSel[] = {true,true,true,false,false};
   // Rectangulos de seleccion de curvas
   protected Rectangle bioRec[] = new Rectangle[5];

   /* --- Variables de dibujo --- */
   protected Rectangle rTit = new Rectangle();   // Rectangulo del titulo
   protected Rectangle rDib = new Rectangle();   // del dibujo
   protected Rectangle rEsc = new Rectangle();   // de la marca de escala
   protected int anchoMarcasY;
   protected int imgLx;                    // Dimension de la imagen
   protected int imgLy;
   protected int posInicial;               // Posicion inicial al pulsar
   protected int posEscala;                // Posicion inicial al pulsar
   protected double escInicial;            // Escala inicial al pulsar
   protected boolean escalando = false;
   protected boolean moviendo = false;


   /* --- Controles --- */
   protected CanvasExt Lienzo;
   protected Label etqEstado;
   protected TextField txtFecNac, txtFecAct, txtEscala;
   protected Button btnHoy;

   public static void main( String[] args )
   {
      Frame ventana = new Frame("Biorritmos");
      Biorritmos applet = new Biorritmos();

      ventana.setLayout( new BorderLayout() );
      ventana.add("Center",applet);
      ventana.setSize(TAMX,TAMY);

      applet.init();
      applet.start();
      ventana.show();
   }

   public void init( )
   {
      super.init();

      for(int i=0; i<5; i++) bioRec[i] = new Rectangle();
      calculaRangoTemporal();
      calculaBiorritmos();
      creaInterfaz();
      datos2Interfaz();
   }

   /* *** RESPUESTA A ACCIONES *** */

   public void componentHidden( ComponentEvent e ) { }
   public void componentMoved( ComponentEvent e ) { }
   public void componentShown( ComponentEvent e ) { }
   public void mouseMoved( MouseEvent e ) { }
   public void mouseEntered( MouseEvent e ) { }
   public void mouseExited( MouseEvent e ) { }
   public void mousePressed( MouseEvent e ) { }

   public void actionPerformed( ActionEvent e )
   {
     Object fnt = e.getSource();
     if( fnt instanceof TextField ) interfaz2Datos();
     else if( fnt==btnHoy ) {
       interfaz2Datos();
       fecBio.hoy();
       calculaRangoTemporal();
       calculaBiorritmos();
       calculaCoordenadas();
       dibujaImagen();
       datos2Interfaz();
     }
   }

   public void componentResized( ComponentEvent e )
   {
      calculaDimensionesImagen();
      calculaCoordenadas();
      Graphics g = Lienzo.imagen.getGraphics();
      dibujaFondo(g);
      dibujaTitulo(g);
      dibujaMarcasY(g);
      dibujaImagen();
   }

   public void mouseDragged( MouseEvent e )
   {
      if( moviendo ) {
        int x = e.getX();
        fecBio.setInstante( fecBio.getInstante() +
                            (posInicial-x)*escala/rDib.width );
        txtFecAct.setText(""+fecBio);
        posInicial = x;
        calculaRangoTemporal();
        calculaBiorritmos();
        calculaCoordenadas();
        dibujaImagen();
        return;
      }
      if( escalando ) {
        int x = e.getX();
        int ptoMedio = rDib.x + rDib.width/2;
        if( x > ptoMedio) {
          double f = (4.0*(x-ptoMedio))/rDib.width;
          escala = escInicial/f;
          txtEscala.setText( ""+((int) escala) );
          posEscala = x;
        } else {
          posEscala = ptoMedio;
        }
        calculaRangoTemporal();
        calculaBiorritmos();
        calculaCoordenadas();
        dibujaImagen();
        return;
      }
      Point pto = e.getPoint();
      if( rEsc.contains(pto) ) {
        escalando = true;
        escInicial = escala;
        posEscala = pto.x;
      } else {
        moviendo = true;
        posInicial = pto.x;
      }
   }

   public void mouseReleased( MouseEvent e )
   {
      if( escalando ) {
        Graphics g = Lienzo.imagen.getGraphics();
        dibujaFondo(g);
        dibujaTitulo(g);
        dibujaMarcasY(g);
      }
      moviendo = false;
      escalando = false;
      calculaRangoTemporal();
      calculaBiorritmos();
      calculaCoordenadas();
      dibujaImagen();
   }

   public void mouseClicked( MouseEvent e )
   {
      Point pto = e.getPoint();
      int i;
      for( i = 0; (i<5) && !bioRec[i].contains(pto); i++ );
      if(i>4) return;
      bioSel[i] = !bioSel[i];
      Graphics g = Lienzo.imagen.getGraphics();
      dibujaTitulo(g);
      dibujaGrafica(g);
      dibujaLineas(g);
      dibujaMarcasX(g);
      Lienzo.dibujar();
   }

   /* *** PROCESOS DE LA INTERFAZ DE USUARIO *** */

   protected void creaInterfaz( )
   {
      // Creacion de componentes
      Lienzo = new CanvasExt();
      Lienzo.addComponentListener(this);
      Lienzo.addMouseListener(this);
      Lienzo.addMouseMotionListener(this);
      etqEstado = new Label(" Arrastre con el raton para mover el grafico");
      etqEstado.setBackground(Color.lightGray);
      txtFecNac = new TextField(10);
      txtFecNac.addActionListener(this);
      txtFecAct = new TextField(10);
      txtFecAct.addActionListener(this);
      txtEscala = new TextField(6);
      txtEscala.addActionListener(this);
      btnHoy = new Button("Fecha de hoy");
      btnHoy.addActionListener(this);
      Label etqFecNac = new Label("Nacimiento: ",Label.RIGHT);
      Label etqFecAct = new Label("Biorritmo: ",Label.RIGHT);
      Label etqEscala = new Label("Escala: ",Label.RIGHT);
      etqFecNac.setBackground(Color.lightGray);
      etqFecAct.setBackground(Color.lightGray);
      etqEscala.setBackground(Color.lightGray);
      // Creacion de paneles
      PanelExt panControl = new PanelExt(2);
      panControl.setLayout( new FlowLayout(FlowLayout.LEFT,5,1) );
      panControl.add(etqFecNac);
      panControl.add(txtFecNac);
      panControl.add(etqFecAct);
      panControl.add(txtFecAct);
      panControl.add(etqEscala);
      panControl.add(txtEscala);

      PanelExt panGrafico = new PanelExt(5);
      panGrafico.setLayout( new BorderLayout(5,5) );
      panGrafico.add("Center",Lienzo);

      PanelExt panEstado = new PanelExt(1);
      panEstado.setLayout( new BorderLayout(3,3) );
      panEstado.add("Center",etqEstado);
      panEstado.add("East",btnHoy);

      // Insercion de paneles
      setLayout( new BorderLayout() );
      add("North",panControl);
      add("Center",panGrafico);
      add("South",panEstado);
   }

   protected void datos2Interfaz( )
   {
      fecNac.formato = 11;
      fecBio.formato = 11;
      txtFecNac.setText(""+fecNac);
      txtFecAct.setText(""+fecBio);
      txtEscala.setText( ""+((int) escala) );
   }

   protected boolean interfaz2Datos( )
   {
      etqEstado.setText(" Arrastre con el raton para mover el grafico.");

      try {
        fecNac.traducir( txtFecNac.getText() );
      } catch ( Exception e ) {
        etqEstado.setText(" Fecha de nacimiento erronea.");
        return(false);
      }
      try {
        fecBio.traducir( txtFecAct.getText() );
      } catch ( Exception e ) {
        etqEstado.setText(" Fecha de biorritmo erronea.");
        return(false);
      }
      try {
        escala = Double.valueOf( txtEscala.getText() ).doubleValue();
      } catch ( Exception e ) {
        etqEstado.setText(" Escala erronea.");
        return(false);
      };
      calculaRangoTemporal();
      calculaBiorritmos();
      calculaCoordenadas();
      dibujaImagen();
      return(true);
   }

   /* *** CALCULOS DE BIORRITMOS *** */

   protected void calculaRangoTemporal( )
   {
      double diaCentral = fecBio.getInstante();
      tpoIni = diaCentral - escala/2;
      tpoFin = diaCentral + escala/2;
      tpoInc = (tpoFin-tpoIni)/(NUM_PTOS-1);
   }

   protected void calculaBiorritmos( )
   {
      double f,e,m;

      int i;
      double tpo = tpoIni - fecNac.getInstante();
      for( i=0; i<NUM_PTOS; i++, tpo += tpoInc )
      {
        f = Math.sin(2*Math.PI*tpo/23);  // Ciclo fisico
        e = Math.sin(2*Math.PI*tpo/28);  // Ciclo emocional
        m = Math.sin(2*Math.PI*tpo/33);  // Ciclo intelectual
        val[0][i] = f;
        val[1][i] = e;
        val[2][i] = m;
        val[3][i] = (f + e + m)/3;
        val[4][i] = 1-2*Math.sqrt( ( (f-e)*(f-e)+
                                     (f-m)*(f-m)+
                                     (e-m)*(e-m) )/8);
      }
   }

   /* *** PROCESOS DE DIBUJO DE GRAFICAS *** */

   protected void dibujaImagen( )
   {
      Graphics g = Lienzo.imagen.getGraphics();
      dibujaGrafica(g);
      dibujaMarcaEscala(g);
      dibujaLineas(g);
      dibujaMarcasX(g);
      Lienzo.dibujar();
   }

   protected void calculaDimensionesImagen( )
   {
      Dimension d = Lienzo.getSize();
      imgLx = d.width;
      imgLy = d.height;
      Lienzo.imagen = Lienzo.createImage(imgLx,imgLy);
      Graphics g = Lienzo.imagen.getGraphics();

      rTit.y = GAP;
      rTit.width = 6*GAP;
      rTit.height = 16;
      g.setFont(FNT_TITULO);
      int i;
      for (i=0; i<5; i++) {
         rTit.width += g.getFontMetrics().stringWidth(NOM_CURVAS[i]);
      }
      rTit.x = (imgLx - rTit.width)/2;

      g.setFont(FNT_MARCAS);
      anchoMarcasY = g.getFontMetrics().stringWidth("+100 %");

      rDib.x = GAP + anchoMarcasY + 5;
      rDib.y = rTit.y + rTit.height + 2*GAP;
      rDib.height = imgLy - rDib.y - GAP - ALTO_MARCAS_X - GAP;
      rDib.width  = imgLx - rDib.x - GAP;

      rEsc.x = rDib.x + (3*rDib.width/4) - GAP/2;
      rEsc.y = rDib.y - GAP;
      rEsc.width = GAP;
      rEsc.height = GAP;
   }

   protected void calculaCoordenadas( )
   {
      int i,j;
      double ax,bx,ay,by;

      ax = rDib.x;
      bx = (double) rDib.width/(NUM_PTOS-1);
      ay = rDib.y + rDib.height/2.0;
      by = -rDib.height/2.0;

      for(i=0; i<NUM_PTOS; i++) {
        vecx[i] = (int) Math.round(ax + i*bx);
        for(j=0; j<5; j++) {
           vecy[j][i] = (int) Math.round(ay + by*val[j][i]);
         }
      }
   }

   protected void dibujaFondo( Graphics g )
   {
      g.setColor(COL_FONDO);
      g.fillRect(0,0,imgLx,imgLy);
   }

   protected void dibujaTitulo( Graphics g )
   {
      g.setColor(COL_FONDO_GRAFICA);
      g.fillRect(rTit.x,rTit.y,rTit.width,rTit.height);
      g.setFont(FNT_TITULO);
      int y = rTit.y + rTit.height - 3;
      int x = rTit.x + GAP;
      int ly = rTit.height - 6;
      int i,lx;
      for( i = 0; i < 5; i++ ) {
        g.setColor(COL_CURVAS[i]);
        g.drawString(NOM_CURVAS[i],x,y);
        lx = g.getFontMetrics().stringWidth(NOM_CURVAS[i]);
        bioRec[i].x = x;
        bioRec[i].y = y-ly;
        bioRec[i].width = lx;
        bioRec[i].height = ly;
        if( !bioSel[i] ) {
          g.setColor(COL_RESALTAR);
          g.drawLine(x,y,x+lx,y-ly);
          g.drawLine(x,y-ly,x+lx,y);
        }
        x += lx + 10;
      }
      g.setColor(COL_BORDES);
      g.drawRect(rTit.x,rTit.y,rTit.width,rTit.height);
   }

   protected void dibujaGrafica( Graphics g )
   {
      g.setColor(COL_FONDO_GRAFICA);
      g.fillRect(rDib.x,rDib.y,rDib.width,rDib.height);
      for( int i = 0; i < 5; i++ ) {
        if( !bioSel[i] ) continue;
        g.setColor(COL_CURVAS[i]);
        g.drawPolyline(vecx,vecy[i],vecx.length);
      }
   }

   protected void dibujaMarcaEscala( Graphics g )
   {
      Polygon p = new Polygon();
      if ( escalando ) {
         g.setColor(COL_FONDO);
         g.fillRect(rDib.x,rDib.y-GAP,rDib.width+GAP,GAP);
         p.addPoint(posEscala - rEsc.width/2, rEsc.y);
         p.addPoint(posEscala + rEsc.width/2, rEsc.y);
         p.addPoint(posEscala, rEsc.y + rEsc.height);
         g.setColor(COL_RESALTAR);
         if (posEscala<(rDib.x+rDib.width)) 
           g.drawLine(posEscala,rDib.y,posEscala,rDib.y + rDib.height);
      } else {
         p.addPoint(rEsc.x, rEsc.y);
         p.addPoint(rEsc.x + rEsc.width, rEsc.y);
         p.addPoint(rEsc.x + rEsc.width/2, rEsc.y + rEsc.height);
         g.setColor(COL_BORDES);
      }
      g.fillPolygon(p);
   }

   protected void dibujaLineas( Graphics g )
   {
      // Lineas verticales
      int x,y;
      double y0 = rDib.y;
      double iy = rDib.height/10.0;
      
      g.setColor(COL_MARCAS_LINEA);
      for( int i = 1; i<10; i++ ) {
        y = (int) Math.round(y0 + i*iy);
        g.drawLine(rDib.x, y, rDib.x + rDib.width, y);
      }

      // Rectangulo final
      g.setColor(COL_BORDES);
      g.drawRect(rDib.x, rDib.y, rDib.width, rDib.height);
      // Lineas especiales para el centro
      y = rDib.y + rDib.height/2;
      g.drawLine(rDib.x, y, rDib.x+rDib.width, y);
      y++;
      g.drawLine(rDib.x, y, rDib.x+rDib.width, y);
      x = rDib.x + rDib.width/2;
      g.drawLine(x, rDib.y, x, rDib.y+rDib.height);
      x++;
      g.drawLine(x, rDib.y, x, rDib.y+rDib.height);
   }

   protected void dibujaMarcasY( Graphics g )
   {
      String cad;
      int y;
      double y0 = rDib.y;
      double iy = rDib.height/10.0;
      int dx;
      int dy = FNT_MARCAS.getSize()/2;

      g.setFont(FNT_MARCAS);
      g.setColor(COL_MARCAS);
      for( int i = 0; i < 11; i++ ) {
        y = (int) Math.round(y0 + i*iy);
        cad = ((i < 5) ? "+" : "-") + (Math.abs(i-5)*20) + " %";
        dx = anchoMarcasY - g.getFontMetrics().stringWidth(cad);
        g.drawString(cad,GAP+dx,y+dy);
      }
   }

   protected void dibujaMarcasX( Graphics g )
   {
      int x,dx;
      int y = rDib.y + rDib.height + 1;
      String cad;
      double incTpo = (escala > 10.0) ? Math.floor(escala/10.0) : 1;
      double tpo0 = Math.ceil(tpoIni/incTpo)*incTpo;
      double tpo = tpo0;
      Fecha fec = new Fecha();

      g.setColor(COL_FONDO);
      g.fillRect(rDib.x, y, imgLx, y+15);
      y += 14;

      fec.formato = 0;
      g.setFont(FNT_MARCAS);
      do {
         fec.setInstante(tpo);
         cad = fec.toString();
         dx = g.getFontMetrics().stringWidth(cad)/2;
         x = rDib.x + (int) (rDib.width*(tpo - tpoIni)/escala);
         g.setColor(COL_MARCAS_LINEA);
         g.drawLine(x, rDib.y, x, rDib.y + rDib.height);
         g.setColor(COL_MARCAS);
         if( (x-dx > rDib.x) && (x+dx < rDib.x+rDib.width) ) {
           g.drawString(cad,x-dx,y);
         }
         tpo += incTpo;
      } while( tpo < tpoFin );
   }
}