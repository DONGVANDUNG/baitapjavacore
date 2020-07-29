package javacore.buoi05.com;

public class Apptest {
    public static void main(String[] args) {
        BookManagement books = new BookManagement(3);
        books.showInformationStudent();
        System.out.println("+Cuon sach ban chay nhat la: " + books.timsachbanchaynhat());
        System.out.println("+Tong so sach BestSeller la: " + books.coutsach());
    }
}