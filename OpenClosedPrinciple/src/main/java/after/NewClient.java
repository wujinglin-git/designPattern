package after;


/**
 * @Author: wugege
 * @Date: 2020/9/18 10:40
 * 一给窝哩 giao giao 呀吼
 * 4
 */
public class NewClient {


    /**
     *
     * 通过使用开闭原则的设计，两者前后的主要区别在于对于子类chart对象的创建时机，
     * 对于前者使用switch来说，要在分支中创建对象，而且创建对象和执行方法同时进行，
     * 而对于改良后引入抽象类，chartDisplay只需要负责接
     * 收创建好的对象，在执行方法即可，增加新的图表时，也只需要添加新的类即可。
     *
     */

    public static void main(String[] args) {

        ChartDisplay chartDisplay = new ChartDisplay();

        //此时仅仅需要传入不同的Chart对象即可，也就是修改或添加时，只需要操作实现AbstractChart抽象类的子类即可。
        chartDisplay.setChart(new PieChart());

        // chartDisplay.setChart(new BarChart());

        chartDisplay.display();
    }

}
