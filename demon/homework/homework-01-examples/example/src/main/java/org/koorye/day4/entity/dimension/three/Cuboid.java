package org.koorye.day4.entity.dimension.three;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Koorye
 * @title 长方体
 * length 长度
 * width 宽度
 * height 高度
 */
@Getter
@Setter
@Accessors(chain = true)
public class Cuboid extends ThreeDimensionalAbstractProduct {

  private double length;

  private double width;

  private double height;

  @Override
  public double getVolume() {
    return length * width * height;
  }

  @Override
  public void display() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return String.format("[ INFO ] Cuboid id: %s: { length: %f, width: %f, height: %f }", getId(), length, width, height);
  }

}
