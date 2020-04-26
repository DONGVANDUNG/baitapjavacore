package javacore.buoi03.com;

import java.util.Scanner;

public class activity33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao kich thuoc cua mang:");
        int n = sc.nextInt();
        System.out.println("nhap vao cac phan tu cua mang:");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int indexmax1 = -1;
        int indexmax2 = -1;
        int indexmin1 = -1;
        int indexmin2 = -2;
        for (int i = 0; i < n; i++) {
            if (a[i] > max1) {
                max1 = a[i];
                indexmax1 = i;
                System.out.println("phan tu lon nhat cua mang la:  o dong thu" + max1 + " " + indexmax1);
            }
            if (a[i] > max1 && a[i] < max2) {
                max2 = a[i];
                indexmax2 = i;
                System.out.println("pahn tu lon thu hai cua mang la:  o dong thu" + max2 + " " + indexmax2);

                System.out.println("khong co phan tu lon thu hai");
            } else if (indexmin1 == -1) {
                System.out.println("khong co phan tu nho nhat");
            } else if (indexmax1 == -1) {
                System.out.println("khong co phan tu lon nhat");
            }
            for (int k = 0; k < n; k++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] > a[j]) {
                        int temp = a[k];
                        a[k] = a[j];
                        a[j] = temp;
                    }
                    System.out.print("mang sap xeo theo thu tu tang dan la: " + a[k]);
                }

            }

        }
    }
}
