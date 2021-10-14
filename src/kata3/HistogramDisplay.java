package kata3;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;


public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay(){
        super("Histograma");
        this.setContentPane(createPanel());
        this.pack();
    }
    
    public void execute(){
        this.setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart",
                "Dominios email", "Nº de emails", dataset, PlotOrientation.VERTICAL,
                false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(23, "", "yopmail.com");
        dataSet.addValue(52, "", "alu.ulpgc.es");
        dataSet.addValue(10, "", "gmail.com");
        dataSet.addValue(60, "", "outlook.es");
        return dataSet;
    }
    
}
