import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.event.ActionListener.*;

public class VisorImg extends Applet implements ActionListener {
   //sustituí por un array de Objetos Images.
    private Image [] img; 
	 private Button boton1;
	 //variable que llevara un conteo, cuando este en el ultimo elemento pues se vuelve 0;
	 private int cont = 0;
//por ahora tengo 3 imagenes definidas a continuacion
    public void init(){
        boton1= new Button("Siguiente");
        setLayout(null);
		   Image [] img = { 
           getImage(getCodeBase(),"img1.gif"),
           getImage(getCodeBase(),"img2.jpg"),
           getImage(getCodeBase(),"img3.jpg") };
			  
           //copia la referencia del array local, al array Miembro.
          this.img = img;
			  	  
        boton1.setBounds(540,5,100,40);
        boton1.addActionListener(this);
        add(boton1);
        
    }
    
    public void paint(Graphics g){
        g.drawImage(getImage(),40,40,this);

    }
	 
	/*este metodo es importante, ya que es llamado 
	 *cada ves que paint se llama, est metodo 
	 *devuelve la imagen siguiente del arreglo
	 *pues, como puedes ver, esta obtiene la 
	  imagen actual gracias a la variable contador.
	  */
	 private Image getImage(){
	     return this.img[cont];
	 }
	 
    public void actionPerformed(ActionEvent ae){
	   /* no se q hacer aki, pues ponga la accion.
		  
		  * puedes hacer esto de varias manera, pero la mas sencilla
		  * es crear un Array de objetos Image, e ir llamando en el
		  * metodo repaint, a la imagen corriespondiente a este click.
		  */
		 //pre incremento el contador en 1.
	         ++cont;
		 //si contandor es igual al numero total de imagines que tiene el
		 //array, pues se pone en 0, para que vuelva a la secuencia.
		 if(cont == img.length) cont = 0;
		//repintamos el applet denuevo.
		repaint();	  
    }
            
}