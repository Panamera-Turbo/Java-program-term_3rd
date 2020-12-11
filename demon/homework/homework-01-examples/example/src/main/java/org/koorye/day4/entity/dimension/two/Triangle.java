package org.koorye.day4.entity.dimension.two;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Koorye
 * @title 三角形
 * sideA/B/C 三边
 */
@Getter
@Setter
@Accessors(chain = true)
public class Triangle extends TwoDimensionalAbstractProduct {

  private double sideA;

  private double sideB;

  private double sideC;

  @Override
  public double getArea() {
    double p = (sideA + sideB + sideC) / 2;
    return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
  }

  @Override
  public void display() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return String.format("[ INFO ] Triangle id: %s: { a: %f, b: %f, c: %f }", getId(), sideA, sideB, sideC);
  }

}
