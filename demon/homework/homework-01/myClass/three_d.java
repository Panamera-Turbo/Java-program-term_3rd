package myClass;
// import myClass.product;

public interface three_d {
    int kind = 1;   
}

//-----------------------------------------------------------------------
class cuboid implements three_d, product {
    static int num;
    static double volumn;
    final int name = 1;

    public void process(){
        System.out.println("we have produced" + num + "new cuboid");
    }

    public void display(){
        System.out.println(this.getClass().toString());
    }
}

//------------------------------------------------------------------------
class cylinder implements three_d, product {
    static int num;
    static double volumn;
    final int name = 2;

    public void process(){
        System.out.println("we have produced" + num + "new cylinder");
    }

    public void display(){
        System.out.println(this.getClass().toString());
    }
}

//-------------------------------------------------------------------------
class ball implements three_d, product {
    static int num;
    static double volumn;
    final int name = 3;

    public void process(){
        System.out.println("we have produced" + num + "new ball");
    }

    public void display(){
        System.out.println(this.getClass().toString());
    }
}
