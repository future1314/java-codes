package thread;

/**
 * Created by  on 2017/6/16.
 */
public class YieldTest {

    public  void work(){
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " Working");
            try{Thread.sleep(1000);}
            catch(Exception e){
                e.printStackTrace();
            }
            Thread.yield();
        }
    }


    public static void main(String[] args) {
        YieldTest test = new YieldTest();
        new Thread(() -> test.work()).start();
        new Thread(() -> test.work()).start();
        System.out.println(Thread.currentThread().getName() + " Working");

        /**
         输出：
             Thread-0 Working
             Thread-1 Working
             Thread-0 Working
             Thread-1 Working
             Thread-0 Working
             Thread-1 Working
         **/
    }
}
