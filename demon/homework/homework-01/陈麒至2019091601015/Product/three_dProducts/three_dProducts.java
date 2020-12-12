package Product.three_dProducts;

import java.util.LinkedList;
import java.util.Queue;

import MyClass.store;
import Product.Product;

public class three_dProducts extends Product {
    private static final int NUMBER = 1;
    private double volume;
    private String name;
    private store store = new store();
    public static Queue<three_dProducts> list = new LinkedList<>();
    //-----------------------------------------------------------------------
    public double Volume(){
        return volume;
    }//计算体积
    //-----------------------------------------------------------------------
    public three_dProducts(String name,int num){
        super(name,num);
        this.name = name;
    }
    //-----------------------------------------------------------------------
    @Override
    public void process() {
        int a = 0;
        while (MyClass.store.getLeftVolume() >= 100) {
            a = (int)(1+Math.random()*(3-1+1));
            if (a == 1){
                Cuboid cuboid = new Cuboid("Cuboid",NUMBER,1.0,2.0,1.0);
                list.add(cuboid);
                store.Putthree_dProducts(cuboid);
            }
            if (a == 2){
                Cylinder cylinder = new Cylinder("Cylinder",NUMBER,1,2);
                list.add(cylinder);
                store.Putthree_dProducts(cylinder);
            }
            if (a == 3){
                Sphere sphere = new Sphere("Sphere",NUMBER,1);
                list.add(sphere);
                store.Putthree_dProducts(sphere);
            }
        }
        for (int i = 0;i<list.size();i++){
            System.out.println("initailize"+list.poll().name+"successfully");
        }
    }

    @Override
    public void display(Product product) {
        System.out.println("name:"+this.name);
        System.out.println("number:"+NUMBER);
        System.out.println("volume:"+Volume());
    }

    @Override
    public void Build() {
        if (MyClass.store.getLeftVolume() != 0) {
            Pyramid pyramid = new Pyramid("Pyramid",NUMBER,1.0,2.0,1.0);
            list.add(pyramid);
            store.Putthree_dProducts(pyramid);
            System.out.println("newly create : ---Pyramid--- : successful");
        }
        else {
            System.out.println("no enough space");
        }
    }
}
