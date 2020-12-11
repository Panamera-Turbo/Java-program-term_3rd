package org.koorye.day4.entity.dimension.three;

import lombok.Getter;
import lombok.Setter;
import org.koorye.day4.entity.AbstractProduct;
import org.koorye.day4.enumerate.DimensionType;

/**
 * @author Koorye
 * @title 三维产品
 * type 类型
 */
@Getter
@Setter
public abstract class ThreeDimensionalAbstractProduct extends AbstractProduct {

  final private DimensionType dimensionType = DimensionType.THREE_DIMENSIONAL;

  /**
   * 获取产品体积
   *
   * @return 体积
   */
  public abstract double getVolume();

  @Override
  public void process() {
    System.out.println(String.format("[ INFO ] %s: { Volume: %f }", getClass().getSimpleName(), getVolume()));
  }

}
