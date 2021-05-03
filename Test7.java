package TaskDay6;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int inputNum = scanner.nextInt();
        while (inputNum % 2 == 0) {
            while (inputNum > 0) {
                System.out.println(inputNum);
                inputNum = inputNum - 2;
            }
        }
        while (inputNum % 2 == 1) {
            inputNum = inputNum - 1;
            while (inputNum > 0) {
                System.out.println(inputNum);
                inputNum = inputNum - 2;
            }
        }
    }
}
