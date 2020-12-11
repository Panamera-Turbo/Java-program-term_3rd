package org.koorye.day4.factory;

import lombok.Getter;
import org.koorye.day4.entity.AbstractProduct;
import org.koorye.day4.entity.dimension.three.ThreeDimensionalAbstractProduct;
import org.koorye.day4.entity.dimension.two.TwoDimensionalAbstractProduct;
import org.koorye.day4.enumerate.DimensionType;
import org.koorye.day4.enumerate.FactoryInit;
import org.koorye.day4.exception.factory.CreateConsumerFailException;
import org.koorye.day4.exception.factory.CreateProducerFailException;
import org.koorye.day4.exception.factory.FactoryEmptyException;
import org.koorye.day4.exception.factory.FactoryOutOfSpaceException;
import org.koorye.day4.factory.consumer.AbstractConsumer;
import org.koorye.day4.factory.consumer.ThreeDimensionalConsumer;
import org.koorye.day4.factory.consumer.TwoDimensionalConsumer;
import org.koorye.day4.factory.producer.AbstractProducer;
import org.koorye.day4.factory.producer.ThreeDimensionalProducer;
import org.koorye.day4.factory.producer.TwoDimensionalProducer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Koorye
 * @title 仓库实现类
 * totalArea 总面积
 * totalVolume 总体积
 * restArea 剩余面积
 * restVolume 剩余体积
 * twoDimensionalProductQueue 二维产品队列
 * threeDimensionalProductQueue 三维产品队列
 */
@Getter
public enum FactoryImpl implements Factory {

  /**
   * 工厂单例
   */
  INSTANCE;

  private static long producerId = 0;

  private static long consumerId = 0;

  private final double totalArea;

  private final double totalVolume;

  private double restArea;

  private double restVolume;

  Queue<TwoDimensionalAbstractProduct> twoDimensionalProductQueue = new LinkedList<>();

  Queue<ThreeDimensionalAbstractProduct> threeDimensionalProductQueue = new LinkedList<>();

  FactoryImpl() {
    totalArea = FactoryInit.TOTAL_AREA.getValue();
    totalVolume = FactoryInit.TOTAL_VOLUME.getValue();

    this.restArea = totalArea;
    this.restVolume = totalVolume;
  }

  public static FactoryImpl getInstance() {
    return INSTANCE;
  }

  private long getProducerIdAndIncrease() {
    long temp = producerId;
    ++producerId;
    return temp;
  }

  private long getConsumerIdAndIncrease() {
    long temp = consumerId;
    ++consumerId;
    return temp;
  }

  @Override
  public AbstractProducer createProducer(DimensionType dimensionType) {
    if (dimensionType.equals(DimensionType.TWO_DIMENSIONAL)) {
      return new TwoDimensionalProducer(this, getProducerIdAndIncrease());
    } else if (dimensionType.equals(DimensionType.THREE_DIMENSIONAL)) {
      return new ThreeDimensionalProducer(this, getProducerIdAndIncrease());
    } else {
      throw new CreateProducerFailException(500, "生产者创建失败");
    }
  }

  @Override
  public AbstractConsumer createConsumer(DimensionType dimensionType) {
    if (dimensionType.equals(DimensionType.TWO_DIMENSIONAL)) {
      return new TwoDimensionalConsumer(this, getConsumerIdAndIncrease());
    } else if (dimensionType.equals(DimensionType.THREE_DIMENSIONAL)) {
      return new ThreeDimensionalConsumer(this, getConsumerIdAndIncrease());
    } else {
      throw new CreateConsumerFailException(501, "消费者创建失败");
    }
  }

  /**
   * 存储产品到队列中
   *
   * @param product 产品
   */
  @Override
  public void save(AbstractProduct product) {

    // 如果是二维产品
    if (product instanceof TwoDimensionalAbstractProduct) {

      // 如果仓库空间不足
      if (restArea <= ((TwoDimensionalAbstractProduct) product).getArea()) {
        throw new FactoryOutOfSpaceException(401, "仓库面积不足");
      } else {
        twoDimensionalProductQueue.offer((TwoDimensionalAbstractProduct) product);
        restArea -= ((TwoDimensionalAbstractProduct) product).getArea();
      }
    } else if (product instanceof ThreeDimensionalAbstractProduct) {

      // 如果仓库空间不足
      if (restVolume <= ((ThreeDimensionalAbstractProduct) product).getVolume()) {
        throw new FactoryOutOfSpaceException(402, "仓库体积不足");
      } else {
        threeDimensionalProductQueue.offer((ThreeDimensionalAbstractProduct) product);
        restVolume -= ((ThreeDimensionalAbstractProduct) product).getVolume();
      }
    }
  }

  @Override
  public AbstractProduct getProduct(DimensionType dimensionType) {

    // 如果是二维产品
    if (dimensionType.equals(DimensionType.TWO_DIMENSIONAL)) {

      // 如果二维产品队列为空
      if (twoDimensionalProductQueue.isEmpty()) {
        throw new FactoryEmptyException(403, "二维产品队列为空");
      } else {
        return twoDimensionalProductQueue.poll();
      }
    } else if (dimensionType.equals(DimensionType.THREE_DIMENSIONAL)) {

      // 如果三维产品队列为空
      if (threeDimensionalProductQueue.isEmpty()) {
        throw new FactoryEmptyException(404, "三维产品队列为空");
      } else {
        return threeDimensionalProductQueue.poll();
      }
    }
    return null;
  }

}
