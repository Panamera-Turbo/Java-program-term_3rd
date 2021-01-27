package org.koorye.test;

import org.junit.Test;
import org.koorye.day4.enumerate.DimensionType;
import org.koorye.day4.enumerate.ProductType;
import org.koorye.day4.exception.producer.ProductNotPairException;
import org.koorye.day4.factory.consumer.AbstractConsumer;
import org.koorye.day4.factory.producer.AbstractProducer;
import org.koorye.day4.factory.FactoryImpl;

public class FactoryTest {

  /**
   * 单例模式测试 (枚举类防止反射攻击)
   */
  @Test
  public void factorySingletonTest() {
    FactoryImpl factory = FactoryImpl.getInstance();
    FactoryImpl factory2 = FactoryImpl.getInstance();
    System.out.println(factory.hashCode());
    System.out.println(factory2.hashCode());
  }

  /**
   * 工厂空间不足测试
   *
   * @throws ProductNotPairException 产品不匹配
   */
  @Test
  public void factoryOutOfSpaceTest() throws ProductNotPairException {
    FactoryImpl factory = FactoryImpl.getInstance();
    AbstractProducer producer = factory.createProducer(DimensionType.TWO_DIMENSIONAL);
    producer.build(ProductType.RECTANGLE, 50, 10);
    producer.build(ProductType.TRIANGLE, 40, 30, 20);
    producer.build(ProductType.TRAPEZOID, 20, 40, 10);
  }

  /**
   * 工厂为空测试
   *
   * @throws ProductNotPairException 产品不匹配
   */
  @Test
  public void factoryEmptyTest() throws ProductNotPairException {
    FactoryImpl factory = FactoryImpl.getInstance();
    AbstractProducer producer = factory.createProducer(DimensionType.THREE_DIMENSIONAL);
    AbstractConsumer consumer = factory.createConsumer(DimensionType.THREE_DIMENSIONAL);
    producer.build(ProductType.CUBOID, 10, 5, 2);
    consumer.consume();
    consumer.consume();
  }

}
