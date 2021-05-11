package com.company.TaskDay6;

import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int inputNum = scanner.nextInt();
        String s = String.valueOf(inputNum);
        int i = 0;
        int sum = 0;

        while (i < s.length()) {
            sum = sum + Integer.parseInt(s.charAt(i) + "");
            i++;
        }
        System.out.println(sum);
    }
}
