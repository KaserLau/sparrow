package com.better.sparrow.basicKnowledgePractice;

/**
 * @Author : Kaser.Lau
 * @Description : 对int类型的数组进行冒泡排序，原理：数组中相邻的两个数都做一次对比，大的往后移。
 * @Create Date : 8:16 PM 2018/6/30
 * @Modified By :
 */
public class BubbleSortPractice {
    public void bubbleSort(){
        int arr[]={3,1,5,7,2,4,9,6};
        for (int i = 0 ; i < arr.length-1 ;i++){//第一层循环是获取需要循环的次数
            for (int j = 0; j< arr.length-i-1; j++){//第二层循环，对应第一层循环中每一次循环相邻两个数对比的次数。如i=0,j=7
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int a :arr){
            System.out.println(a+";");
        }
    }
}
