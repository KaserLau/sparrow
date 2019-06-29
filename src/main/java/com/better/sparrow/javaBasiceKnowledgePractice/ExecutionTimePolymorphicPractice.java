package com.better.sparrow.javaBasiceKnowledgePractice;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 8:48 PM 2018/12/9
 * @Modified By :
 */
public class ExecutionTimePolymorphicPractice {
    public void executiuonTime(){
        System.out.println("这是没有参数进来的方法");
    }

    public void executiuonTime(String var1){
        System.out.println("有参数var1");
    }

    public void executiuonTime(String var1,String var2){
        System.out.println("有参数var1和参数var2");
    }

    public void executiuonTime(String var1,String var2,String var3){
        System.out.println("有参数var1,参数var2,参数var3");
    }
}
