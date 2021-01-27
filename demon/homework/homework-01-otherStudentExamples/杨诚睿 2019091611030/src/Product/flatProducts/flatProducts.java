package Product.flatProducts;

import java.util.LinkedList;
import java.util.Queue;

import MyClass.store;
import Product.Product;

public class flatProducts extends Product {
    private static final int NUMBER = 0;
    private double area;
    private String name;
    private store store = new store();
    
    public static Queue<flatProducts> list = new LinkedList<>();

    //-----------------------------------------------------------------------
    public flatProducts(String name, int number2){
        super(name,number2);
        this.name = name;
    }
    //-----------------------------------------------------------------------
    public double Area(){
        return area;
    }
    //-----------------------------------------------------------------------
    @Override
    public void display(Product product){
        System.out.println("name:"+this.name);
        System.out.println("number:"+NUMBER);
        System.out.println("area:"+Area());
    }//展示产品信息
    //-----------------------------------------------------------------------
    @Override
    public void Build() {
        if (MyClass.store.getLeftArea() != 0) {
           Circle circle = new Circle("Circle",NUMBER,1.0);
           list.add(circle);
           store.PutflatProducts(circle);
           System.out.println("newly craeted product ---Circle--- : ");
        }
        else {
            System.out.println("no enough space");
        }
    }//新建的一个平面产品
    //-----------------------------------------------------------------------
    @Override
    public void process() {
        int a = 0;
        while (MyClass.store.getLeftArea() >= 10) {
            a = (int)(1+Math.random()*(3-1+1));
            if (a == 1){
                Rectangle rectangle = new Rectangle("Rectangle",NUMBER,1,2);
                list.add(rectangle);
                store.PutflatProducts(rectangle);
            }
            if (a == 2){
                Trapezoid trapezoid = new Trapezoid("Trapezoid",NUMBER,1,2,1);
                list.add(trapezoid);
                store.PutflatProducts(trapezoid);
            }
            if (a == 3){
                Triangle triangle = new Triangle("Triangle",NUMBER,2,1);
                list.add(triangle);
                store.PutflatProducts(triangle);
            }
        }
        for (int i = 0;i<list.size();i++){
            System.out.println("initialize"+list.poll().name+"successfully");
        }
    }

    //-----------------------------------------------------------------------
    @Override
    public String getName() {
        return name;
    }

    //-----------------------------------------------------------------------
    @Override
    public void setName(String name) {
        this.name = name;
    }
}
