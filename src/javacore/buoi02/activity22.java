package javacore.buoi02.com;

import java.util.Scanner;

public class activity22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a ban muon");
        int a = sc.nextInt();
        for (int i = 1; i < a; i++) {
            for (int j = 1; j <= a - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i * 2 - 1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}

