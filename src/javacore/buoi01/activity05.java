package javacore.buoi01;

import java.util.Scanner;

public class activity05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap vao gia tri cua n la:");
        n = sc.nextInt();
        System.out.println(n + "+" + n + n + "+" + n + n + n + "=" + (n * (1 + 11 + 111)));
    }
}
