package prueba;

import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;
/* @author jose_*/

public class GraficaPie extends JFrame{
    
    public GraficaPie(String appTitulo, String grafTitulo) 
    {
        super(appTitulo);
        PieDataset datos = creaDatos();
        JFreeChart chart = creaGrafica(datos, grafTitulo);
        ChartPanel panel = new ChartPanel(chart);
        panel.setPreferredSize(new java.awt.Dimension(800, 500));
        setContentPane(panel);
    }
    
    private PieDataset creaDatos() {
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue("Física", 1);
        datos.setValue("Computación", 96);
        datos.setValue("Matemáticas", 1);
        datos.setValue("Biología", 1);
        datos.setValue("Actuaría", 1);
        return datos;    
    }
    
    private JFreeChart creaGrafica(PieDataset datos, String titulo) {
        
        JFreeChart grafica = ChartFactory.createPieChart3D(
        titulo, datos, true, false, false);
        PiePlot3D plot = (PiePlot3D) grafica.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return grafica;        
    }
}