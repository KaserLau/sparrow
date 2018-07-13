package com.better.sparrow.basicKnowledgePractice;

/**
 * @Author : yaobin.a.liu
 * @Description :
 * 简单选择排序 :
 *  原理：把数组的每前一个数值跟后面的所有的数对比一次，满足条件的数值摆出来，然后记录位置的下标，然后换位
 * @Date : Create in 7:50 PM 7/2/2018
 * @Modified By :
 */
public class SimpleSelectionSortPractice {
    public void selectSort(){
        int arr[]={3,1,2,0};
        int len = arr.length;
        int value;
        int position;
        for(int i=0;i<len;i++){//循环次数
            value = arr[i];//取出第一个
            position = i;//记录position
            for(int j=i+1;j<len;j++){//找到最小的值和位置
                if(value >arr[j]){//当前一个数比后一个数大
                    value = arr[j];//把前面的数摆出来
                    position = j;//记录该数值的位置
                }
            }
            arr[position]=arr[i];//进行交换
            arr[i]=value;
            printLine(arr,i);
        }
    }
    //打印每次的排序结果
    private static void printLine(int[] arr,int a) {
        System.out.println(a+":");
        int Arrlength=arr.length;
        for(int j=0;j<Arrlength;j++) {
            System.out.print(arr[j]+"  ");
        }
        System.out.println();
    }
}
