package com.xzinoviou.tdd.domain;

/** @author xzinoviou created 27/8/19 */
public class Bank {

  Money reduce(Expression source, String to) {
    return source.reduce(to);
  }
}
