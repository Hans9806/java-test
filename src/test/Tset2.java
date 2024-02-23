package test;

import java.util.Scanner;

public class Tset2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int a = scanner.nextInt();

        System.out.print("두번째 숫자를 입력하세요: ");
        int b = scanner.nextInt();

        System.out.print("연산자를 입력하세요: ");
        String op = scanner.next();

        double result = 0;

        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }else {
                    result = a / b;
                }break;
            default:
                System.out.println("잘못된 연산자를 입력하였습니다.");
        }
        System.out.println("결과 "+ result);
    }
}
