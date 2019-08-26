package com.xzinoviou.tdd.domain;

/** @author xzinoviou created 21/8/19 */
public class Dollar extends Money {

  Dollar(int amount) {
    this.amount = amount;
  }

  Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }
}
