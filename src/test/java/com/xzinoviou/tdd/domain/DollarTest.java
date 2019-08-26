package com.xzinoviou.tdd.domain;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;
import org.junit.Test;

import static org.junit.Assert.*;

/** @author xzinoviou created 21/8/19 */
public class DollarTest {

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    assertEquals(10, product.amount);
    product = five.times(3);
    assertEquals(15, product.amount);
  }

  @Test
  public void testEquality() {
    assertTrue(new Dollar(5).equals(new Dollar(5)));
    assertFalse(new Dollar(5).equals(new Dollar(6)));
  }
}
