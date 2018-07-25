package thread;

/**
 * Created by  on 2017/6/16.
 */
public class NotifyTest {

    public synchronized void work() {//synchronized
        System.out.println("Begin Work");
        System.out.println("Begin time"+System.currentTimeMillis());
        try {
            //等待唤醒
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work End");
        System.out.println("End   time"+System.currentTimeMillis());
    }

    public synchronized void continueWork() {
        notifyAll();
    }

    public static void main(String[] args) throws InterruptedException {
        NotifyTest test = new NotifyTest();
        new Thread(() -> test.work()).start();

        //等待3000毫秒后唤醒，继续工作。
        Thread.sleep(3000);
//      test.continueWork();//注释调则 一直不唤醒。
    }
}
