package com.company.TaskDay6;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive number");
        int inputNum = scanner.nextInt();
        if (inputNum < 0) {
            System.out.println("Invalid number");
        }           while (inputNum >= 0) {
            System.out.println(inputNum);
            inputNum--;
        }
    }
}