package javacore.buoi06.com;

import javafx.scene.transform.Scale;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class User {
    private int id;
    private String username;
    private String password;
    private String displayname;
    private String email;

    public User(int id, String username, String password, String displayname, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.displayname = displayname;
        this.email = email;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname)   {
        this.displayname = displayname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "+ID:"+id+
                ", Username:"+username+
                ", Password:"+password+
                ", Display:"+displayname+
                ", Email:"+email;
    }
}
