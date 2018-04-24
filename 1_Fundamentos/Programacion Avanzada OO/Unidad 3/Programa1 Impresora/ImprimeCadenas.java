import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
 
class Impresora
{
   Font fuente = new Font("Dialog", Font.PLAIN, 10);
	PrintJob pj;
	Graphics pagina;
 
 	Impresora()
	{
		pj = Toolkit.getDefaultToolkit().getPrintJob(new Frame(), "SCAT", null);
	}
 
	public void imprimir(String Cadena)
	{
		try
		{
			pagina = pj.getGraphics();
			pagina.setFont(fuente);
			pagina.setColor(Color.black);
 
			pagina.drawString(Cadena, 60, 60);
 
			pagina.dispose();
			pj.end();
		}catch(Exception e)
		{
			System.out.println("LA IMPRESION HA SIDO CANCELADA...");
		}
	}
}//FIN DE LA CLASE Impresora
 
 
 
//A CONTINUACION LA CLASE PRINCIPAL
public class ImprimeCadenas extends JFrame
{
	String cadena;
	JTextField campo;
	JButton imprimir;
	JLabel info;
	Impresora imp;
	JPanel principal = new JPanel(new BorderLayout());
	JPanel etiq = new JPanel(new FlowLayout());
	JPanel dos = new JPanel(new FlowLayout());
 
	//CONSTRUCTOR DE LA CLASE
	ImprimeCadenas()
	{
		super("Muestra Simple de Impresión en JAVA...");
 
		info = new JLabel("ESCRIBA ALGO EN EL CAMPO Y HAGA CLIC EN IMPRIMIR...");
		cadena = new String();
		campo = new JTextField(30);
		imprimir = new JButton("IMPRIMIR");
 
		dos.add(campo);
		dos.add(imprimir);
		etiq.add(info);
 
		campo.setToolTipText("ESCRIBA ALGO AQUÍ...");
		imprimir.setToolTipText("CLIC AQUI PARA IMPRIMIR...");
 
		principal.add(etiq, BorderLayout.NORTH);
		principal.add(dos, BorderLayout.CENTER);
 
		getContentPane().add(principal);
 
		pack();
		this.setResizable(false);
 
		Dimension pantalla, cuadro;
		pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		cuadro = this.getSize();
 
		this.setLocation(((pantalla.width - cuadro.width)/2),
						  (pantalla.height - cuadro.height)/2);
 
 
		//LISTENER DEL BOTON
		imprimir.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				cadena = "";
				cadena = String.valueOf(campo.getText());
				if (!cadena.equals(""))
				{
					imp = new Impresora();
					imp.imprimir(cadena);
				}
				else System.out.println("NO SE IMPRIME NADA EN BLANCO...");
 
				campo.requestFocus();
				campo.select(0, cadena.length());
			}
		});
      
	}
 
	public static void main(String jm[])
	{
		ImprimeCadenas p = new ImprimeCadenas();
		p.show();
 
		p.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent evt)
			{
				System.exit(0);
			}
		});
	} 
}