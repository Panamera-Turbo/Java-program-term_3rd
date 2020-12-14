package cn.com.string;

/**
 * @Project: selflearn-2
 * @Package: cn.com.string
 * @Author: Chen Qizhi
 * @Date: 2020/12/12  周六
 * @Time: 21:21
 **/

public class MyStr1 {
    private String str1, str2, str3;

    //setter & getter
    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public String getStr3() {
        return str3;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }

    //------------------------------------------
    void compareStrABC(){
        str1 = "abc";
        str2 = "abc";

        char[] abcArr = {'a', 'b', 'c'};
        str3 = new String(abcArr);

        System.out.println("str1==str2?" + (str1 == str2));
        System.out.println("str1==str3?" + (str1 == str3));
        System.out.println("str2==str3?" + (str3 == str2));
    }

    void showExamples(){
        //拼接
        str1 = "hello";
        str2 = "world";
        str3 = str1.concat(str2);

        System.out.println("concat result:");
        System.out.println(str1);
        System.out.println(str3);

        System.out.println();
        System.out.println("charAt result");
        System.out.println("str1的3号位置是" + str1.charAt(3));

        System.out.println();
        System.out.println("indexOf result:");
        System.out.println("第一次索引值是：" + str1.indexOf("llo"));
    }
}
