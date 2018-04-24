
package prueba2;

import org.jfree.ui.RefineryUtilities;

/*@author jose_*/
public class Prueba2 {

    public static void main(String[] args) {
        // TODO code application logic here
        FuncionSenoX grafica = new FuncionSenoX("Gráfica f(x) = sen x");
        grafica.pack();
        //RefineryUtilities.centerFrameOnScreen(grafica);
        grafica.setVisible(true);   
    }
}
