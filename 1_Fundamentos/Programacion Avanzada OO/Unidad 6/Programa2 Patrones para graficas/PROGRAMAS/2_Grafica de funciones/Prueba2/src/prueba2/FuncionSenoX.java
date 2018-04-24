package prueba2;

import javax.swing.*;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
/*@author jose_*/

public class FuncionSenoX extends JFrame{
    
    
    public FuncionSenoX(String appTitulo) {
        super(appTitulo);
        XYDataset datos = creaDatos();
        JFreeChart diagrama = creaGrafica(datos);
        ChartPanel panel = new ChartPanel(diagrama);
        panel.setPreferredSize(new Dimension(500, 400));
        setContentPane(panel);
    }
        
    private XYDataset creaDatos() {
        XYSeries datos = new XYSeries("Datos");
        for (double x = 254-20; x <= 254+40; x += 0.01) {
            double y = Math.sin((x*2*Math.PI)/33);
            datos.add(x, y);
        }
        XYSeriesCollection conjuntoDatos = new XYSeriesCollection();
        conjuntoDatos.addSeries(datos);

        return conjuntoDatos;
    }    
    
    private JFreeChart creaGrafica(XYDataset datos) {
        JFreeChart diag = ChartFactory.createXYLineChart(
                "Gráfica", "Eje X", "Eje Y", datos, 
                PlotOrientation.VERTICAL, false, false, 
                false);
        return diag;
    }
}