package cn.com.uestc;

/**
 * @Project: selflearn-2
 * @Package: PACKAGE_NAME
 * @Author: Chen Qizhi
 * @Date: 2020/12/11  周五
 * @Time: 21:31
 **/

public class APIs {
    public static void main(String[] args) {
        System.out.println("We are going to use some examples to learn how to use javaAPI");

        LearnScanner scnr  = new LearnScanner();
        scnr.in();

        GetMax gtmx = new GetMax();
        gtmx.setA();
        gtmx.setB();
        gtmx.setC();
        System.out.println("Max Num:" + gtmx.compare());
    }
}
