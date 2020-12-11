package org.koorye.day4.exception.producer;

/**
 * @author Koorye
 * @title 产品不匹配异常
 */
public class ProductNotPairException extends ProductException {

  public ProductNotPairException(int code, String message) {
    super(code, message);
  }

}
