package com.example.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 양의 정수를 입력하세요 (종료하여면 'exit' 입력) : ");
            String input = scanner.next(); // string 문자 입력이라서 온건가?

            if (input.equals("exit")) { // Q. equals이 뭐지?? A. 두 개의 문자열 객체를 비교하는 메서드
                System.out.println("계산기를 종료합니다.");
                break;
            }

            int num1;

            try {
                num1 = Integer.parseInt(input);
            } catch (NumberFormatException e) { // Q. catch는 뭐지? A. 예외가 발생하면 실행되는 코드, 그대로 종료가 되지 않게 도와줌
                 System.out.println("유효한 정수를 입력하세요.");
                continue;
            }

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();

        System.out.print("사칙연산 기호를 입력하세요(+, -, *, /) : ");
        char operator = scanner.next().charAt(0);
        // charAt(0)은 문자열 첫 번째 문자를 가져옴
        // 기호가 operator의 변수가 됨

        int result = 0;
        boolean isValid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    isValid = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default: // switch에서 case안에 해당하지 않을 때 실행되는 코드
                System.out.println("올바른 연산 기호 (+, -, *, /)를 입력하세요.");
                isValid = false;
        }

        if (isValid) {
            System.out.println("결과 : " + num1 + " " + operator + " " + num2 + " = " + result);
        }

        System.out.println();
        }

    scanner.close();
    }
}
