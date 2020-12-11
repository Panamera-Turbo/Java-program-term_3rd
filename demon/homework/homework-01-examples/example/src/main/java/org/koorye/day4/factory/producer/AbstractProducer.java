package org.koorye.day4.factory.producer;

import lombok.Getter;
import org.koorye.day4.enumerate.ProductType;
import org.koorye.day4.exception.producer.ProductNotPairException;
import org.koorye.day4.factory.FactoryImpl;

/**
 * @author Koorye
 * @title 生产者抽象类
 * id 生产者编号
 * innerProductId 内部产品编号
 */
@Getter
public abstract class AbstractProducer {

  private final long id;

  private long innerProductId;

  final private FactoryImpl store;

  protected AbstractProducer(FactoryImpl store, long id) {
    this.store = store;
    this.id = id;
  }

  protected synchronized String getTotalIdAndIncrease() {
    String totalId = String.format("%d_%d", id, innerProductId);
    ++innerProductId;
    return totalId;
  }

  /**
   * 建造产品
   *
   * @param productType 产品类型
   * @param args        产品参数
   * @throws ProductNotPairException 产品不匹配
   */
  public abstract void build(ProductType productType, double... args) throws ProductNotPairException;

  @Override
  public String toString() {
    return String.format("[ INFO ] Producer: { id: %d, inner product id: %d}", id, innerProductId);
  }
}
