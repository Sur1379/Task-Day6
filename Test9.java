package com.company.TaskDay6;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input natural number");
        int inputNum = scanner.nextInt();
       int count = 0;
       int a = 1;
       while ( inputNum <= 0){
           System.out.println("Input natural number");
           inputNum = scanner.nextInt();
       } if (a == inputNum){
            System.out.println(count);
        }
       while (a < inputNum){
           a = a * 2;
           count++;
           if ( a == inputNum){
               System.out.println(count); break;
           } else if ( a > inputNum ) {
               System.out.println(count);
           }
       }
    }
}
