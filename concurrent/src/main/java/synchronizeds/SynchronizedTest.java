package synchronizeds;

/**
 * Created by  on 2017/6/14.
 */
public class SynchronizedTest {

    public synchronized void method1(){
        System.out.println("Hello World!");
    }

    public  void method2(){
        synchronized (this){
            System.out.println("Hello World!");
        }
    }
}
