package org.koorye.day4.factory.consumer;

import lombok.Getter;
import org.koorye.day4.factory.FactoryImpl;

/**
 * @author Koorye
 * @title 消费者抽象类
 */
@Getter
public abstract class AbstractConsumer {

  private final long id;

  private final FactoryImpl factory;

  public AbstractConsumer(FactoryImpl factory, long id) {
    this.id = id;
    this.factory = factory;
  }

  /**
   * 消费产品
   */
  public abstract void consume();

}
