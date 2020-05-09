package javacore.bai52.com;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Apptest {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement(2);
        employeeManagement.travethongtin();
        Employee nhanvien=employeeManagement.nhanvienluongcaonhat();
        System.out.println("nhan vien co luong cao nhat la:"+nhanvien);
        Employee nhanvienthap=employeeManagement.nhavienluongthapnhap();
        System.out.println("nhan vien co luong thap nhat la:"+nhanvienthap);
    }
}