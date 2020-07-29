package javacore.buoi01.com;

import java.util.Scanner;

public class activity03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("nhap so a la:");
        a = sc.nextInt();
        System.out.println("nhap so b la:");
        b = sc.nextInt();
        System.out.println("tong cua a va b la:" + (a + b));
        System.out.println("tich cua hai so a va b la:" + (a * b));
    }
}
