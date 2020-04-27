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
        int max1=a[0];
        int max2=a[0];
        for (int i = 0; i <n ; i++) {
            if(a[i]>max1){
                max1=a[i];
        }
        }
        System.out.println("phan tu lon nhat cua mang la: " +max1);
        for (int i = 0; i <n ; i++) {
            if(a[i]<max1 && a[i]>max2){
                max2=a[i];
            }
        }
        System.out.println( "phan tu lon thu hai cua mang la: "+max2);
        int min1=a[0];
         int min2=a[0];
        for (int i = 0; i <n ; i++) {
            if(a[i]<min1){
                min1=a[i];
            }
        }
        System.out.println("phan tu nho nhat cua mang la: "+min1);
        for (int i = 0; i <n ; i++) {
            if(a[i]>min1&&a[i]<min2){
                min2=a[i];
            }
        }
        System.out.println("phan tu nho thu hai cua mang la :"+min2+" ");
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[j]<a[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

            }
        System.out.print("mang sau khi sap xep la: ");
        for (int i = 0; i <n ; i++) {
            System.out.print(a[i]);
        }
        }
    }
