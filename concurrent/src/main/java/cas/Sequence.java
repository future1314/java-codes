package cas;

/**
 * Created by  on 2017/6/20.
 */
public class Sequence {
    private int value;
    public synchronized int next() {
        return value++;
    }
}
