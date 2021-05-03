package TaskDay6;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int n = 2;
        while (n <= inputNum) {
            if (inputNum % n == 0){
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
