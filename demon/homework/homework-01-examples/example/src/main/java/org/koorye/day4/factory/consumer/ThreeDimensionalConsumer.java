package org.koorye.day4.factory.consumer;

import org.koorye.day4.entity.AbstractProduct;
import org.koorye.day4.enumerate.DimensionType;
import org.koorye.day4.factory.FactoryImpl;

/**
 * @author Koorye
 * @title 三维消费者
 */
public class ThreeDimensionalConsumer extends AbstractConsumer {

  public ThreeDimensionalConsumer(FactoryImpl factory, long id) {
    super(factory, id);
  }

  @Override
  public synchronized void consume() {
    AbstractProduct product = getFactory().getProduct(DimensionType.THREE_DIMENSIONAL);
    if (product != null) {
      product.process();
      product.display();
    }
  }

}
