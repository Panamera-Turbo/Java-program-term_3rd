package myClass;
// import myClass.*;

public interface flat{
    int kind = 0;    
}

//-------------------------------------------------------------------------
class rectangle implements flat, product{
    static int num;
    static double area;
    final int name = 1;

    public void process(){
        System.out.println("we have produced" + num + "new rectangle");
    }

    public void display(){
        System.out.println(this.getClass().toString());
    }
}

//--------------------------------------------------------------------------
class triangle implements flat, product{
    static int num;
    static double area;
    final int name = 2;

    public void process(){
        System.out.println("we have produced" + num + "triangle");
    }

    public void display(){
        System.out.println(this.getClass().toString());
    }
}

//---------------------------------------------------------------------------
class square implements flat, product{
    static int num;
    static double area;
    final int name = 3;

    public void process(){
        System.out.println("we have produced" + num + "new square");
    }

    public void display(){
        System.out.println(this.getClass().toString());
    }
}