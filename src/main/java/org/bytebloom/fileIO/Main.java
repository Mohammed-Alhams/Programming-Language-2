package org.bytebloom.fileIO;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/students.txt");
        Scanner scanner = new Scanner(file);

        scanner.nextLine();
        while (scanner.hasNextLine()){
            String currentLine = scanner.nextLine();
            String[] separatedValue = currentLine.split(",");
            int id = Integer.parseInt(separatedValue[0].trim());
            String name = separatedValue[1].trim();
            int age = Integer.parseInt(separatedValue[2].trim());
            Student std = new Student(id, name, age);
            students.add(std);
        }



        for (Student std: students) {
            System.out.println(std.id + " " + std.name + " " + std.age);
        }
    }
}


