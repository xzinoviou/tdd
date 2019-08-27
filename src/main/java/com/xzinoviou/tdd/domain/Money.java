package com.xzinoviou.tdd.domain;

/** @author xzinoviou created 26/8/19 */
abstract class Money {

  protected int amount;

  public boolean equals(Object o) {
    Money money = (Money) o;
    return getClass().equals(money.getClass()) && amount == money.amount;
  }

  static Money dollar(int amount) {
    return new Dollar(amount);
  }

  static Money franc(int amount) {
    return new Franc(amount);
  }

  abstract Money times(int multiplier);
}
