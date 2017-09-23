import abstractFactory.AbstractFactory;
import abstractFactory.FactoryProducer;
import builder.BuilderPatternDemo;
import strategy.Addition;
import strategy.Multiplication;
import strategy.StrategyPatternDemo;


/**
 * Created by Sahil on 9/21/2017.
 */



public class DesignPatternDemo {
    public static void main(String[] args) {

        /*Demo Singleton Pattern*//*
        SingletonPatternDemo s1 = SingletonPatternDemo.getInstance();
        SingletonPatternDemo s2 = SingletonPatternDemo.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("The two objects are same: " + s1.equals(s2));

        class Employee {}
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println("The two objects are same: " + e1.equals(e2));*/

        /*Demo Factory Pattern *//*
        ShapeFactory sf = new ShapeFactory();
        sf.getShape("circle").draw();
        sf.getShape("square").draw();
        sf.getShape("triangle").draw();*/

        /*Demo Abstract Factory Pattern*/
        /*FactoryProducer fp = new FactoryProducer();
        fp.getFactory("shape").getShape("circle").draw();
        fp.getFactory("shape").getShape("square").draw();
        fp.getFactory("shape").getShape("triangle").draw();
        fp.getFactory("color").getColor("blue").fill();
        fp.getFactory("color").getColor("red").fill();*/

        /*Demo Builder Pattern*/
       /* BuilderPatternDemo bp = new BuilderPatternDemo.Builder()
                .setNum1(1)
                .setNum2(2)
                .setNum3(3)
                .setNum4(4)
                .setNum5(5)
                .build();
        System.out.println("My object built is as follows: \n" + bp);*/

        /*Demo of Strategy Pattern*/
        /*StrategyPatternDemo myStrategy = new StrategyPatternDemo(new Addition());
        System.out.println("Addition of 5,5:  " + myStrategy.performOperation(5,5));

        myStrategy = new StrategyPatternDemo(new Multiplication());
        System.out.println("Multiplication of 5,5:  " + myStrategy.performOperation(5,5));*/



    }
}
