package com.better.sparrow.basicKnowledgePractice;

/**
 * @Author : Kaser.Lau
 * @Description : 测试类被加载的时候成分的执行顺序，包括静态代码块，构造代码块，构造方法
 * @Create Date : 6:32 PM 2018/6/30
 * @Modified By :
 */
public class ATestPractice {
    int number=0;
    //静态代码块
    static{
        System.out.println("父类A静态代码块执行！");
    }

    //构造代码块
    {
        System.out.println("父类A构造代码块执行！");
        number=1;
    }

    //构造方法
    public ATestPractice(){
        System.out.println("父类A构造器执行(构造方法)！");
        System.out.println(number);
    }

    public void callExecutionOrderPractice(){
        System.out.println("父类A ：Hello I am callExecutionOrderPractice method");
    }

}
