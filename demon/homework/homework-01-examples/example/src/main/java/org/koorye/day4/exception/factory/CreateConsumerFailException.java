package org.koorye.day4.exception.factory;

/**
 * @author Koorye
 * @title 创建消费者失败异常
 */
public class CreateConsumerFailException extends FactoryException {

  public CreateConsumerFailException(int code, String message) {
    super(code, message);
  }

}
