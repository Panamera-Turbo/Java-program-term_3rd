package myClass;
import myClass.*;

public class flat extends producer{
    int kind = 0;    
}

//-------------------------------------------------------------------------
class rectangle extends flat
{//矩形类
    private int num;

    public void process(int x) {
        this.num = x;
        System.out.println("we have produced" + this.num + "new rectangle");
    }

    public void display(){
        System.out.println(this.getClass().toString());
    }
}

//--------------------------------------------------------------------------
class triangle extends flat
{//三角形类
    private int num;
    double area;

    public void process(int x){
        this.num = x;
        System.out.println("we have produced" + this.num + "triangle");
    }

    public void display(){
        System.out.println(this.getClass().toString());
    }
}

//---------------------------------------------------------------------------
class square extends flat
{//圆形类
    private int num;
    double area;

    public void process(int x){
        this.num = x;
        System.out.println("we have produced" + this.num + "new square");
    }

    public void display(){
        System.out.println(this.getClass().toString());
    }
}