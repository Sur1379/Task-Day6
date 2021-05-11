package com.company.TaskDay6;

public class Test10 {
    public static void main(String[] args) {
        char ch1 = 122;
        char ch2 = 32;
        String str1 = "";
        while ((ch2) < (ch1)) {
            ch2++;
            str1 = str1 + " " + " " + ch2;
            if (str1.length() == 30) {
                System.out.println(str1);
                str1 = "";
            }
        }
    }
}
