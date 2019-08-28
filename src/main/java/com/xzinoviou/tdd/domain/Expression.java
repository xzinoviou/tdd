package com.xzinoviou.tdd.domain;

/**
 * @author xzinoviou
 * created 27/8/19
 */
public interface Expression {

    Money reduce(String to);
}
