package com.better.sparrow.javaBasiceKnowledgePractice;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 7:34 PM 2018/12/9
 * @Modified By :
 */
public class CompileTimePolymorphicPractice {
    public void testCompileTimePolymorphic(){
        SuperClass superClass = new SuperClass();
        System.out.println("获取superClass的books参数"+ superClass.books);
        superClass.base();
        superClass.test();
        SubClass subClass = new SubClass();
        System.out.println("获取SubClass的books参数"+ subClass.books);
        subClass.test();
        subClass.sub();
        //调用父类的base()方法
        subClass.base();
        SuperClass compileTimePolymorphic = new SubClass();
        ((SubClass) compileTimePolymorphic).sub();
    }
}
