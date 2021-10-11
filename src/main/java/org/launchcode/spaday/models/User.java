package org.launchcode.spaday.models;

import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



public class User {

    @NotBlank(message = "Username is required")
    @Size(min = 3, max= 12, message="Username should be between 5 and 12 characters.")
    private String username;

    @Email(message = "Please provide a valid email.")
    private String email;

    @NotBlank(message = "Password is required")
    @Length( min = 4, message="Password length should be at list 6 characters")
    private String password;

    public User(){

    }

    public User(String username, String email, String password) {
        this();

        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    @Override
    public String toString() {
        return username;
    }
}
