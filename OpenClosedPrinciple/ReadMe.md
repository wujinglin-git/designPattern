**开闭原则(Open-Closed Principle, OCP)**：一个软件实体应当对扩展开放，对修改关闭。即软件实体应尽量在不修改原有代码的情况下进行扩展。

 Sunny软件公司开发的CRM系统可以显示各种类型的图表，如饼状图和柱状图等，为了支持多种图表显示方式：

饼状图: pieChart   柱状图:barChart

---


 在after中，我们引入了抽象图表类AbstractChart，且ChartDisplay针对抽象图表类进行编程，并通过setChart()方法由客户端来设置实例化的具体图表对象，在ChartDisplay的display()方法中调用chart对象的display()方法显示图表。如果需要增加一种新的图表，如折线图LineChart，只需要将LineChart也作为AbstractChart的子类，在客户端向ChartDisplay中注入一个LineChart对象即可，无须修改现有类库的源代码。     
 
 
     此处抽象类的作用为强调标准，使每种图表都要实现 display接口。
     
     
     
###### 那用接口的话如何？？
 在usrInterface中实现了，此处并不能体现出接口和抽象类的额区别。
  <br>譬如：
 1. 接口的变量必须是 public static final ，必须赋初值。  抽象类的默认类型是default 类型的，可以被子类重新定义和赋值。  
 
 2. 接口强调特定功能的实现  ，这是因为他可以多继承    猫可以实现 吃和睡   人则可以实现 吃睡，学习。
    
