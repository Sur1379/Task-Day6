package com.company.TaskDay6;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input x");
        int x = scanner.nextInt();
        System.out.println("input y");
        int y = scanner.nextInt();
        System.out.println("input percent");
        int percent = scanner.nextInt();
        int year = 0;
        while (x < y) {
            x = x +  percent * x / 100;
            year++;
        }
        System.out.println(year);
    }
}
