package com.example.project;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class CalculatorTest {

    @Test
    public void getResultOfMultiply3and4(){
        Calculator calc = new Calculator();
        int expected = 12;
        int actual = calc.multiply(3, 4);
        assertThat(actual, is(expected));
    }
    @Test
    public void getResultOfMultiply5and7(){
        Calculator calc = new Calculator();
        int expected = 35;
        int actual = calc.multiply(5, 7);
        assertThat(actual, is(expected));
    }
    @Test
    public void getResultOfDivide3and2(){
        Calculator calc = new Calculator();
        float expected = 1.5f;
        float actual = calc.divide(3,2);
        assertThat(actual, is(expected));
    }
    @Test(expected = IllegalArgumentException.class)
    public void getErrorOfIllegalArgumentWhenDivide5and0(){
        Calculator calc = new Calculator();
        calc.divide(5,0);
    }

}
