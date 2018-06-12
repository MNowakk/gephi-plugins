import org.gephi.statistics.spi.Statistics;
import org.gephi.statistics.spi.StatisticsBuilder;

import org.openide.util.lookup.ServiceProvider;

@ServiceProvider(service = StatisticsBuilder.class)
public class MyMetricBuilder implements StatisticsBuilder {

    public String getName() {
        return null;
    }

    public Statistics getStatistics() {
        return new MyMetric();
    }

    public Class<? extends Statistics> getStatisticsClass() {
        return MyMetric.class;
    }
}
