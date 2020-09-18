package before;

/**
 * @Author: wugege
 * @Date: 2020/9/18 10:23
 * 一给窝哩 giao giao 呀吼
 * 4
 */
public class ChartDisplay {


    public static void display(String type){

        if (type.equals("pie")) {
            PieChart chart = new PieChart();
            chart.display();
        }
        else if (type.equals("bar")) {
            BarChart chart = new BarChart();
            chart.display();
        }
    }



}
