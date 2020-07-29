package javacore.buoi02.com;

import java.util.Scanner;

public class activity24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dau tien");
        int a = sc.nextInt();
        System.out.println("nhap so thu hai");
        int b = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= b; i++) {
            s = s + a;
        }
        System.out.println("tong la:" + s);
    }
}
