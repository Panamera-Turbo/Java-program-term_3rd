package Product.flatProducts;

import Product.Product;

public class Circle extends flatProducts {
    private static double PI = 3.14;
    private double radius;
    public Circle(String name,int number,double radius){
        super(name,number);
        this.radius = radius;
    }

    @Override
    public double Area() {
        return PI*radius*radius;
    }
    
    @Override
    public void display(Product product) {
        super.display(this);
    }
}
