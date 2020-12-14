package cn.com.string;

/**
 * @Project: selflearn-2
 * @Package: cn.com.string
 * @Author: Chen Qizhi
 * @Date: 2020/12/12  周六
 * @Time: 21:20
 **/

public class MyString {
    public static void main(String[] args) {
        MyStr1 myString1 = new MyStr1();
        myString1.compareStrABC();
        myString1.showExamples();

        MySubstring mySubstring = new MySubstring("hello,world");
        mySubstring.getSubstr1(3, 7);

        MyStrTrans myStrTrans = new MyStrTrans("no way");
        myStrTrans.showTrans();
    }
}
