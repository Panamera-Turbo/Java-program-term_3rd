package myClass;
import myClass.*;

public class flat extends product{
    public flat(String name, int tag) {
        super(name, tag);
        // TODO Auto-generated constructor stub
    }

    final int kind = 1;
}

//-------------------------------------------------------------------------
class rectangle extends flat
{//矩形类
    private int num;
    private double lenth;
    private double width;
    double area;

    rectangle(int num, double len, double wid){
        this.num = num;
        this.width = wid;
        this.lenth = len; 
        this.area = len * wid;
    }

    public void process() {
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
    double a;
    double b;
    double c;
    double area;

    triangle(int num, double a, double b, double c){
        this.num = num;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void process(int x){
        this.num = x;
        System.out.println("we have produced" + this.num + "triangle");
    }

    public void display(){
        System.out.println(this.getClass().toString());
    }
}

//---------------------------------------------------------------------------
class circle extends flat
{//圆形类
    private int num;
    final double PI = 3.14159;
    double r;
    double area;

    circle(int num, double r){
        this.num = num;
        this.r = r;
        this.area = PI * r * r;
    }

    public void process(){
        // this.num = x;
        System.out.println("we have produced" + this.num + "new square");
    }

    public void display(){
        System.out.println(this.getClass().toString());
    }
}