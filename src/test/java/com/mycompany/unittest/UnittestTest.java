package com.mycompany.unittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnittestTest {

    @Test
     public void Multiplication() {
        Unittest unit = new Unittest();

        unit.Multiplication(6 , 1);

        Assertions.assertEquals(6 , unit.MultiplicationAns(unit.n1));

    }

    @Test
    public void Division() {
        Unittest unit = new Unittest();

        unit.Division(6 , 1);

        Assertions.assertEquals(6 , unit.DivisionAns(unit.n2));

    }

    @Test
    public void Total() {
        Unittest unit = new Unittest();

        unit.Total(6 , 1);

        Assertions.assertEquals(7 , unit.TotalAns(unit.n3));

    }
    @Test
    public void Minus() {
        Unittest unit = new Unittest();

        unit.Minus(6 , 1);

        Assertions.assertEquals(5 , unit.MinusAns(unit.n4));

    }

}