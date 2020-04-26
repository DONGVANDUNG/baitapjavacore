package javacore.buoi03.com;

import java.util.Scanner;

public class activity33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao kich thuoc cua mang:");
        int n = sc.nextInt();
        System.out.println("nhap vao cac phan tu cua mang:");
        int[] a = new int[n];
        int max = a[0];
        for (int i = 0; i < n - 1; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("phan tu lon nhat cua mang la:" + max);
        int max1 = 0;
        for (int j = 0; j < n - 1; j++) {
            if (a[j] < max && a[j] > max1) {
                max1 = a[j];
            }
        }
        System.out.println("phan tu lon thu hai cua mang la:" + max1);
        int min = a[0];
        for (int k = 0; k < n - 1; k++) {
            min = a[0];
            if (a[k] < min) {
                min = a[k];
            }

        }
        System.out.println("phan tu nho nhat cua mang la:" + min);
        int min1 = a[0];
        for (int m = 0; m < n - 1; m++) {
            min1 = a[0];
            if (a[m] > min1 && a[m] < max && a[m] < max1) {
                a[m] = min1;
            }
        }
        System.out.println("phan tu nho thu hai cua mang la:" + min1);

    }
}