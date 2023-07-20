package org.example;

import org.example1.Student;
import org.example1.Student1;
import org.example1.Student2;
import org.example1.StudentInterface;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student2();

        System.out.println("");
//        if(student1 instanceof Student1) {
            Student1 hkghg = (Student1) student1;
//        }

        login(new Student1(), "");
    }


    public static void login(Student student, String password){
        student.play();

    }
}
