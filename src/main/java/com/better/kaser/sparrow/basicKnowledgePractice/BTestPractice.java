package com.better.kaser.sparrow.basicKnowledgePractice;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 6:47 PM 2018/6/30
 * @Modified By :
 */
public class BTestPractice extends ATestPractice {
    int number=0;
    //静态代码块
    static{
        System.out.println("子类B静态代码块执行！");
    }

    //构造代码块
    {
        System.out.println("子类B构造代码块执行！");
        number=2;
    }

    //构造方法
    public BTestPractice(){
        System.out.println("子类B构造器执行(构造方法)！");
        System.out.println(number);
    }

    public void callExtendClassExecutionOrderPractice(){
        System.out.println("子类B：Hello I am callExtendClassExecutionOrderPractice method");
    }
}
