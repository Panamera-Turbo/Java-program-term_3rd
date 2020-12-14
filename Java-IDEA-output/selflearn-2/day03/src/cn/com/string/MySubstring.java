package cn.com.string;

/**
 * @Project: selflearn-2
 * @Package: cn.com.string
 * @Author: Chen Qizhi
 * @Date: 2020/12/13  周日
 * @Time: 16:12
 **/

public class MySubstring {
    private String originalStr;
    private String newStr;

    public MySubstring(String originalStr) {
        this.originalStr = originalStr;
    }

    public String getOriginalStr() {
        return originalStr;
    }

    public void setOriginalStr(String originalStr) {
        this.originalStr = originalStr;
    }

    public String getNewStr() {
        return newStr;
    }

    public void setNewStr(String newStr) {
        this.newStr = newStr;
    }

    void getSubstr1(int startIndex, int endIndex){
        if(originalStr.length() < endIndex){
            System.out.println("wrongUsage");
        }
        newStr = originalStr.substring(startIndex, endIndex);
        System.out.println(newStr);
    }
}
