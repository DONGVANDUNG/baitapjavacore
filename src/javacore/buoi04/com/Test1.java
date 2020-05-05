package javacore.buoi04.com;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten cua sinh vien: ");
        String a = sc.nextLine();
        System.out.print(" diem gpa la :");
        float b = sc.nextFloat();
        Student student = new Student(a,b);
        System.out.println(student.getName());
        System.out.println(student.getGpa());
        System.out.println(student.check() ? "ban do roi nhe" : "ban truot  roi hoc lai di ban");
    }
}
