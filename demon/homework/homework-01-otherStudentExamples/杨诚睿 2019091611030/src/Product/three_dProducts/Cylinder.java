package Product.three_dProducts;


import Product.Product;

public class Cylinder extends three_dProducts {
    static final double PI = 3.14;
    private double radius;
    private double height;
    public Cylinder(String name,int number,double r,double h){
        super(name,number);
        this.radius = r;
        this.height = h;
    }

    @Override
    public double Volume() {
        return PI*radius*radius*height;
    }

    @Override
    public void display(Product product) {
        super.display(this);
    }
}
