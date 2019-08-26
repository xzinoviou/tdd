package com.xzinoviou.tdd.domain;

/** @author xzinoviou created 26/8/19 */
public class Money {

  protected int amount;

  public boolean equals(Object o) {
    return amount == ((Money) o).amount;
  }
}
