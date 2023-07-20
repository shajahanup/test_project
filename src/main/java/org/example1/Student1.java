package org.example1;

public class Student1 extends Student implements StudentInterface, StudentInterface2 {



    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void play2() {
        System.out.println("play2");
    }

    public void play3() {
        System.out.println("play2");
    }

    @Override
    public void dance() {
        System.out.println("dance");
    }
}
