package TaskDay6;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int n = 0;
        while ( n == 0 ){
            System.out.println("1");
            n++;
        break;}
                while ( inputNum > n * 2 ){
            System.out.println(n * 2);
             n *= 2;
        }
    }
}
