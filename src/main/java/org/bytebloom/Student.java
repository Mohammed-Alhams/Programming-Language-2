package org.bytebloom;

public class Student {

    private String name;
    private String email;
    private String phoneNumber;

    public Student(String name, String email){
        this.name = name;
        this.email = email;
    }

    public Student(String name, String email, String phoneNumber){
        this(name, email);
        this.phoneNumber = phoneNumber;
    }

}
