package ru.job4j.oop;

public class Calculator {

    private static final int X = 5;

    public static int sum(int y) {
        return X + y;
    }

    public static int minus(int y) {
        return X - y;
    }

    public static void main(String[] args) {
        int resultOfSum = Calculator.sum(10);
        System.out.println(resultOfSum);

        int resultOfMinus = Calculator.minus(10);
        System.out.println(resultOfMinus);

        int resultOfDivide = new Calculator().divide(10);
        System.out.println(resultOfDivide);

        int resultOfSumAllOperation = new Calculator().sumAllOperation(10);
        System.out.println(resultOfSumAllOperation);
    }

    public int divide(int y) {
        return X / y;
    }

    public int sumAllOperation(int y) {
        int sum = sum(y);
        int minus = minus(y);
        int divide = new Calculator().divide(y);
        return sum + minus + divide;
    }
}