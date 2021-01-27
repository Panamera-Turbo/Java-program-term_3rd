package MyClass;

import Product.Product;

public class store {
    public static double getLeftArea() {
        return LeftArea;
    }

    public static double getLeftVolume() {
        return LeftVolume;
    }

    private static double LeftArea = 100.0;//初始化总面积
    private static double LeftVolume = 500.0;//
    
    public void PutflatProducts(Product product){
        LeftArea = LeftArea - product.Area();
    }//放进平面产品

    public void OutflatProducts(Product product){
        LeftArea = LeftArea + product.Area() ;
    }//取出平面产品

    public void Putthree_dProducts(Product product){
        LeftVolume = LeftVolume - product.Volume();
    }//放进三维产品

    public void Outthree_dProducts(Product product){
        LeftVolume = LeftVolume + product.Volume();
    }//取出三维产品


        public void GetArea(){
            System.out.println("available area:"+LeftArea);
        }
        public void GetVolume(){
            System.out.println("available volume:"+LeftVolume);
        }


}
