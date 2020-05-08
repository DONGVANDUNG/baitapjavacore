package javacore.bai51.com;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Apptest {
    public static void main(String[] args) {
    BookManagement books=new BookManagement(3);
        System.out.println("+Cuon sach ban chay nhat la: "+books.timsachbanchaynhat());
        System.out.println("+Tong so sach BestSeller la: "+books.coutsach());
}
}