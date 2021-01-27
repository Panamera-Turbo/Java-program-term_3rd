package MyClass;

import Product.flatProducts.flatProducts;

public class flatThread extends Thread{
    public flatThread(String ThreadName){
        super(ThreadName);
    }//给线程命名
    @Override
    public void run() {
        store store = new store();
        flatProducts flatProducts = new flatProducts("flat products", 0);
        flatProducts.process();
        flatConsumer flatConsumer = new flatConsumer(Product.flatProducts.flatProducts.list.poll().getName(), 0);
        flatConsumer.Consume(Product.flatProducts.flatProducts.list.poll(), store);
        flatProducts.Build();
    }
}
