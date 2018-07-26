package volatiles;

public class SingletonTest {
    public static void main(String[] args) {
        /*for (int i = 0; i <200 ; i++) {
            new Thread(()->{
                try{ Thread.sleep(1000);}
                catch(Exception e){
                    e.printStackTrace();
                }
                System.out.println(Singleton.getInstance().toString());
            }).start();
        }*/
        /*
        for (int i = 0; i <2000 ; i++) {
            new Thread(()->{
                try{ Thread.sleep(1000);}
                catch(Exception e){
                    e.printStackTrace();
                }
                System.out.println(SingleEnum.INSTANCE.hashCode());
            }).start();
        }
        */

        /*
        for (int i = 0; i <2000 ; i++) {
            new Thread(()->{
                try{ Thread.sleep(1000);}
                catch(Exception e){
                    e.printStackTrace();
                }
                System.out.println(SingletonLazy.getInstance().toString());
            }).start();//懒加载
        }
        */
        for (int i = 0; i <2000 ; i++) {
            new Thread(()->{
                try{ Thread.sleep(1000);}
                catch(Exception e){
                    e.printStackTrace();
                }
                DBConnection con1 = DataSourceEnum.DATASOURCE.getConnection();
                DBConnection con2 = DataSourceEnum.DATASOURCE.getConnection();
                System.out.println(con1 == con2);
            }).start();//枚举形式
        }
    }
}
