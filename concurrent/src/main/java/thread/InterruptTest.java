package thread;

/**
 * Created by  on 2017/6/16.
 */
public class InterruptTest {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
                //模拟正在工作
                System.out.println(Thread.currentThread().getName()+" Working");
        });

        thread.start();
        //中断该线程
//        thread.interrupt();//没什么效果？
    }

}
