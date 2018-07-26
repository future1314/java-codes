package volatiles;

public class EHSSingleton {

        // 1.将构造函数私有化，不可以通过new的方式来创建对象
        private EHSSingleton(){}

        // 2.在类的内部创建自行实例
        private static EHSSingleton instance = new EHSSingleton();///俄汉式 没有并发问题。

        // 3.提供获取唯一实例的方法
        public static EHSSingleton getInstance() {
            return instance;
        }
}
    //一上来就创建对象了，如果该实例从始至终都没被使用过，则会造成内存浪费。
    //链接：https://www.jianshu.com/p/debb798ca9ef
    //
    //编写单例模式的代码其实很简单，就分了三步：
    //将构造函数私有化
    //在类的内部创建实例
    //提供获取唯一实例的方法