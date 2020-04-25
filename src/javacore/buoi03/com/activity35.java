package javacore.buoi03.com;

import java.util.Scanner;

public class activity35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("nhap vap noi dung cua chuoi:");
        a = sc.nextLine();
        System.out.println("nhap vao ky tu:");
        char c;
        c = sc.next().charAt(0);
        int dem = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == c) {
                dem = dem + 1;
            }
        }
        System.out.print( "("+dem+")");
    }
}
