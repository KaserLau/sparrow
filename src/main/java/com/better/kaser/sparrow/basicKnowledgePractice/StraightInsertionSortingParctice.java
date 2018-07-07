package com.better.kaser.sparrow.basicKnowledgePractice;

/**
 * @Author : yaobin.a.liu
 * @Description : 直接插入排序,在已经排好顺序的int类型数组中插入一个数，再把新的数组排序
 * @Date : Create in 10:19 AM 7/2/2018
 * @Modified By :
 */
public class StraightInsertionSortingParctice {
    /**
     * @Created by yaobin.a.liu
     * @CreateDate: 7/2/2018 10:50 AM
     * @Modify by :
     * @param :
     * @Return :
     * @Exception :
     * @Description : 直接插入排序
     */
    public void straightInsertionSorting(int[] arr) {
        int Arrlength=arr.length;
        for(int i= 1; i<Arrlength; i++){
            if(arr[i] < arr[i-1]){//若第i个元素大于i-1元素，直接插入。小于的话，移动有序表后插入
                int j= i-1;
                int temp = arr[i];//复制为哨兵，即存储待排序元素
                while(temp<arr[j]){//查找在有序表的插入位置
                    arr[j+1] = arr[j];
                    j--;//元素后移
                    if(j<0) {
                        break;
                    }
                }
                arr[j+1] = temp;//插入到正确位置
            }
            printLine(arr,i);//打印每趟排序的结果
        }
    }
    //打印每次的排序结果
    private static void printLine(int[] arr,int i) {
        System.out.println(i+":");
        int Arrlength=arr.length;
        for(int j=0;j<Arrlength;j++) {
            System.out.print(arr[j]+"  ");
        }
        System.out.println();
    }
}
