package com.better.sparrow.javaBasiceKnowledgePractice;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 7:36 PM 2018/12/9
 * @Modified By :
 */
public class SubClass {
    //重新定义一个book实例变量隐藏父类的book实例变量
    public String books = "这是该子类中的book参数，类型为：String";
    public void test(){
        System.out.println("这是该子类的test方法，如果你见到这句话说明该子类的test方法覆盖了他的父类test方法");
    }
    //自己定义一个sub方法
    public void sub(){
        System.out.println("这是该子类的sub方法");
    }
}
