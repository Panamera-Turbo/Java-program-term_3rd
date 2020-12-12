package MyClass;

import Product.three_dProducts.three_dProducts;

public class three_dThread extends Thread {
    public three_dThread(String ThreadName){
        super(ThreadName);
    }
    @Override
    public void run(){
        store store = new store();
        three_dProducts three_dProducts = new three_dProducts("3D products", 1);
        three_dProducts.process();
        three_dConsumer three_dConsumer =
                new three_dConsumer(Product.three_dProducts.three_dProducts.list.poll().getName(), 1);
        three_dConsumer.Consume(Product.three_dProducts.three_dProducts.list.poll(), store);
        three_dProducts.Build();
    }
}
