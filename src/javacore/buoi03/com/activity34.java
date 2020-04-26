package javacore.buoi03.com;

import java.util.Scanner;

public class activity34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("nhap vao noi dung cua chuoi");
        a = sc.nextLine();
        char b[] = a.toCharArray();
        for (int i = b.length - 1; i > 0; i--) {
            System.out.print(b[i]);
        }
    }
}

