package Product.three_dProducts;

import Product.Product;

public class Cuboid extends three_dProducts {
    private double length;
    private double width;
    private double height;
    public Cuboid(String name,int number,double l,double w,double h){
        super(name,number);
        this.length = l;
        this.width = w;
        this.height = h;
    }
    @Override
    public double Volume() {
        return length*width*height;
    }

    @Override
    public void display(Product product) {
        super.display(this);
    }
}
