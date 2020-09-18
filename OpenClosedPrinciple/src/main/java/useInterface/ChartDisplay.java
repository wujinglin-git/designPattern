package useInterface;

/**
 * @Author: wugege
 * @Date: 2020/9/18 10:23
 * 一给窝哩 giao giao 呀吼
 * 4
 */
public  class ChartDisplay implements AbstractChart {


    AbstractChart chart;

    public void setChart(AbstractChart chart) {
        this.chart = chart;
    }

    public void display() {
        chart.display();
    }



}
