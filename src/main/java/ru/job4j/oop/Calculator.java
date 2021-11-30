package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + minus(d) + divide(d) + multiply(d);
    }

    public int multiply(int a) {
        return x * a;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(10);
        int result1 = sum(6);
        int result2 = minus(2);
        int result3 = calculator.divide(2);
        int result4 = calculator.sumAllOperation(3);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}