package TaskDay6;

import java.util.Scanner;

public class Test123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        int j = 1;
        while (j <= 20) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
            j++;
        }
        int inputNum = scanner.nextInt();
        int k = 1;
                while ( k * k < inputNum ) {
            System.out.println(k * k);
            k++;
        }

    }
}
