import org.gephi.statistics.spi.Statistics;
import org.gephi.statistics.spi.StatisticsUI;
import org.openide.util.lookup.ServiceProvider;

import javax.swing.*;

@ServiceProvider(service = StatisticsUI.class)
public class MyMetricUI implements StatisticsUI {

    public String getDisplayName() {
        return "My Metric";
    }

    public String getShortDescription() {
        return null;
    }

    public String getCategory() {
        return StatisticsUI.CATEGORY_NETWORK_OVERVIEW;
    }

    public int getPosition() {
        return 800;
    }

    public JPanel getSettingsPanel() {
        return null;
    }

    public void setup(Statistics statistics) {

    }

    public void unsetup() {

    }

    public Class<? extends Statistics> getStatisticsClass() {
        return MyMetric.class;
    }

    public String getValue() {
        return null;
    }

}
