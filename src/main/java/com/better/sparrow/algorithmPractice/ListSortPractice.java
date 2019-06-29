package com.better.sparrow.algorithmPractice;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 6:31 PM 2018/6/30
 * @Modified By :
 */
public class ListSortPractice {
    /**
     * @Author: Kaser.Lau
     * @Date: 2018/6/30
     * @Description: 测试为List中的String元素按字母排序的方法实现
     * @Param:
     * @return:
     **/
    public void sortByList(){
        List<String> StringList = new ArrayList<>();
        StringList.add("易皇星");
        StringList.add("阿弟");
        StringList.add("冰球");
        StringList.add("崇明");
        StringList.add("邓小平");
        //升序（小到大）
        //注意：是根据的汉字的拼音的字母排序的，而不是根据汉字一般的排序方法
        System.out.println("a.按汉字拼音的字母升序(小到大)");
        Collections.sort(StringList, Collator.getInstance(java.util.Locale.CHINA));
        for (int i=0;i<StringList.size();i++){
            System.out.print(StringList.get(i)+";");
        }
        System.out.println();
        //降序(大到小)//不指定排序规则时，也是按照字母的来排序的
        System.out.println("b.按汉字拼音的字母降序(大到小)");
        Collections.reverse(StringList);
        for (int i=0;i<StringList.size();i++){
            System.out.print(StringList.get(i)+";");

        }
        System.out.println("");
    }
}
