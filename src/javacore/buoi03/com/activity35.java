package javacore.buoi03.com;

import java.util.Scanner;

public class activity35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("nhap vap noi dung cua chuoi:");
        a = sc.nextLine();
        char[] c = a.toCharArray();
        int max=0;
        char d=0;
        int dem = 1;
        for (int i = 0; i < a.length(); i++) {
            dem=1;
            for(int j=i+1;j<a.length();j++){
                if (c[i]==c[j]){
                    dem=dem+1;
                }
            }
            if(dem>max){
                max=dem;
                d=c[i];
            }
            }
        System.out.println((d)+"("+max+")");
        }
    }