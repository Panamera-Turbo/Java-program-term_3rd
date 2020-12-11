package MyClass;

import Product.flatProducts.flatProducts;
import Product.Product;
import Product.three_dProducts.three_dProducts;

public abstract class Consumer {
    private String name;        //消费者的名字
    private int number;      //消费者编号

    //-----------------------------------------------------------
    public Consumer(String name,int number){
        this.name = name;
        this.number = number;
    }
    //-----------------------------------------------------------
    public void Consume(Product product,store store){}
}
