package org.koorye.day4.exception.factory;

/**
 * @author Koorye
 * @title 创建生产者失败异常
 */
public class CreateProducerFailException extends FactoryException {

  public CreateProducerFailException(int code, String message) {
    super(code, message);
  }

}
