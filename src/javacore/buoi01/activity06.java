package javacore.buoi01.com;

import java.util.Scanner;

public class activity06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("nhap so a la:");
        a = sc.nextInt();
        int b;
        System.out.println("nhap so b la:");
        b = sc.nextInt();
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "x" + b + "=" + (a * b));
        System.out.println(a + "/" + b + "=" + (a / b));
        System.out.println(a + "mod" + b + "=" + (a % b));

    }
}
