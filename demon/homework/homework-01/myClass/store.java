package myClass;

import java.util.Stack;

public class store {
    public final static double S = 100.00;    //总面积
    public final static double V = 100.00;    //总体积
    public static double left_S = 100.00;
    public static double left_V = 100.00;     //剩余
    public static int flat_num = 0;
    public static int liti_num = 0;           //开始0个
    public static Stack<String> flat = new Stack<>();   
    public static Stack<String> liti = new Stack<>();       //栈来存储

    void in(){

    }

    void out(){

    }

    double total_S(){
        return S - left_S;
    }

    double total_V(){
        return V - left_V;
    }
}
