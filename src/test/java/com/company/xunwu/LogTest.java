package com.company.xunwu;

import org.hibernate.validator.constraints.Range;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LogTest extends XunwuApplicationTests {

//    Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void logTest(){
        for (int i = 0; i <10 ; ++i) {
            System.out.println(i);
        }
//        logger.info("success log");
    }

    @Test
    public void test(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            for (int j = num1; j < num2; j++) {
                list.add(j);
            }
        }
        list.sort((o1, o2) -> {
            if (o1 <o2) {
                return 1;
            }
            return -1;
        });
        List<Integer> list1 = new ArrayList<>();
        int temp1 = list.get(0);
        int temp2 = temp1;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i)!= list.get(i-1)){
                temp2 = list.get(i-1);
                list1.add(temp1);
                list1.add(temp2);
                temp1 = list.get(i);
                temp2 = temp1;
            }
        }
    }

    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(9);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 <o2) {
                    return -1;
                }
                return 1;
            }
        });

        for (Integer integer:list
             ) {
            System.out.println(integer);
        }
    }
}
