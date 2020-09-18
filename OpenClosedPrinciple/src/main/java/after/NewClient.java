package after;


/**
 * @Author: wugege
 * @Date: 2020/9/18 10:40
 * 一给窝哩 giao giao 呀吼
 * 4
 */
public class NewClient {

    public static void main(String[] args) {
        ChartDisplay chartDisplay = new ChartDisplay();
        //此时仅仅需要传入不同的Chart对象即可，也就是修改或添加时，只需要操作实现AbstractChart抽象类的子类即可。
        chartDisplay.setChart(new PieChart());

       // chartDisplay.setChart(new BarChart());

        chartDisplay.display();
    }

}
