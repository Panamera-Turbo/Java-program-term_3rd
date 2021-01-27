package org.koorye.day4.exception.factory;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Koorye
 * @title 工厂为空异常
 */
@Getter
@Setter
public class FactoryEmptyException extends FactoryException {

  public FactoryEmptyException(int code, String message) {
    super(code, message);
  }

}
