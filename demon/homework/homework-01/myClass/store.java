package myClass;

import java.util.LinkedList;
import java.util.Queue;

public class store {
    public final static double S = 100.00;    //总面积
    public final static double V = 100.00;    //总体积
    public double left_S = 100.00;
    public double left_V = 100.00;     //剩余
    public int flat_num = 0;
    public int liti_num = 0;           //开始0个
    public Queue<flat> flat = new LinkedList<>();   

    public Queue<three_d> liti = new LinkedList<>();       //栈来存储
    //------------------------------------------------------
    void in(){

    }
    //------------------------------------------------------
    void out(){

    }
    //------------------------------------------------------
    double usedS()
    {//用掉的面积
        return S - left_S;
    }
    //------------------------------------------------------
    double usedV()
    {//用掉的体积
        return V - left_V;
    }
}