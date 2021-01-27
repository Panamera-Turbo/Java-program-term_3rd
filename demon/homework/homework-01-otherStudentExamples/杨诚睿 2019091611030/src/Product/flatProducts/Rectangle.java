package Product.flatProducts;

import Product.Product;

public class Rectangle extends flatProducts {
    private double length;
    private double width;
    public Rectangle(String name,int number,double l,double w){
        super(name,number);
        this.length = l;
        this.width = w;
    }
    @Override
   public double Area() {
        return length*width;
    }
    @Override
    public void display(Product product) {
        super.display(this);
    }
}
