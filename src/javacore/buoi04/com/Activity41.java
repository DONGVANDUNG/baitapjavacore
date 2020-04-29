package javacore.buoi04.com;

import java.util.Scanner;

public class Activity41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("chieu dai cua hinh chu nhat la: ");
        float a = sc.nextFloat();
        System.out.print("chieu rong cua hinh chu nhat la: ");
        float b = sc.nextFloat();
        Hinhchunhat hinhchunhat = new Hinhchunhat(a, b);
        System.out.println("chu vi hinh chu nhat la: " + hinhchunhat.getchuvi());
        System.out.println("dien hinh chu nhat la: " + hinhchunhat.getDientich());
        System.out.println("chieu dai la: " + hinhchunhat.getHeight());
        System.out.println("chieu rong la: " + hinhchunhat.getWidth());
        System.out.println(hinhchunhat.check() ? "day la hinh vuong" : "day khong la hinh vuong");
    }

}
