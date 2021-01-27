package Product.three_dProducts;


import Product.Product;

public class Pyramid extends three_dProducts {
    private double BottomSurfaceBase;
    private double BottomSurfaceHeight;
    private double Height;
    public Pyramid(String name,int num,double bsb,double bsh,double h){
        super(name,num);
        this.BottomSurfaceBase = bsb;
        this.BottomSurfaceHeight = bsh;
        this.Height = h;
    }
    @Override
    public double Volume() {
        return BottomSurfaceHeight*BottomSurfaceBase*Height*0.5;
    }

    @Override
    public void display(Product product) {
        super.display(this);
    }
}
