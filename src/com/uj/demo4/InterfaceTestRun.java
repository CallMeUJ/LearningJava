package com.uj.demo4;

public class InterfaceTestRun {
    public static void main(String[] args) {
        Programmer david = new Programmer("饶展维", "男");
        david.move();
        david.eat();
        david.sleep();
        david.study();
        david.work();
        david.writeCpp();
        david.writeJava();
        david.writePython();
        System.out.println();
        Boss<Programmer> boss = new Boss<>(david);
        boss.letItWork();
        boss.letItProgram();
        boss.letItTeach();
    }
}








