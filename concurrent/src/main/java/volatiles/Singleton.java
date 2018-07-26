package volatiles;

/**
 * Created by  on 2017/6/15.
 */
public class Singleton {
    private static Singleton instance;//volatile 此处是防止指令重排？没测试出来？懒汉式

    private Singleton() {
        new AssertionError("don't support reflect.");//
    }

    public static Singleton getInstance() {
        if (instance == null) { // Single Checked///提高性能
            synchronized (Singleton.class) {///注释掉 有多线程问题。
                if (instance == null) { // Double checked ///注释掉 有多线程问题。
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i <1000 ; i++) {
            new Thread(()->{
                try{ Thread.sleep(1000);}
                catch(Exception e){
                    e.printStackTrace();
                }
                System.out.println(Singleton.getInstance().toString());
            }).start();
        }
 }
//        System.out.println(Singleton.getInstance().toString());
//        System.out.println(Singleton.getInstance().toString());
//        System.out.println(Singleton.getInstance().toString());
//        System.out.println(Singleton.getInstance().toString());
//        System.out.println(Singleton.getInstance().toString());
}


