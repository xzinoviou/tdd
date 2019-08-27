package com.xzinoviou.tdd.domain;

/** @author xzinoviou created 26/8/19 */
public class Franc extends Money {

  Franc(int amount, String currency) {
    super(amount, currency);
  }

  Money times(int multiplier) {
    return Money.franc(amount * multiplier);
  }

  public String currency() {
    return currency;
  }
}
