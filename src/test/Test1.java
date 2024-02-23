package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출력할 단을 입력해주세요: ");
        int n = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d \n",n, i, n*i);
        }
    }
}
