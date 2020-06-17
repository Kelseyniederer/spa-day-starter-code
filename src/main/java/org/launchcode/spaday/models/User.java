package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
    @NotBlank(message = "username is required")
    @Size(min = 5, max = 15, message = "input username between 5 and 15 characters")
    private String username;

    @Email(message = "please type in valid email")
    private String email;

    @NotBlank(message = "password is required")
    @Size(min = 6, message = "password must contain at least 6 characters")
    private String password;

    @NotBlank(message = "Please verify your password")
    private String verify;


    public User() {

    }

    public User(String username, String email, String password, String verify) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify = verify;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

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
