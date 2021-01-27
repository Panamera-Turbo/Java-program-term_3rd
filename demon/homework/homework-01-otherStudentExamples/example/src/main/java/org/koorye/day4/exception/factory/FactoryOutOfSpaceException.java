package org.koorye.day4.exception.factory;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Koorye
 * @title 工厂空间不足异常
 */
@Getter
@Setter
public class FactoryOutOfSpaceException extends FactoryException {
  public FactoryOutOfSpaceException(int code, String message) {
    super(code, message);
  }
}
