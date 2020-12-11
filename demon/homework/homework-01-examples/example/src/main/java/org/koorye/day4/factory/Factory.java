package org.koorye.day4.factory;

import org.koorye.day4.entity.AbstractProduct;
import org.koorye.day4.enumerate.DimensionType;
import org.koorye.day4.factory.consumer.AbstractConsumer;
import org.koorye.day4.factory.producer.AbstractProducer;

/**
 * @author Koorye
 * @title 仓库
 */
public interface Factory {

  /**
   * 从仓库中创建生产者
   *
   * @param dimensionType 生产者的维度类型
   * @return 生产者
   */
  AbstractProducer createProducer(DimensionType dimensionType);

  /**
   * 从仓库中创建消费者
   *
   * @param dimensionType 消费者的维度类型
   * @return 消费者
   */
  AbstractConsumer createConsumer(DimensionType dimensionType);

  /**
   * 把产品存入仓库
   *
   * @param abstractProduct 产品
   */
  void save(AbstractProduct abstractProduct);

  /**
   * 从仓库中取出产品
   *
   * @param dimensionType 产品类型
   * @return 产品
   */
  AbstractProduct getProduct(DimensionType dimensionType);

}
