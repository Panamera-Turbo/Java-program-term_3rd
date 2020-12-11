package org.koorye.day4.enumerate;

/**
 * @author a1311
 * @title 仓库初始值
 */

public enum FactoryInit {

  /**
   * 总面积
   */
  TOTAL_AREA(1024),

  /**
   * 总体积
   */
  TOTAL_VOLUME(2048);

  private final int value;

  FactoryInit(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

}
