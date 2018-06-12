import org.gephi.graph.api.Graph;
import org.gephi.graph.api.GraphModel;
import org.gephi.graph.api.Node;
import org.gephi.statistics.spi.Statistics;
import org.gephi.utils.progress.Progress;
import org.gephi.utils.progress.ProgressTicket;

public class MyMetric implements Statistics {

    private boolean cancel = false;
    private ProgressTicket progressTicket;
    private String report = "";

    public void execute(GraphModel graphModel, AttributeModel attributeModel) {
        report += "Algorithm started ";
        Graph graph = graphModel.getGraphVisible();
        graph.readLock();

        try {
            Progress.start(progressTicket, graph.getNodeCount());

            for (Node n : graph.getNodes()) {
                //do something
                Progress.progress(progressTicket);
                if (cancel) {
                    break;
                }
            }
            graph.readUnlockAll();
        } catch (Exception e) {
            e.printStackTrace();
            //Unlock graph
            graph.readUnlockAll();
        }
    }

    public void execute(GraphModel graphModel) {

    }

    public String getReport() {
        return report;
    }

    public boolean cancel() {
        cancel = true;
        return true;
    }

    public void setProgressTicket(ProgressTicket progressTicket) {
        this.progressTicket = progressTicket;
    }
}
