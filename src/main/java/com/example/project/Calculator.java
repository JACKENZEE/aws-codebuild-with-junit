package com.example.project;

public class Calculator {

    /**
     * Multiply two arguments
     *
     * @param x first argument
     * @param y second argument
     * @return the result of x by y
     */
    public int multiply(int x, int y) {
        return x*y;
    }

    /**
     * Divide two arguments
     *
     * @param x first argument
     * @param y second argument
     * @return the result of x divided by y
     */
    public float divide(int x, int y){
        if (y == 0) throw new IllegalArgumentException("divide by zero.");
        return (float) x / (float) y;
    }

}

