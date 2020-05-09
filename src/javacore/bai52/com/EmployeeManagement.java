package javacore.bai52.com;

import java.util.Scanner;

public class EmployeeManagement {
    private int n;
    private Employee[] employees;

    public EmployeeManagement(int n) {
        this.n = n;
        this.employees = new Employee[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao thong tin cho " + n + "nhan vien");
        for (int i = 0; i < n; i++) {
            System.out.println("nhan vien thu " + (i + 1) + ":");
            System.out.println("nhap vao so 0 neu ban muon nhap thong tin cho nhan vien Fulltime,nguoc lai " +
                    "nhap vao 1 neu ban muon nhap thong tin cho nhan vien Parttime");
            int employeeType = sc.nextInt();
            if (employeeType == 0) {
                System.out.println("nhap thong tin cho sinh vien Fulltime");
            }
            if (employeeType == 1) {
                System.out.println("nhap thong tin cho sinh vien Partime");
            }
            System.out.print("\t-Ten:");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("\t-Tuoi:");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("\t-So CMND:");
            String id = sc.nextLine();
            if (employeeType == 1) {
                System.out.print("\t-So ngay lam viec:");
                int workingDays = sc.nextInt();
                sc.nextLine();
                System.out.print("\t-Luong theo ngay:");
                long salary = sc.nextLong();
                sc.nextLine();
                employees[i] = new FulltimeEmployee(name, age, id, workingDays, salary);
            }
                if (employeeType == 0) {
                    System.out.print("\t-So ca lam viec:");
                    int workingShift = sc.nextInt();
                    System.out.print("\t-Luong theo ca lam viec:");
                    long salary = sc.nextLong();
                    sc.nextLine();
                    employees[i] = new ParttimeEmployee(name, age, id, workingShift, salary);
                }
            }
            sc.close();
        }
        public void travethongtin () {
            for (int i = 0; i < n; i++) {
                System.out.println("nhan vien thu "+(i+1)+":"+employees[i].toString());
            }
        }
        public Employee nhanvienluongcaonhat(){
        Employee nhanvien=employees[0];
            for (int i = 1; i <n ; i++) {
                if(employees[i].calculateSalary()>nhanvien.calculateSalary()){
                    employees[i]=nhanvien;
                }
            }
            return nhanvien;

        }
public Employee nhavienluongthapnhap(){
        Employee nhanvienthap=employees[0];
    for (int i = 1; i <n ; i++) {
        if(employees[i].calculateSalary()<nhanvienthap.calculateSalary()){
            employees[i]=nhanvienthap;
        }
    }
    return nhanvienthap;
}

    }
