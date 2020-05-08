package javacore.bai42.com;

import java.util.Scanner;

public class StudentManagement {
    private int n;
    private Student[] students;

    public StudentManagement(int n) {
        this.n = n;
        Scanner sc = new Scanner(System.in);
        students = new Student[n];
        System.out.println("Nhap vao thong tin cho "+n+" sinh vien:");
        for (int i = 0; i < n; i++) {
            System.out.print("\t+Ten sinh vien thu " + (i + 1) + " la: ");
            String name = sc.nextLine();
            System.out.print("\t+Gpa la: ");
            float gpa = sc.nextFloat();
            sc.nextLine();
            students[i] = new Student(name, gpa);

        }
        sc.close();
    }

    public int coutsinhvien(boolean ispass) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ispass) {
                if (students[i].check()) {
                    count++;
                }
            }
            else  {
                if (!students[i].check()) { ;
                    count++;
                }
            }
        }
        return count;
    }

    public Student timsvmax(){
        Student beststudent=students[0];
        for (int i = 1; i <n ; i++) {
            if(students[i].getGpa()>beststudent.getGpa()){
                beststudent=students[i];
            }
        }
        return beststudent;
    }
    public Student timsvmin(){
         Student worststudent=students[0];
        for (int i = 1; i <n ; i++) {
            if(students[i].getGpa()<worststudent.getGpa()){
                worststudent=students[i];
            }
        }
        return worststudent;
    }
}
