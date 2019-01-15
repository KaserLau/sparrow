package com.better.sparrow.maintest;

import com.better.sparrow.bean.Item;
import com.better.sparrow.javaBasiceKnowledgePractice.CompileTimePolymorphicPractice;
import com.better.sparrow.javaBasiceKnowledgePractice.ExecutionTimePolymorphicPractice;
import com.better.sparrow.javaBasiceKnowledgePractice.PolymorphicPractice;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class mainTest {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<Date> days = new ArrayList<>();
        Date date1 = sdf.parse("2019-01-02");
        Date date2 = sdf.parse("2019-01-03");
        Date date3 = sdf.parse("2019-01-01");
        Date date4 = sdf.parse("2019-01-07");
        Date date5 = sdf.parse("2019-01-04");
        Date date6 = sdf.parse("2019-01-05");
        days.add(date1);
        days.add(date2);
        days.add(date3);
        days.add(date4);
        days.add(date5);
        days.add(date6);
        int localEmdPosition = 0 ;
        Date value = new Date();
        //"2019-01-02" , "2019-01-03" , "2019-01-01" , "2019-01-07" , "2019-01-04" , "2019-01-05"
        for(int i = 0; i<days.size()-1;i++){
            Date test1 = days.get(i);
            value = days.get(i);
            for (int j = i+1; j < days.size()-1;j++){
                Date test2 = days.get(j);
                if (test1.after(test2)){//test1 > test2
                    value = days.get(j);
                    localEmdPosition = j;
                    System.out.println("value " + value +":"+ "localEmdPosition " + localEmdPosition);
                }
            }
        }
        System.out.println(">--------------> localEmdPosition = " + localEmdPosition);
    }
}


