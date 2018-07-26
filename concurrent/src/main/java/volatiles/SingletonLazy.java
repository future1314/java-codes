package volatiles;


public class SingletonLazy {

    private SingletonLazy() {
    }

    // 使用内部类的方式来实现懒加载
    private static class LazyHolder {///只有静态内部类 才可以有 静态成员变量。
        // 创建单例对象
        private static final SingletonLazy INSTANCE = new SingletonLazy();
    }

    // 获取对象
    public static final SingletonLazy getInstance() {
        return LazyHolder.INSTANCE;
    }

}

    //链接：https://www.jianshu.com/p/debb798ca9ef

