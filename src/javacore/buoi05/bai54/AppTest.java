package javacore.buoi05.bai54;

import sun.font.FontRunIterator;

public class AppTest {
    public static void main(String[] args) {
        StoreManagement storeManagement=new StoreManagement(2);
        System.out.println("Tong so dien thoai co 5G: "+storeManagement.Ishas5G());
        System.out.println("Tong so dien thoai co bluetooth la: "+storeManagement.IshasBluetooth());
        System.out.println("Tong so dien thoai co wifi la: "+storeManagement.IshasWifi());
        System.out.println(storeManagement.toString());
        Store store=new Store();
        System.out.println("Tong so dien thoai ban duoc la: "+store.TotalSmartPhone());
        System.out.println("Tong doanh thu cua cua hang la: "+store.revenue());
        System.out.println(store.toString());

        }
    }
