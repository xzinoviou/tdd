package com.xzinoviou.tdd.domain;

/** @author xzinoviou created 21/8/19 */
public class Dollar {

  int amount;

  Dollar(int amount) {
    this.amount = amount;
  }

  void times(int multiplier) {
    amount *= multiplier;
  }
}
