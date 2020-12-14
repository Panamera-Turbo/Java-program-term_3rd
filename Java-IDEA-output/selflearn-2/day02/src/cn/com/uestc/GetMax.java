package cn.com.uestc;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

/**
 * @Project: selflearn-2
 * @Package: cn.com.uestc
 * @Author: Chen Qizhi
 * @Date: 2020/12/11  周五
 * @Time: 22:11
 **/

public class GetMax {
    private int a, b, c;
    private int max = 0;


    public int getA() {
        return a;
    }

    public void setA() {
        System.out.println ("input a numbers");
        Scanner reader = new Scanner(System.in);
        this.a = reader.nextInt();
    }

    public int getB() {
        return b;
    }

    public void setB() {
        System.out.println ("input a numbers");
        Scanner reader = new Scanner(System.in);
        this.b = reader.nextInt();
    }

    public int getC() {
        return c;
    }

    public void setC() {
        System.out.println ("input a numbers");
        Scanner reader = new Scanner(System.in);
        this.c = reader.nextInt();
    }

    int compare(){
        max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }
}
