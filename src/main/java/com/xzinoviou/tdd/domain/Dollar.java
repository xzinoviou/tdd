package com.xzinoviou.tdd.domain;

/** @author xzinoviou created 21/8/19 */
public class Dollar {

  int amount;

  Dollar(int amount) {
    this.amount = amount;
  }

  Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }

  @Override
  public boolean equals(Object o) {
    return amount == ((Dollar) o).amount;
  }
}
