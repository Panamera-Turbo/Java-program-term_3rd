package org.koorye.day4;

import org.koorye.day4.enumerate.DimensionType;
import org.koorye.day4.enumerate.ProductType;
import org.koorye.day4.exception.producer.ProductNotPairException;
import org.koorye.day4.factory.consumer.AbstractConsumer;
import org.koorye.day4.factory.FactoryImpl;
import org.koorye.day4.factory.producer.AbstractProducer;
import org.koorye.day4.util.ThreadPool;

import java.util.concurrent.TimeUnit;

/**
 * @author Koorye
 * @date 2020-10-11
 */
public class Main {

  public static void main(String[] args) {

    // 通过单例模式得到工厂实例
    FactoryImpl factory = FactoryImpl.getInstance();

    // 通过工厂创建两个生产者
    AbstractProducer twoDimensionalProducer = factory.createProducer(DimensionType.TWO_DIMENSIONAL);
    AbstractProducer threeDimensionalProducer = factory.createProducer(DimensionType.THREE_DIMENSIONAL);

    // 注意到生产者的 ID 发生自增，确保生产者 ID 唯一
    System.out.println("-------------- 创建生产者 -----------------");
    System.out.println(twoDimensionalProducer);
    System.out.println(threeDimensionalProducer);

    // 建造矩形、三角形、梯形，放入工厂队列
    ThreadPool.run(() -> {
      try {
        twoDimensionalProducer.build(ProductType.RECTANGLE, 20, 10);
        twoDimensionalProducer.build(ProductType.TRIANGLE, 6, 5, 4);
        twoDimensionalProducer.build(ProductType.TRAPEZOID, 10, 15, 5);
      } catch (ProductNotPairException e) {
        e.printStackTrace();
      }
    });

    // 建造立方体、圆柱体、球体，放入工厂队列
    ThreadPool.run(() -> {
      try {
        threeDimensionalProducer.build(ProductType.CUBOID, 10, 5, 2);
        threeDimensionalProducer.build(ProductType.CYLINDER, 5, 2);
        threeDimensionalProducer.build(ProductType.SPHERE, 5);
      } catch (ProductNotPairException e) {
        e.printStackTrace();
      }
    });

    // 注意到建造后生产者的内部产品 ID 发生自增
    System.out.println(twoDimensionalProducer);
    System.out.println(threeDimensionalProducer);

    // 创造两个消费者，其 ID 仍然唯一，此处不再演示
    AbstractConsumer twoDimensionalConsumer = factory.createConsumer(DimensionType.TWO_DIMENSIONAL);
    AbstractConsumer threeDimensionalConsumer = factory.createConsumer(DimensionType.THREE_DIMENSIONAL);

    // 延时一秒
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // 分别进行消费，注意到每个产品的 ID 由生产者 ID 与内部产品 ID 组合而成，确保 ID 唯一
    System.out.println("---------------- 二维消费者进行消费 ------------------");
    ThreadPool.run(() -> {
      for (int i = 0; i < 3; ++i) {
        twoDimensionalConsumer.consume();
      }
    });

    // 延时一秒
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("---------------- 三维消费者进行消费 ------------------");
    ThreadPool.run(() -> {
      for (int i = 0; i < 3; ++i) {
        threeDimensionalConsumer.consume();
      }
    });

    // 延时一秒
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    ThreadPool.stop();
    System.out.println("------------- 结束进程 --------------");

  }

}
