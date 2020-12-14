/**
 * @Project: selflearn-2
 * @Package: PACKAGE_NAME
 * @Author: Chen Qizhi
 * @Date: 2020/12/11  周五
 * @Time: 21:38
 **/

/*
    Scanner:
    实现输入

 */

package cn.com.uestc;

import java.util.Scanner;

public class LearnScanner {
    private int num ;
    private String str;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void in(){
        System.out.print("Input a number（int）：");
        Scanner reader = new Scanner(System.in);
        num = reader.nextInt();
        System.out.println(num);

        System.out.print("Input a string：");
        reader = new Scanner(System.in);
        str = reader.next();
        System.out.println(str);
    }
}
