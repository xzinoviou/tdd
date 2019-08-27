package com.xzinoviou.tdd.domain;

/** @author xzinoviou created 26/8/19 */
abstract class Money {

  protected int amount;

  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public boolean equals(Object o) {
    Money money = (Money) o;
    return getClass().equals(money.getClass()) && amount == money.amount;
  }

  static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }

  abstract Money times(int multiplier);

  String currency() {
    return currency;
  }
}
