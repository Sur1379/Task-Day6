package com.company.TaskDay6;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int N = scanner.nextInt();
        int num = 3;
        System.out.print("Multiple of 3` ");
        while(num <= N){
            while (num % 3 != 0){
                num++;
            }
            if(num % 3 == 0){
                System.out.print(num + " ");
                num++;
            }
        }
    }
}
