package javacore.buoi04.com;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
       StudentManagement studentManagement=new StudentManagement(2);
        System.out.println("Tong so sinh vien do la: "+ studentManagement.kemtra(true));
        System.out.println("Tong so sinh vien truot la: "+ studentManagement.kemtra(false));
        System.out.println("sinh vien co diem cao nhat la: "+studentManagement.timsinhviendiemcaonhat());
        System.out.println("sinh vien co diem thap nhat la: "+studentManagement.timsinhviendiemthapnhat());
    }
}
