package demografia1;

/*@author jose_*/

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Demografia1 {

    public static void main(String[] args) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        double poblacion = 25;
        int esperanza_de_vida = 5;
        double defunciones;
        double poblacion_neta;

        double tc = 0.2; // tasa de crecimiento 20%
        double tm = 0.4; // tasa de mortalidad 40%

        for (int tiempo = 0; tiempo < esperanza_de_vida; tiempo++) {

            //Crecimiento
            poblacion = poblacion * (1 + tc);
            dataset.addValue(poblacion, "Crecimiento", "" + tiempo);

            //Mortalidad
            defunciones = poblacion * tm;
            dataset.addValue(defunciones, "Mortalidad", "" + tiempo);

            //Crecimiento Neto
            poblacion_neta = poblacion - defunciones;
            dataset.addValue(poblacion_neta, "Crecimiento neto", "" + tiempo);

        }

        JFreeChart chart = ChartFactory.createLineChart(
                "Calculo demografico",
                "Tiempo",
                "Población",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );

        ChartFrame fr = new ChartFrame("Calculo Demografico I", chart);
        fr.pack();
        fr.setVisible(true);
    }
}