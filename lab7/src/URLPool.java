import java.util.*;

public class URLPool {   //����� �� �������� ������� ������
    private HashMap<String, URLDepthPair> visited;
    private LinkedList<URLDepthPair> pool;

    public URLPool(){
        visited = new HashMap<>();
        pool = new LinkedList<>();
    }
    // ������������� ������� � ������
    public synchronized URLDepthPair getLink(){
        boolean isWaiting = false;
        if(pool.size() == 0) {
            try {
                Crawler.WaitingThreads++;
                isWaiting = true;
                if(Crawler.WaitingThreads == Thread.activeCount()) {
                    System.err.println("��� ������ ������");
                    System.exit(0);
                };
                this.wait();
            }
            catch (Exception e) { return null; }
        }
        if(isWaiting) Crawler.WaitingThreads--;
        URLDepthPair link = pool.pop();
        visited.put(link.getURL(),link);
        return link;
    }

    public synchronized void addLink(URLDepthPair link){
        if(!visited.containsKey(link.getURL())) {
            pool.add(link);
            this.notify();
        }
    }
}