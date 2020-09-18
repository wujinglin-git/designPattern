/**
 * @Author: wugege
 * @Date: 2020/9/18 15:04
 * 一给窝哩 giao giao 呀吼
 *
 *
 * 需要注意的是，如果使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之前增加修饰符volatile，被volatile修饰的
 * 成员变量可以确保多个线程都能够正确处理，且该代码只能在JDK 1.5及以上版本中才能正确执行。
 * 由于volatile关键字会屏蔽Java虚拟机所做的一。
 * 些代码优化，可能会导致系统运行效率降低，因此即使使用双重检查锁定来实现单例模式也不是一种完美的实现方式
 */

public class LazySingleton {


    private volatile static LazySingleton instance = null;

    public static LazySingleton getInstance() {

        if (instance == null) { //此处校验是为了查看在多线程环境下，是否存在instance
            synchronized (LazySingleton.class) {  //此处枷锁，而不再getInstence方法外加锁的原因是getInstance会经常被调用，而对象只会产生一次。
                if (instance == null) {//第二次校验是因为，第一次请求创建instance过程中，A创建了对象之后，线程B并不能知道A创建了对象。
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
