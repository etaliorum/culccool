package com.zyu;

public class Calculator {
    String operation;
    float operand1;
    float operand2;

    public Calculator(String run) {
        System.out.println(run);
    }

    public float plus(float operand1, float operand2){

        return operand1 + operand2;
    }

    public float minus(float operand1, float operand2){

        return operand1 - operand2;
    }

    public float div(float operand1, float operand2){

        return operand1 / operand2;
    }

    public float multiplie(float operand1, float operand2) {

        return operand1 * operand2;
    }

}
