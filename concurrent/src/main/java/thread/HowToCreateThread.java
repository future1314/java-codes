package thread;

import java.util.concurrent.*;

/**
 * Created by  on 2017/6/8.
 */
public class HowToCreateThread {

    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    public static void method1() {
        //继承java.lang.Thread
        class Task extends Thread {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Started");
            }
        }

        new Task().start();
    }

    public static void method2() {
        //实现 java.lang.Runnable
        class Task implements Runnable {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Started");
            }
        }

        new Thread(new Task()).start();
    }

    public static void method3() {
        //实现 java.util.concurrent.Callable
        class Task implements Callable {//线程组。。

            @Override
            public Object call() throws Exception {
                System.out.println(Thread.currentThread().getName() + " Started");
                //求和
                return 1 + 1;
            }
        }

        ExecutorService es = Executors.newFixedThreadPool(1);//sigle 与 单线程的区别。
        Future future = es.submit(new Task());
        try {
            System.out.println("Calculate Completed Sum：" + future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        es.shutdown();

    }

}
