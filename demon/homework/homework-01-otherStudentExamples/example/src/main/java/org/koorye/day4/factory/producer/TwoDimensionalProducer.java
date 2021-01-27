package org.koorye.day4.factory.producer;

import org.koorye.day4.entity.dimension.two.Rectangle;
import org.koorye.day4.entity.dimension.two.Trapezoid;
import org.koorye.day4.entity.dimension.two.Triangle;
import org.koorye.day4.enumerate.ProductType;
import org.koorye.day4.exception.producer.ProductNotPairException;
import org.koorye.day4.factory.FactoryImpl;

/**
 * @author Koorye
 * @title 二维产品生产者
 */
public class TwoDimensionalProducer extends AbstractProducer {

  public TwoDimensionalProducer(FactoryImpl store, long id) {
    super(store, id);
  }

  @Override
  public synchronized void build(ProductType productType, double... args) throws ProductNotPairException {
    if (productType.equals(ProductType.RECTANGLE)) {

      // 存入一个矩形
      Rectangle rectangle = new Rectangle().setLength(args[0]).setWidth(args[1]);
      rectangle.setId(getTotalIdAndIncrease());
      getStore().save(rectangle);
    } else if (productType.equals(ProductType.TRIANGLE)) {

      // 存入一个三角形
      Triangle triangle = new Triangle().setSideA(args[0]).setSideB(args[1]).setSideC(args[2]);
      triangle.setId(getTotalIdAndIncrease());
      getStore().save(triangle);
    } else if (productType.equals(ProductType.TRAPEZOID)) {

      // 存入一个梯形
      Trapezoid trapezoid = new Trapezoid().setTopLine(args[0]).setBaseLine(args[1]).setHeight(args[2]);
      trapezoid.setId(getTotalIdAndIncrease());
      getStore().save(trapezoid);
    } else {
      throw new ProductNotPairException(410, "二维生产者不能生产三维产品");
    }
  }

}
