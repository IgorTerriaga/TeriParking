package com.example.appparking.Model;

public class Login {
    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String email, password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
