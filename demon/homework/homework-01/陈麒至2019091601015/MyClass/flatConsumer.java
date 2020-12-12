package MyClass;

import Product.Product;

public class flatConsumer extends Consumer {
    private static final int NUMBER = 1;
    //-----------------------------------------------------------
    public flatConsumer(String name, int number) {
        super(name, number);
    }
    //-----------------------------------------------------------
    @Override
    public void Consume(Product product,store store) {
        System.out.println("name of what you buy:"+product.getName());
        System.out.println("number of what you buy:"+NUMBER);
        store.OutflatProducts(product);
        store.GetArea();
    }

    //-----------------------------------------------------------
    public static int getNUMBER() {
        return NUMBER;
    }
}
