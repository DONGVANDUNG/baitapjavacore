package javacore.buoi01;

import java.util.Scanner;

public class activity01 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap vao so a la:");
        a = sc.nextInt();
        System.out.println("moi ban nhap so b la:");
        b = sc.nextInt();
        System.out.println("tong cua a va b la:" + (a + b));
        System.out.println("hieu cua so b la:" + (a - b));
        System.out.println("tich cua a va b la:" + (a * b));
        System.out.println("thuong cua a va b la:" + (a / b));
        System.out.println("a chia cho b se co so du la:" + (a % b));


    }

}
