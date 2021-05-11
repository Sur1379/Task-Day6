package com.company.TaskDay6;

import java.util.Random;
import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number");
        Random random = new Random();
        int N = random.nextInt(19) + 1;
        int inputNum = scanner.nextInt();
        while (inputNum != N){
            if(inputNum > N){
                System.out.println("Too high, try again");
                inputNum = scanner.nextInt();
                continue;
            }
            if(inputNum < N){
                System.out.println("Too low, try again");
                inputNum = scanner.nextInt();
                continue;
            }
        }
        if (inputNum == N){
            System.out.println("Yes, you guessed the number");
        }
    }
}
