package com.company.TaskDay6;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input x");
        float x = scanner.nextFloat();
        System.out.println("input y");
        int y = scanner.nextInt();
        int day = 1;
        while (x < y) {
            x = x + x / 10;
            day++;
        }
        System.out.println(day);
    }
}
