package org.koorye.day4.entity.dimension.two;

import lombok.Getter;
import lombok.Setter;
import org.koorye.day4.entity.AbstractProduct;
import org.koorye.day4.enumerate.DimensionType;

/**
 * @author Koorye
 * @title 二维产品
 * type 产品类型
 */
@Getter
@Setter
public abstract class TwoDimensionalAbstractProduct extends AbstractProduct {

  final private DimensionType dimensionType = DimensionType.TWO_DIMENSIONAL;

  /**
   * 获取产品面积
   *
   * @return 面积
   */
  public abstract double getArea();

  @Override
  public void process() {
    System.out.println(String.format("[ INFO ] %s: { area: %f }", getClass().getSimpleName(), getArea()));
  }

}
