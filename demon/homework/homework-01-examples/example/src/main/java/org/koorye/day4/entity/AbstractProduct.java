package org.koorye.day4.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Koorye
 * @title 产品
 * producerName 生产者名称
 * id 产品编号
 */
@Getter
@Setter
public abstract class AbstractProduct {

  private String producerName;

  private String id;

  /**
   * 执行产品方法
   */
  abstract public void process();

  /**
   * 显示产品信息
   */
  abstract public void display();

}
