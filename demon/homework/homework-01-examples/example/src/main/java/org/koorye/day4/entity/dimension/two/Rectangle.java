package org.koorye.day4.entity.dimension.two;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Koorye
 * @title 矩形
 * length 长度
 * width 宽度
 */
@Getter
@Setter
@Accessors(chain = true)
public class Rectangle extends TwoDimensionalAbstractProduct {

  private double length;

  private double width;

  @Override
  public double getArea() {
    return length * width;
  }

  @Override
  public void display() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return String.format("[ INFO ] Rectangle id: %s: { length: %f, width: %f }", getId(), length, width);
  }

}
