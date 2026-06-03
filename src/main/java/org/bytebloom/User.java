package org.bytebloom;


public class User {

    // Overloading

    public User(String email){
        this.id = counter;
        this.email = email;
        counter++;
    }

    public User(String phoneNumber, String password, String username, String email){
        this(email, password, username);
        this.phoneNumber = phoneNumber;
        counter++;
    }

    public User(String phoneNumber, String password){
        this.id = counter;
        this.password = password;
        this.phoneNumber = phoneNumber;
        counter++;
    }

    public User(String email, String password, String username) {

        if (isValidEmail(email)) {
            System.out.println("Invalid email");
        } else if (isValidPassword(password)) {
            System.out.println("Password must be at least 6 characters");
        } else if (isValidUsername(username)) {
            System.out.println("Username must be at least 3 characters");
        } else {
            this.id = counter;
            this.email = email;
            this.password = password;
            this.username = username;

            counter++;
        }



    }

    private static int counter = 0;
    private int id; // autoincrement integer
    private String email, password, username, phoneNumber;

    public static int getTotalUser(){
        return counter;
    }

    public int getId(){
        return this.id;
    }

    public String getEmail(){
        return "Email: " + this.email;
    }

    public void setEmail(String email){
        if (isValidEmail(email)) {
            System.out.println("Invalid email");
        }else {
            this.email = email;
        }
    }

    private boolean isValidEmail(String email){
        return email.contains("@");
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String newPassword){
        if (isValidPassword(newPassword)){
            System.out.println("Invalid password!");
        }else {
            this.password = newPassword;
        }
    }

    private boolean isValidPassword(String password){
        return password.length() > 6;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        if (isValidUsername(username)){
            System.out.println("Invalid username!");
        }else {
            this.username = username;
        }
    }

    private boolean isValidUsername(String username){
        return username.length() > 3;
    }


}