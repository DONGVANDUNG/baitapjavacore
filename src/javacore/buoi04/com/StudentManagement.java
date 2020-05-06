package javacore.buoi04.com;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagement {
    private int n;
    private Student[] students;
    public StudentManagement(int n){
        this.n=n;
        Scanner sc=new Scanner(System.in);
        students=new Student[n];
        System.out.println("nhap thong tin cho "+n+" sinh vien");
        for (int i = 0; i <n ; i++) {
            System.out.println("nhap thong tin cho sinh vien thu "+ (i+1) +": ");
            System.out.print("\t +name:");
            String name=sc.nextLine();
            System.out.print("\t+ gpa: ");
            float gpa=sc.nextFloat();
            sc.nextLine();
            this.students [i]=new Student(name,gpa);
        }
   sc.close();
    }
    public int kemtra(boolean pass) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (pass) {
                if (students[i].check()) {
                    dem++;
                }

            } else {
                if (!students[i].check()) {
                    dem++;
                }
            }
        }
        return dem;
    }
    public Student timsinhviendiemcaonhat(){
        Student sinhviencaonhat=students[0];
        for (int i = 1; i <n ; i++) {
            if(students[i].getGpa()>sinhviencaonhat.getGpa()){
                sinhviencaonhat=students[i];
            }

        }
        return sinhviencaonhat;
    }
    public Student timsinhviendiemthapnhat(){
        Student sinhvienthapnhat=students[0];
        for (int i = 1; i <n ; i++) {
            if(students[i].getGpa()<sinhvienthapnhat.getGpa()){
                sinhvienthapnhat=students[i];
            }

        }
        return sinhvienthapnhat;
    }
}
