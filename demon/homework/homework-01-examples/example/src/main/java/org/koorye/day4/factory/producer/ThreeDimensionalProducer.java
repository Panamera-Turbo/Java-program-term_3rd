package org.koorye.day4.factory.producer;

import org.koorye.day4.entity.dimension.three.Cuboid;
import org.koorye.day4.entity.dimension.three.Cylinder;
import org.koorye.day4.entity.dimension.three.Sphere;
import org.koorye.day4.enumerate.ProductType;
import org.koorye.day4.exception.producer.ProductNotPairException;
import org.koorye.day4.factory.FactoryImpl;

/**
 * @author Koorye
 * @title 三维产品生产者
 */
public class ThreeDimensionalProducer extends AbstractProducer {

  public ThreeDimensionalProducer(FactoryImpl store, long id) {
    super(store, id);
  }

  @Override
  public synchronized void build(ProductType productType, double... args) throws ProductNotPairException {
    if (productType.equals(ProductType.CUBOID)) {
      Cuboid cuboid = new Cuboid().setLength(args[0]).setWidth(args[1]).setHeight(args[2]);
      cuboid.setId(getTotalIdAndIncrease());
      getStore().save(cuboid);
    } else if (productType.equals(ProductType.CYLINDER)) {
      Cylinder cylinder = new Cylinder().setRadius(args[0]).setHeight(args[1]);
      cylinder.setId(getTotalIdAndIncrease());
      getStore().save(cylinder);
    } else if (productType.equals(ProductType.SPHERE)) {
      Sphere sphere = new Sphere().setRadius(args[0]);
      sphere.setId(getTotalIdAndIncrease());
      getStore().save(sphere);
    } else {
      throw new ProductNotPairException(411, "三维生产者不能生产二维产品");
    }
  }
}
