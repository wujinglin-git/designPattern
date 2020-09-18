import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: wugege
 * @Date: 2020/9/18 14:14
 * 一给窝哩 giao giao 呀吼
 * 4
 *
 *
 * 单例类，真实环境下该类将非常复杂，包括大量初始化的工作和业务方法，
 *考虑到代码的可读性和易理解性，只列出部分与模式相关的核心代码
 *
 *
 */
public class LoadBalancer {

    private static LoadBalancer instance = null;
    /**
     * 被volatile修饰的成员变量可以确保多个线程都能够正确处理，且该代码只能在JDK 1.5及以上版本中才能正确执行。
            * 由于volatile关键字会屏蔽Java虚拟机所做的一些代码优化，可能会导致系统运行效率降低，
            * 因此即使使用双重检查锁定来实现单例模式也不是一种完美的实现方式。
            */

    //服务器集合
    private List serverList = null;

    //单利被创建时即完成了serverList的实例化
    private LoadBalancer(){
        serverList = new ArrayList();
    }

    //保证只有一个对象，并且只能被自己实例化
    public static LoadBalancer getInstance(){
        if (instance == null){
            instance = new LoadBalancer();
        }
        return instance;
    }


    //增加服务器
    public void addServer(String server) {
        serverList.add(server);
    }

    //删除服务器
    public void removeServer(String server) {
        serverList.remove(server);
    }

    //使用Random类随机获取服务器
    public String getServer() {
        Random random = new Random();
        //在服务器数量内为范围，随机获取服务器
        int i = random.nextInt(serverList.size());
        return (String)serverList.get(i);
    }


}
