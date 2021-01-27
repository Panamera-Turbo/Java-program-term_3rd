package org.koorye.day4.exception.producer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Koorye
 * @title 生产者异常
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductException extends Exception {

  private int code;

  private String message;

}
