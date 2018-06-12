import org.gephi.statistics.spi.Statistics;

import javax.swing.*;

public class MyMetricPanel extends JPanel {

    private MyMetricPanel panel;
    private MyMetric myMetric;

    public JPanel getSettingsPanel() {
        panel = new MyMetricPanel();
        return panel;
    }

    public void setup(Statistics statistics) {
        this.myMetric = (MyMetric) statistics;
        if(panel!=null) {
            panel.setDirected(myMetric.isDirected());
        }
    }

    public void unsetup() {
        if(panel!=null) {
            myMetric.setDirected(panel.isDirected());
        }
        panel = null;
    }
}
