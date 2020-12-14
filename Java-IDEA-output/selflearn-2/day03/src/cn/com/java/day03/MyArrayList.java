package cn.com.java.day03;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Project: selflearn-2
 * @Package: cn.com.java.day03
 * @Author: Chen Qizhi
 * @Date: 2020/12/12  周六
 * @Time: 15:44
 **/
/*
    得到100个随机数字放入大集合，然后选取偶数放入小集合
 */
public class MyArrayList {
//    private static  myArrLstAll;
    private ArrayList<Integer> myArrLstAll = new ArrayList<>();
    private ArrayList<Integer> myArrLstLimited = new ArrayList<>();
    private Random rr = new Random();

    void makeArr(){
        for (int i = 0; i < 100; i++) {
            Integer n = rr.nextInt();
            myArrLstAll.add(n);
        }
    }

    ArrayList<Integer> chooseElement(){
        for (int i = 0; i < myArrLstAll.size(); i++) {
            int num = myArrLstAll.get(i);
            if (num % 2 == 0){
                myArrLstLimited.add(num);
            }
        }
        return  myArrLstLimited;
    }

    void showResult(){
        if(myArrLstLimited == null){
            System.out.println("wrong  usage!");
            return;
        }
        for (int i = 0; i < myArrLstLimited.size(); i++) {
            System.out.println(myArrLstLimited.get(i));
        }

    }
}
