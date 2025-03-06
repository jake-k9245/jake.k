package com.example.calculator;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.calculate(10, 7, '-');
        System.out.println("결과 : " + result1);

        int result2 = calculator.calculate(8, 4, '+');
        System.out.println("결과 : " + result2);

        System.out.println("모든 연산 결과 : " + calculator.getResults());
    }
}
