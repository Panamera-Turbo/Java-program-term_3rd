package org.koorye.day4.entity.dimension.three;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Koorye
 * @title 球体
 * radius 半径
 */
@Getter
@Setter
@Accessors(chain = true)
public class Sphere extends ThreeDimensionalAbstractProduct {

  private double radius;

  @Override
  public double getVolume() {
    return 4.0 / 3 * Math.PI * Math.pow(radius, 3);
  }

  @Override
  public void display() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return String.format("[ INFO ] Sphere id: %s: { radius: %f }", getId(), radius);
  }

}
