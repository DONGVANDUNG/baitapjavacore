package javacore.buoi01;
import java.util.Scanner;
public class activity02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("where are they learning Javacore?");
        String a = sc.nextLine();
        do{
            System.out.println("where are they learning Javacore?");
            a=sc.nextLine();
            if(a.equals("PlusPlus Academy")){
                System.out.println("Welcom to class Javacore!!!!!!!!!!!!!");
            }
       }
        while(!a.equals("PlusPlus Academy"));
    }
}