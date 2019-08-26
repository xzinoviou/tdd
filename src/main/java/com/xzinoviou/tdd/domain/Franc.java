package com.xzinoviou.tdd.domain;

/** @author xzinoviou created 26/8/19 */
public class Franc {

  private int amount;

  Franc(int amount) {
    this.amount = amount;
  }

  Franc times(int multiplier) {
    return new Franc(amount * multiplier);
  }

  @Override
  public boolean equals(Object o) {
    return amount == ((Franc) o).amount;
  }
}
