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
        for (int i = 0; i < a.length ; i++) {
            System.out.print("a[" + i + "]=");
           a[i]=sc.nextInt();
        }

        for (int j = 0; j < b.length ; j++) {
            System.out.print("b[" + j + "]=");
            b[j] = sc.nextInt();
        }
        int x=0;
        int[] c=new int[m+n];
        for (int i = 0; i < n; i++) {
             c[x] = a[0];
            x++;System.out.print(c[x]);
        }
        for (int j=0;j<m;j++){
            a[j] = sc.nextInt();
            c[x] = a[j];
            x++;System.out.print(c[x]);
        }
    }
}