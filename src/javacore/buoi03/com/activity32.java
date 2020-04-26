package javacore.buoi03.com;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util. Scanner;
public class activity32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao kch thuoc cua mang a:=");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("nhap vao kich thuoc cua mang b:=");
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();

        }
        for (int j = 0; j < b.length - 1; j++) {
            System.out.print("b[" + j + "]=");
            a[j] = sc.nextInt();
        }
        System.out.println();
        System.out.println("kich thuoc mang a la:" + a.length);
        System.out.println("kich thuoc mang b la:" + b.length);
        System.out.println("length two array a va b la:" + (a.length + b.length));
        int[] c = new int[m + n];
        for (int i = 0; i <m+n-1 ; i++) {
            for(int j=0;j<m+n-1;j++) {
                c[j] = a[j];
                c[i] = a[i];
                System.out.println(c[i]+c[j]);
            }
        }

                }
            }