package com.better.sparrow.javaBasiceKnowledgePractice;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 10:54 PM 2018/9/13
 * @Modified By :
 */
public class PolymorphicPractice {

    public static class BaseClass{
        public int books = 6;
        public void base(){
            System.out.println("父类的Base方法！");
        }
        public void test(){
            System.out.println("父类的test方法！");
        }
    }

    public static class SubClass extends BaseClass{
        //重新定义一个book实例变量隐藏父类的book实例变量
        public String book = "String类型的book参数";
        public void test(){
            System.out.println("子类覆盖父类的test方法");
        }
        //自己定义一个sub方法
        public void sub(){
            System.out.println("子类的sub方法");
        }
    }
}
