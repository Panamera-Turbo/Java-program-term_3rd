package Product;

public abstract class Product
{
    public String getName()
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    private String name;    //生产者的名字
    private int number;     //产品编号
    private double area;    //面积
    private double volume;  //体积
    //-----------------------------------------------------------------------
    public Product(String name,int num)
    {//构造函数
        this.name = name;
        this.number = num;
    }
    //-----------------------------------------------------------------------
    public double Area()
    {//获取面积
        return area;
    }
    //-----------------------------------------------------------------------
    public double Volume()
    {//获取体积
        return volume;
    }
    //-----------------------------------------------------------------------
    public void process(){}
    public void display(Product product){} //展示产品
    public void Build(){}                  //新建产品
}