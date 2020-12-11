package org.koorye.test;

import org.junit.Test;
import org.koorye.day4.enumerate.DimensionType;
import org.koorye.day4.enumerate.ProductType;
import org.koorye.day4.exception.producer.ProductNotPairException;
import org.koorye.day4.factory.FactoryImpl;
import org.koorye.day4.factory.producer.AbstractProducer;

public class ProducerTest {

  /**
   * 产品不匹配测试
   *
   * @throws ProductNotPairException 产品不匹配
   */
  @Test
  public void producerNotPairTest() throws ProductNotPairException {
    FactoryImpl factory = FactoryImpl.getInstance();
    AbstractProducer producer = factory.createProducer(DimensionType.TWO_DIMENSIONAL);
    producer.build(ProductType.CUBOID, 10, 20, 30);
  }

}
