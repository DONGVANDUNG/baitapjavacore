package javacore.bai42.com;

public class Apptest {
    public static void main(String[] args) {
        StudentManagement student=new StudentManagement(3);
        System.out.println("\t+Tong so sinh  vien do la: "+student.coutsinhvien(true));
        System.out.println("\t+Tong so sinh vien truot la: "+student.coutsinhvien(false));
        Student x=student.timsvmax();
        Student y =student.timsvmin();
        System.out.println("\t+Sinh vien co diem cao nhat la: "+x);
        System.out.println("\t+Sinh vien co diem thap nhat la: "+y);
    }
}
