package com.xzinoviou.tdd.domain;

/** @author xzinoviou created 21/8/19 */
public class Dollar extends Money {

  Dollar(int amount, String currency) {
    super(amount, currency);
  }

  Money times(int multiplier) {
    return Money.dollar(amount * multiplier);
  }

  public String currency() {
    return currency;
  }
}
