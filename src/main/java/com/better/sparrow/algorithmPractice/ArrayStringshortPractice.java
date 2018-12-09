package com.better.sparrow.algorithmPractice;

import java.util.*;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 8:04 PM 2018/6/30
 * @Modified By :
 */
public class ArrayStringshortPractice {

    public void stringShort(){
//        String[] names={"易皇星","阿弟","冰球","崇明","邓小平"};
//        Arrays.sort(names, Collator.getInstance(Locale.SIMPLIFIED_CHINESE));
//        for(String arr : names){
//            System.out.println(arr);
//        }


//        int[] numbers={1,3,5,8,9,10,3,50};
//        Arrays.sort(numbers);
//        for(int arr : numbers){
//            System.out.println(arr);
//        }

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(12);
        intList.add(3);
        intList.add(3);
        intList.add(5);
        intList.add(9);
        intList.add(0);
        Collections.sort(intList);
        for(int arr : intList){
            System.out.println(arr);
        }

//        System.out.println(Arrays.toString(names));
    }
}
