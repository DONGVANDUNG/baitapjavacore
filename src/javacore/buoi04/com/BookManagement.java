package javacore.buoi04.com;

import java.util.Scanner;

public class BookManagement {
    private int n;
    private Book[]books;
    public BookManagement(int n){
        Scanner sc=new Scanner(System.in);
        books=new Book[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("nhap thong tin cho cuon sach thu "+(i+1)+" :");
            System.out.print("\t+Ten sach la: ");
            String s=sc.nextLine();
            System.out.print("\t+Ten tac gia: ");
            String author=sc.nextLine();
            System.out.print("\t+gia cua sach la: ");
            float gia=sc.nextFloat();
            System.out.print("\t+tong so da ban duoc: ");
            int a=sc.nextInt();
            sc.nextLine();
            books[i]=new Book(s, author,gia,5000);
        }
        sc.close();
    }
    public int coutsach(){
        int cout=0;
        for (int i = 0; i <n ; i++) {
            if(books[i].isBestseller()){
                cout++;
            }
        }
        return cout;
    }
    public Book timsachbanchay(){
        Book banchay=books[0];
        for (int i = 1;i <n ; i++) {
            if(books[i].getTotalSold()>banchay.getTotalSold()){
                banchay=books[i];
            }
        }
        return banchay;
    }
}
