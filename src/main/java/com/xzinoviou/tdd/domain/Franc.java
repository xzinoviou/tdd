package com.xzinoviou.tdd.domain;

/** @author xzinoviou created 26/8/19 */
public class Franc extends Money {

  Franc(int amount) {
    this.amount = amount;
  }

  Money times(int multiplier) {
    return new Franc(amount * multiplier);
  }
}
