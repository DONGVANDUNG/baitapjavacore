package javacore.buoi04.com;

public class AppTest {
    public static void main(String[] args) {
        BookManagement Books=new BookManagement(3);
        int cout=Books.coutsach();
        System.out.println();
        System.out.println("tong so sach ban chay la:"+ cout);
        Book chay=Books.timsachbanchay();
        System.out.println("sach ban chay nhat la"+ chay);
    }
}
