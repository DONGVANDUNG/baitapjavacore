package javacore.buoi05.com;

import java.util.Scanner;

public class BookManagement {
    private int n;
    private Book[] books;

    public BookManagement(int n) {
        this.n = n;
        books = new Book[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("+Nhap thong tin cho cuon sach thu " + (i + 1));
            System.out.print("\t+Ten sach la: ");
            String name = sc.nextLine();
            System.out.print("\t+Ten tac gia la: ");
            String author = sc.nextLine();
            System.out.print("\t+Gia cua sach la: ");
            long price = sc.nextInt();
            System.out.print("\t+Tong so da ban duoc la: ");
            long totalSold = sc.nextInt();
            sc.nextLine();
            books[ i] = new Book(name, author, price, totalSold);
        }
        sc.close();
    }

    public int coutsach() {
        int cout = 0;
        for (int i = 0; i < n; i++) {
            if (books[i].isbestseller()) {
                cout++;
            }
        }
        return cout;
    }

    public Book timsachbanchaynhat() {
        Book banchay = books[0];
        for (int i = 1; i < n; i++) {
            if (books[i].getTotalSold() > banchay.getTotalSold()) {
                banchay = books[i];
            }
        }
        return banchay;
    }
    public void showInformationStudent(){
        for (int i = 0; i <n ; i++) {
            System.out.println("+Cuon sach thu "+(i+1)+books[i].toString());
        }

    }
}
