package com.better.kaser.sparrow.maintest;

import com.better.kaser.sparrow.basicKnowledgePractice.ArrayStringshortPractice;
import com.better.kaser.sparrow.basicKnowledgePractice.BubbleSortPractice;
import com.better.kaser.sparrow.basicKnowledgePractice.SimpleSelectionSortPractice;
import com.better.kaser.sparrow.basicKnowledgePractice.StraightInsertionSortingParctice;

public class mainTest {

    public static void main(String[] args) {

        int arr[]={3,1,5,7,2,4,9,6};
//        System.out.println("1.测试为List中的String元素按字母排序的方法实现");
//        ListSortPractice listSortByString = new ListSortPractice();
//        listSortByString.sortByList();

//        System.out.println("2.测试类被加载的时候成分的执行顺序，包括静态代码块，构造代码块，构造方法");
//        ATestPractice executionOrder = new ATestPractice();
//        executionOrder.callExecutionOrderPractice();

//        System.out.println("3.子类继承父类后当子类被加载的时候类成分执行顺序，包括静态代码块，构造代码块，构造方法");
//        BTestPractice BTestPractice = new BTestPractice();
//        BTestPractice.callExtendClassExecutionOrderPractice();

//        System.out.println("4.把String类型的数组按字母排序");
//        ArrayStringshortPractice arrayStringshortPractice = new ArrayStringshortPractice();
//        arrayStringshortPractice.stringShort();

//        System.out.println("5.简单的冒泡排序，时间复杂度是O(n的2次方)");
//        BubbleSortPractice bubbleSortPractice = new BubbleSortPractice();
//        bubbleSortPractice.bubbleSort();

//        System.out.println("6.直接插入排序算法");
//        StraightInsertionSortingParctice insertionSorting = new StraightInsertionSortingParctice();
//        insertionSorting.straightInsertionSorting(arr);

        System.out.println("7.简单选择排序");
        SimpleSelectionSortPractice simpleSelectionSort = new SimpleSelectionSortPractice();
        simpleSelectionSort.selectSort();
    }
}
