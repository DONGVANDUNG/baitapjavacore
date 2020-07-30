package javacore.buoi05.bai54;

import java.util.Arrays;
import java.util.Scanner;

public class Store {
    private String name;
    private String address;
    private int n;
    private SmartPhone[] phones;

    public Store() {
    }
    public Store(Scanner sc, int index) {
        System.out.println("-Nhap vao thong tin cua hang thu " + index + ":");
        System.out.print("\t+Ten cua hang:  ");
        String names = sc.nextLine();
        System.out.print("\t+Dia chi cua hang: ");
        String address = sc.nextLine();
        System.out.print("\t+Tong so dien thoai co trong cua hang:  ");
        this.n = sc.nextInt();
        this.phones = new SmartPhone[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\t\t-Nhap vao thong tin dien thoai thu " + (i+1));
            System.out.print("\t\t\t+Brand is: ");
            String brand = sc.nextLine();
            sc.nextLine();
            System.out.print("\t\t\t+IshasBluetooth: ");
            boolean hasBluetooth = sc.nextBoolean();
            System.out.print("\t\t\t+Ishas5G: ");
            boolean has5G = sc.nextBoolean();
            System.out.print("\t\t\t+IshasWifi: ");
            boolean hasWifi = sc.nextBoolean();
            sc.nextLine();
            System.out.print("\t\t\t+He dieu hanh: ");
            String os = sc.nextLine();
            System.out.print("\t\t\t+Dung luong bo nho: ");
            float memory = sc.nextFloat();
            sc.nextLine();
            System.out.print("\t\t\t+MAu sac: ");
            String color = sc.nextLine();
            System.out.print("\t\t\t+Gia ca: ");
            long price = sc.nextLong();
            System.out.print("\t\t\t+Tong so da ban duoc: ");
            int totalsold = sc.nextInt();
            this.phones[i] = new SmartPhone(brand, hasBluetooth, has5G, hasWifi, os, memory, color, price, totalsold);
            sc.nextLine();
        }
    }

    public Store(String name, String address, int n, SmartPhone[] phones) {
        this.name = name;
        this.address = address;
        this.n = n;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public SmartPhone[] getPhones() {
        return phones;
    }

    public void setPhones(SmartPhone[] phones) {
        this.phones = phones;
    }

    public int TotalSmartPhone() {
        int sum = 0;
        for (int i = 0; i < this.n; i++) {
            sum += phones[i].getTotalSold();
        }
        return sum;
    }

    public long revenue() {
        long revenue = 0;
        for (int i = 0; i <this.n; i++) {
            revenue += phones[i].getTotalSold() * phones[i].getPrice();
        }
        return revenue;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", n=" + n +
                ", phones=" + Arrays.toString(phones) +
                '}';
    }
}