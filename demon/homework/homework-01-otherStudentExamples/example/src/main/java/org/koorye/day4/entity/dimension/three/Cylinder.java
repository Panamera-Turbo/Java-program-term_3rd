package org.koorye.day4.entity.dimension.three;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Koorye
 * @title 圆柱体
 * radius 半径
 * height 高度
 */
@Getter
@Setter
@Accessors(chain = true)
public class Cylinder extends ThreeDimensionalAbstractProduct {

  private double radius;

  private double height;


  @Override
  public double getVolume() {
    return Math.PI * Math.pow(radius, 2) * height;
  }

  @Override
  public void display() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return String.format("[ INFO ] Cylinder id: %s: { radius: %f, height: %f }", getId(), radius, height);
  }

}
