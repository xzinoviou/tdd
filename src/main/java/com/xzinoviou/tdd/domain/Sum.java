package com.xzinoviou.tdd.domain;

/** @author xzinoviou created 28/8/19 */
public class Sum implements Expression {
  Money augend;
  Money addend;

  public Sum(Money augend, Money addend) {
    this.augend = augend;
    this.addend = addend;
  }

  public Money reduce(String to) {
    int amount = augend.amount + addend.amount;
    return new Money(amount, to);
  }
}