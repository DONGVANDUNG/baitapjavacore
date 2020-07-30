package javacore.buoi05.bai54;

import java.util.Arrays;
import java.util.Scanner;

public class StoreManagement {
    private int n;
    private Store[] stores;

    public StoreManagement(int n) {
        Scanner sc=new Scanner(System.in);
        this.stores=new Store[n];
        for (int i = 0; i <n ; i++) {
            stores[i]=new Store(sc,i+1);
        }
        sc.close();
    }

    public StoreManagement(int n, Store[] stores) {
        this.n = n;
        this.stores = stores;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Store[] getStores() {
        return stores;
    }

    public void setStores(Store[] stores) {
        this.stores = stores;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    Scanner sc = new Scanner(System.in);

    public int IshasBluetooth() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stores[i].getN(); j++) {
                if (stores[i].getPhones()[j].isHasBluetooth()) {
                    sum ++;
                }
            }
        }
        return sum;
    }

    public int Ishas5G() {
        stores = new Store[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stores[i].getN(); j++) {
                if (stores[i].getPhones()[j].isHas5G()) {
                    sum ++;
                }
            }
        }
        return sum;
    }

    public int IshasWifi() {
        stores = new Store[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stores[i].getN(); j++) {
                if (stores[i].getPhones()[j].isHasWifi()) {
                    sum ++ ;
                }
            }
        }
        return sum;
    }
}
