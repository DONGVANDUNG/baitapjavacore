package javacore.buoi01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class activity04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("hay nhap so cua ban thich vao day:");
        a = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            int result = a * i;
            System.out.println(a + "x" + i + "=" + (result));
        }


    }
}


