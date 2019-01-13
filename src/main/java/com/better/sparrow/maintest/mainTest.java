package com.better.sparrow.maintest;

import com.better.sparrow.bean.Item;
import com.better.sparrow.javaBasiceKnowledgePractice.CompileTimePolymorphicPractice;
import com.better.sparrow.javaBasiceKnowledgePractice.ExecutionTimePolymorphicPractice;
import com.better.sparrow.javaBasiceKnowledgePractice.PolymorphicPractice;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class mainTest {

    public static void main(String[] args) {
        List<Item> itemsList = Arrays.asList(
                new Item("TF001","TFA" ,10, new BigDecimal("9.99"),"HKD"),
                new Item("TF001","TFA",20, new BigDecimal("19.99"),"HKD"),
                new Item("TF001","TFA", 10, new BigDecimal("29.99"),"HKD"),
                new Item("TF002","TFA" ,11, new BigDecimal("8.98"),"USD"),
                new Item("TF002","TFA",22, new BigDecimal("17.99"),"USD"),
                new Item("TF002","TFA", 13, new BigDecimal("27.99"),"USD"),
                new Item("TF003","TFA" ,14, new BigDecimal("2.99"),"USD"),
                new Item("TF003","TFA",25, new BigDecimal("1.99"),"USD"),
                new Item("TF003","TFA", 16, new BigDecimal("32.99"),"USD")
        );

        Map<String, Map<String, Integer>> itemMap = itemsList.stream().collect(
                Collectors.groupingBy(Item::getPartnerName,Collectors.groupingBy(Item::getSubpartnerName,Collectors.summingInt(Item::getCount))));

        System.out.println("test: " + itemMap.get("TF001").get("TFA"));

        System.out.println("M group by Map: " + itemMap);

        Object integerMap = itemsList.stream().collect(Collectors.groupingBy(Item::getPartnerNameAndSubpartner,Collectors.summingInt(Item::getCount)));

        System.out.println("M group by Map2: " + integerMap);
        //list sample:
//        https://blog.csdn.net/u013871100/article/details/73430397
    }

    private static String fetchGroupKey(Item detail){
        return detail.getPartnerName() + detail.getSubpartnerName();
    }

}


