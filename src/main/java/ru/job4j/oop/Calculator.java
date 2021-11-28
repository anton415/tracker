package ru.job4j.oop;

public class Calculator {

    private static final int X = 5;

    public static int sum(int y) {
        return X + y;
    }

    public static int minus(int y) {
        return y - X;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int resultOfSum = Calculator.sum(10);
        System.out.println(resultOfSum);

        int resultOfMinus = Calculator.minus(10);
        System.out.println(resultOfMinus);

        int resultOfDivide = calculator.divide(10);
        System.out.println(resultOfDivide);

        int resultOfSumAllOperation = calculator.sumAllOperation(10);
        System.out.println(resultOfSumAllOperation);
    }

    public int divide(int y) {
        return y / X;
    }

    public int multiply(int y) {
        return X * y;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y) + multiply(y);
    }
}