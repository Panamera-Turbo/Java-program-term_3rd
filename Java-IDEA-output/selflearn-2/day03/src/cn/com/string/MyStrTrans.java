package cn.com.string;

/**
 * @Project: selflearn-2
 * @Package: cn.com.string
 * @Author: Chen Qizhi
 * @Date: 2020/12/13  周日
 * @Time: 16:27
 **/

public class MyStrTrans {
    private String originStr, newStr;

    public String getOriginStr() {
        return originStr;
    }

    public void setOriginStr(String originStr) {
        this.originStr = originStr;
    }

    public MyStrTrans(String originStr) {
        this.originStr = originStr;
    }

    void showTrans(){
        byte[] arr = originStr.getBytes();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }

        System.out.println();
        char[] arr2 = originStr.toCharArray();
//        System.out.println(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "    ");
        }

        System.out.println("\n" + "我草泥马的憨批".replace("草泥马","***"));
    }
}
