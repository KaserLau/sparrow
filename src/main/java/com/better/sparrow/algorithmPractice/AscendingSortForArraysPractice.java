package com.better.sparrow.algorithmPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author : yaobin.a.liu
 * @Description :
 * @Date : Create in 11:24 AM 7/18/2018
 * @Modified By :'
 */
public class AscendingSortForArraysPractice {

    public void ascendingSort(){
        int[] arr = {1,4,-1,5,0};
        List<String> a = new ArrayList<String>();
        a.add("String1");
        a.add("String2");
        a.size();
        Arrays.sort(arr);
        int len = arr.length;
        System.out.println(len);
        //数组arr[]的内容变为{-1,0,1,4,5}
        for(int i=0;i<len;i++)
            System.out.print(arr[i]+"  ");

    }
}
