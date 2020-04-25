package javacore.buoi03.com;
import java.util.Scanner;
public class activity31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao kich thuoc cua mang");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n - 1; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();
        }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n-1; j++) {
                    if (a[i] == a[j]) {
                        for (int k = j + 1; k < n-1; k++) {
                            a[k-1] = a[k];

                        }j--;n--;
                    }
                } System.out.print(a[i]);

            }

        }
    }
