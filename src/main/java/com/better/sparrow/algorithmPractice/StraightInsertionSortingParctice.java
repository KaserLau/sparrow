package com.better.sparrow.algorithmPractice;

/**
 * @Author : yaobin.a.liu
 * @Description :
 *      假设待排序的数据是数组A[1….n]。初始时，A[1]自成1个有序区，无序区为A[2….n]。
 * 在排序的过程中，依次将A[i] (i=2,3,….,n)从后往前插入到前面已排好序的子数组A[1,…,i-1]中的适当位置，
 * 当所有的A[i] 插入完毕，数组A中就包含了已排好序的输出序列。
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
    public void straightInsertionSorting() {
        int[] arr = {11,10,55,78,100,111,45,56,79,90,345,1000};//创建一个数组arr
        int Arrlength = arr.length;
        System.out.println(Arrlength);
        int temp;
        int j;
        for(int i=1;i < Arrlength;i++){
            temp = arr[i];
            for(j=i-1;j >= 0;j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = temp;//后一个换位置
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
