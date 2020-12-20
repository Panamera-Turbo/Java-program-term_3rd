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

    public void setInputStr() {
        Scanner sc = new Scanner(System.in);
        this.inputStr = sc.toString();
    }
}
