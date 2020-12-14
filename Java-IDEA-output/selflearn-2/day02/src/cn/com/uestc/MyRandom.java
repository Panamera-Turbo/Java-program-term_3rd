package cn.com.uestc;

import java.util.Random;

/**
 * @Project: selflearn-2
 * @Package: cn.com.uestc
 * @Author: Chen Qizhi
 * @Date: 2020/12/12  周六
 * @Time: 15:09
 **/

public class MyRandom {
    private Random myRan;
    private int rr;

    int returnRan(){
        myRan = new Random();
        rr = myRan.nextInt();   //返回一个随机int值
        return rr;
    }

    int returnLimitedRan(int a){
        myRan = new Random();
        rr = myRan.nextInt(a);  //这里返回的范围是[0, a-1]的int
        return rr;
    }

}
