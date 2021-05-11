package com.company.TaskDay6;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int inputNum = scanner.nextInt();
        int k;
        int n = 2;
        int after = 1;
        int before = 1;
        while (inputNum > before) {
            k = after + before;
            after = before;
            before = k;
            n++;
        }
        if (before == inputNum && inputNum !=1) {
            System.out.println(n);
        } else
            System.out.println("-1");
    }
}

