package com.uj.demo4;

public class Programmer extends Person implements ProgrammingAbility{

    Programmer(){
        setName("无名氏");
        setGender("未知");
    }

    Programmer(String name, String gender){
        setName(name);
        setGender(gender);
    }

    @Override
    public void study() {
        System.out.println("程序员要学习C++，Java，Python");
    }

    @Override
    public void work() {
        System.out.println("打代码打代码打代码！！！");
    }

    @Override
    public void move() {
        System.out.println("起码能走");
    }

    @Override
    public void eat() {
        System.out.println("吃啥都行，杂食动物");
    }

    @Override
    public void sleep() {
        System.out.println("常常失眠");
    }

    @Override
    public void writeCpp() {
        System.out.println("C++天下第一");
    }

    @Override
    public void writeJava() {
        System.out.println("Java是世界上最好的语言");
    }

    @Override
    public void writePython() {
        System.out.println("人生苦短，我选Python");
    }
}
