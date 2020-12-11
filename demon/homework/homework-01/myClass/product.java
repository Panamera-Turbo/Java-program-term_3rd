package myClass;

public abstract class product {
    private String name;
    private int tag;
    private double area;
    private double volumn;
    // public int num;
    //------------------------------------------------------
    public String getName()
    {//获取产品名
        return this.name;
    }
    //------------------------------------------------------
    public void setName(String name)
    {//设置产品名
        this.name = name;
    }
    //------------------------------------------------------
    public product(String name, int tag)
    {//构造函数，设置名字编号
        this.name = name;
        this.tag = tag;
    }
    //------------------------------------------------------
    public void setArea(int area)
    {//设置面积
        this.area = area;
    }
    //------------------------------------------------------
    public void setVolum(int v)
    {//设置体积
        this.volumn = v;
    }
    //------------------------------------------------------

    public void process(){}
    public void display(){}
    public void build(){}
}