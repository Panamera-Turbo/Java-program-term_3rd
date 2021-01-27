package MyClass;

import Product.Product;

public class three_dConsumer extends Consumer {
    private static final int NUMBER = 1;
    public three_dConsumer(String name, int number) {
        super(name, number);
    }
    @Override
    public void Consume(Product product,store store) {
        System.out.println("name of what you buy:"+product.getName());
        System.out.println("number of waht you buy:"+NUMBER);
        store.Outthree_dProducts(product);
        store.GetVolume();
    }
    public static int getNUMBER(){
        return NUMBER;
    }
}
