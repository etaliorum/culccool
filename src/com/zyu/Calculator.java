package com.zyu;

public class Calculator {
    String operation;
    float operand1;
    float operand2;

    public Calculator(String run) {
        System.out.println(run);
    }

    public float plus(float a, float b){

        return a + b;
    }

    public float minus(float a, float b){

        return a - b;
    }

    public float div(float a, float b){

        return a / b;
    }

    public float multiplie(float a, float b) {

        return a * b;
    }

}
