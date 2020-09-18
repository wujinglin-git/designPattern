/**
 * @Author: wugege
 * @Date: 2020/9/18 14:37
 * 一给窝哩 giao giao 呀吼
 *
 *
 * 这么多balancer对象实质上都指向同一地址。
 *
 *
 */
public class Client {

    public static void main(String[] args) {
        LoadBalancer loadBalancer1,loadBalancer2,loadBalancer3;

        loadBalancer1 = LoadBalancer.getInstance();
        loadBalancer2 = LoadBalancer.getInstance();
        loadBalancer3 = LoadBalancer.getInstance();

        //判断服务器负载均衡器是否相同
        if (loadBalancer1 == loadBalancer2 && loadBalancer2 == loadBalancer3 ) {
            System.out.println("服务器负载均衡器具有唯一性！");
        }

        //增加服务器
        loadBalancer1.addServer("Server 1");
        loadBalancer1.addServer("Server 2");
        loadBalancer2.addServer("Server 3");
        loadBalancer3.addServer("Server 4");

        //模拟客户端请求的分发
        for (int i = 0; i < 10; i++) {
            String server = loadBalancer3.getServer();
            System.out.println("分发请求至服务器： " + server);
        }


    }

}
