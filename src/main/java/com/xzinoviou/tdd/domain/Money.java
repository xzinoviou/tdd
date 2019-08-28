package com.xzinoviou.tdd.domain;

/** @author xzinoviou created 26/8/19 */
class Money implements Expression{

  protected int amount;

  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public boolean equals(Object o) {
    Money money = (Money) o;
    return currency().equals(((Money) o).currency()) && amount == money.amount;
  }

  static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  String currency() {
    return currency;
  }

  Expression plus(Money addend) {
    return new Money(amount + addend.amount, currency);
  }

  @Override
  public String toString() {
    return "Money{" + "amount=" + amount + ", currency='" + currency + '\'' + '}';
  }
}
