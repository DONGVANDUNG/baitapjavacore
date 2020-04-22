package javacore.buoi02.com;
import java.util.Scanner;
public class activity21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap n vao day");
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s=s+i;

            }
        System.out.println("sum="+s);
        float d=(float)s/n;
        System.out.println("avg="+d);
        }

    }