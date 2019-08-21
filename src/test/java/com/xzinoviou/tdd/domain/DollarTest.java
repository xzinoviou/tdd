package com.xzinoviou.tdd.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** @author xzinoviou created 21/8/19 */
public class DollarTest {

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    five.times(2);
    assertEquals(10, five.amount);
  }
}
