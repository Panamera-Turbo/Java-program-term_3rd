package Product.three_dProducts;


import Product.Product;

public class Sphere extends three_dProducts {
    private static final double PI = 3.14;
    private double radius;
    public Sphere(String name,int number,double r){
        super(name,number);
        this.radius = r;
    }

    @Override
    public double Volume() {
        return 4*PI*radius*radius*radius/3;
    }

    @Override
    public void display(Product product) {
        super.display(this);
    }
}
