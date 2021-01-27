package org.koorye.day4.exception.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Koorye
 * @title 工厂异常
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FactoryException extends RuntimeException {

  private int code;

  private String message;

}
