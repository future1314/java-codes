package volatiles;

public class EHSSingletonTest {


        public static void main(String[] args) {

            for (int i = 0; i < 2000; i++) {
                new Thread(() -> {
                    EHSSingleton instance = EHSSingleton.getInstance();
                    System.out.println(instance);
                }).start();
            }


        }

    //链接：https://www.jianshu.com/p/debb798ca9ef
}
