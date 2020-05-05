package javacore.buoi04.com;

import java.util.Scanner;

public class Student {
    private String name;
    private float gpa;

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public boolean check() {
        if (gpa >= 4) {
            return true;
        } else {
            return false;
        }
    }
}

class StudentManagenment {
    private int tongsosinhvien;
    private char[] danhsachsinhvien;
    private int gpa;
    Scanner sc = new Scanner(System.in);

    public StudentManagenment(int tongsosinhvien, char[] danhsachsinhvien) {
        this.tongsosinhvien = tongsosinhvien;
        this.danhsachsinhvien = danhsachsinhvien;
    }

    public int getTongsosinhvien() {
        return tongsosinhvien;
    }

    public void setTongsosinhvien(int tongsosinhvien) {
        this.tongsosinhvien = tongsosinhvien;
    }

    public char[] getDanhsachsinhvien() {
        return danhsachsinhvien;
    }

    public void setDanhsachsinhvien(char[] danhsachsinhvien) {
        this.danhsachsinhvien = danhsachsinhvien;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public int Kiemtra() {int Do = 0;
        int Truot = 0;
        Scanner Scanner = new Scanner(System.in);
        System.out.print("nhap vao so hoc sinh");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            if (gpa >= 4) {
                Do = Do + 1;
            } else {
                Truot = Truot + 1;
            }

        }
        int Max = 0;
        int Min = 10;
        for (int i = 0; i <= n; i++) {
            if (gpa > Max) {
                Max = gpa;
            }
            if (gpa < Min) {
                Min = gpa;
            }
        }
        return Do;
        return Truot;
        return Max;
        return Min;
    }
}