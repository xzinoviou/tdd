package com.xzinoviou.tdd.domain;

/** @author xzinoviou created 26/8/19 */
public class Money {

  protected int amount;

  public boolean equals(Object o) {
    Money money = (Money) o;
    return getClass().equals(money.getClass()) && amount == money.amount;
  }
}
