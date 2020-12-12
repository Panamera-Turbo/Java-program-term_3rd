package Product.flatProducts;

import Product.Product;

public class Trapezoid extends flatProducts {
    private double upBase;
    private double downBase;
    private double height;
    public Trapezoid(String name,int number,double up,double down,double h){
        super(name,number);
        this.upBase = up;
        this.downBase = down;
        this.height = h;
    }

    @Override
    public double Area() {
        return (upBase+downBase)*height*0.5;
    }

    @Override
    public void display(Product product) {
        super.display(this);
    }
}
