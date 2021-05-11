package com.company.TaskDay6;

public class Test15 {
    public static void main(String[] args) {
        int a = 7, b = 1, c = 8, d = 9, e = 0;
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (max < d) {
            max = d;
        }
        if (max < e) {
            max = e;
        }

        int mid = max;
        if (max - a < mid && max - a != 0) {
            mid = max - a;
        }
            if (max - b < mid && max - b != 0) {
                mid = max - b;
            }
            if (max - c < mid && max - c != 0) {
                mid = max - c;
            }
            if (max - d < mid && max - d != 0) {
                mid = max - d;
            }
            System.out.println(max - mid);

        }
    }
