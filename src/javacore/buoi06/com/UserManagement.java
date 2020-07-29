package javacore.buoi06.com;

import org.omg.CORBA.SetOverrideType;

import java.util.Scanner;

public class UserManagement {
    private int totalUser;
    private User[] users;

    public UserManagement() {
    }

    public int getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(int totalUser) {
        this.totalUser = totalUser;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    Scanner sc = new Scanner(System.in);

    public UserManagement(int totalUser) {
        users = new User[totalUser];
        for (int i = 0; i < users.length; i++) {
            System.out.print("-ID cua nguoi dung thu " + (i + 1) + " la: ");
            int id = sc.nextInt();
            System.out.print("-Nhap vao ten nguoi dung: ");
            sc.nextLine();
            String username = sc.nextLine();
            System.out.print("-Mat khau la: ");
            String password = sc.nextLine();
            System.out.print("-Ten hien thi la: ");
            String displayname = sc.nextLine();
            System.out.print("-Email la: ");
            String email = sc.nextLine();
            users[i] = new User(id, username, password, displayname, email);
            System.out.println("_____________________________");
        }
    }

    public void findUserByUsername() {
        System.out.print("\t+Ten user ma ban muon tra cuu thong tin:  ");
        String username1 = sc.nextLine();
        User user = null;
        for (int i = 0; i < users.length; i++) {
            try {
                if (users[i].getUsername().equalsIgnoreCase(username1)) {
                    user = users[i];
                    System.out.println(users[i].toString());
                    break;
                }
            } catch (Exception e) {
                System.out.println("\t\t+Ten dang nhap " + username1 + " khong dung");
            }
        }
        if (user == null) {
            System.out.println("\t\t+Nguoi dung khong ton tai!!");
        }
    }

    public void login() {
        System.out.print("\t+Ten user ma ban muon dang nhap:  ");
        String username = sc.nextLine();
        User user = null;
        User user1 = null;
        for (int i = 0; i < users.length; i++) {
            try {
                if (users[i].getUsername().equalsIgnoreCase(username)) {
                    System.out.println("\t\t+Mat khau la:  ");
                    String password = sc.nextLine();
                    if (users[i].getPassword().equalsIgnoreCase(password)) {
                        user = users[i];
                        System.out.println("\t\t+Ban da dang nhap thanh cong!!!");
                        break;
                    } else System.out.println("\t\t+Mat khau " + password + " khong dung!!!");
                } else System.out.println("\tTen nguoi dung khong dung");
                break;
            } catch (Exception e) {
                System.out.println("\t\t+Ten dang nhap/mat khau khong hop le!!");
            }
        }
        if (user == null) {
            System.out.println("\t\tDang nhap khong thanh cong!!");
        }

    }
}
