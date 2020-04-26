package javacore.buoi03.com;

import java.util.Scanner;

public class Activity31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao  kich thuoc cua mang:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();
        }
        int result[] = new int[n];
        int newlength = 0;
        boolean exist = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < newlength; j++) {
                if (a[i] == result[j]) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                result[newlength] = a[i];
                newlength++;
            }
        }
        int[] b = new int[newlength];
        for (int i = 0; i < newlength; i++) {
            b[i] = result[i];
            System.out.print(b[i]+" ");
        }
    }


}
