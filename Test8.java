package TaskDay6;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input natural number exact power of 2");
        int inputNum = scanner.nextInt();
        int n = 0;
        int i = 0;
        while (inputNum <= 0) {
            System.out.println("Input valid (natural) number");
            inputNum = scanner.nextInt();
        }
        while (Math.pow(2, n) <= inputNum) {
            if (inputNum == Math.pow(2, n)) {
                int b = (int) Math.pow(2, n);
                System.out.println(b + " number is the exact power of 2");
                while (inputNum > Math.pow(2, i)) {
                    int a = (int) Math.pow(2, i);
                    System.out.println(a);
                    i++;
                }
                break;
            }
            n++;
            while (Math.pow(2, n) > inputNum) {
                n = 0;
                System.out.println("Input natural number exact power of 2");
                inputNum = scanner.nextInt();
            }
        }
    }
}




