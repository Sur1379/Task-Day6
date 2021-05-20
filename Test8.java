package com.company.TaskDay6;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input natural number exact power of 2");
        int inputNum = scanner.nextInt();
        int n = 0;
        int i = 0;
        int count = 1;
        while (inputNum <= 0) {
            System.out.println("Input valid (natural) number");
            inputNum = scanner.nextInt();
            count = count + 1;
        }
        while (true) {

            if (inputNum == Math.pow(2, n)) {
                int b = (int) Math.pow(2, n);
                System.out.println(b + " number is the exact power of 2");
                System.out.println(count);
                break;
            }
            while (Math.pow(2, n) > inputNum) {
                n = 0;
                System.out.println("Input natural number exact power 2");
                inputNum = scanner.nextInt();
                count = count + 1;
            }
            n++;
        }
    }
}





