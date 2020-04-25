package javacore.buoi02.com;

import java.util.Scanner;

public class activity21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ban thich la:");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 1; j <= a - 2; j++) {
            for (int k = 1; k <= a; k++) {
                if (k == 1 || k == a || k == j + 1 || k == a - j) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
        for (int z = 1; z <= a; z++) {
            System.out.print("*");
        }

    }
}