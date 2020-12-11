package Product.flatProducts;

import Product.Product;

public class Triangle extends flatProducts {
    private double base;
    private double height;
    public Triangle(String name,int number,double b,double h){
        super(name,number);
        this.base = b;
        this.height = h;
    }

    @Override
   public double Area() {
        return base*height*0.5;
    }

    @Override
    public void display(Product product) {
        super.display(this);
    }
}
