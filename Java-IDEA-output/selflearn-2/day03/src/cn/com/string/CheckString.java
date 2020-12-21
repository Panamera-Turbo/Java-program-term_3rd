package cn.com.string;

import java.security.PrivateKey;
import java.util.Scanner;

/**
 * @Project: selflearn-2
 * @Package: cn.com.string
 * @Author: Chen Qizhi
 * @Date: 2020/12/18  周五
 * @Time: 22:52
 **/

/*
    输入字符串，判断各个类型出现的次数
    类型：大写字母，小写字母，数字，其他
 */
public class CheckString {
    private String inputStr;
    private int a,b,c,d;

    public String getInputStr() {
        return inputStr;
    }

    void setInputStr() {
        Scanner sc = new Scanner(System.in);
        this.inputStr = sc.toString();
        System.out.println("Input a string");

        int countLow = 0;
        int countUp = 0;
        int countNum = 0;
        int countElse = 0;

        char[] charArray = inputStr.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if('A' <= ch && ch <= 'Z') countUp++;
            else if('a' <= ch && ch <= 'z') countLow++;
            else if('0' <= ch && ch <= '9') countNum++;
            else countElse++;
        }
//        System.out.println();
    }
}
