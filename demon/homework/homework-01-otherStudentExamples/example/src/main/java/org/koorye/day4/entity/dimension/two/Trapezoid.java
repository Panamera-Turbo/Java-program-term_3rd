package org.koorye.day4.entity.dimension.two;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Koorye
 * @title 梯形
 * topLine 顶边
 * baseLine 底边
 * height 高度
 */
@Getter
@Setter
@Accessors(chain = true)
public class Trapezoid extends TwoDimensionalAbstractProduct {

  private double topLine;

  private double baseLine;

  private double height;

  @Override
  public double getArea() {
    return (topLine + baseLine) * height / 2;
  }

  @Override
  public void display() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return String.format("[ INFO ] Trapezoid id: %s: { top line: %f, base line: %f, height: %f }", getId(), topLine, baseLine, height);
  }
}
