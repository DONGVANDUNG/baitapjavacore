package javacore.buoi06.com;

import java.util.Scanner;

public class Apptest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManagement user = new UserManagement(2);
        user.findUserByUsername();
        user.login();
    }
}