package com.uj.demo1;

public class Test1Run {
    public static void main(String[] args) {
        Person david = new Programmer();
        System.out.println("david instanceof Programmer? " + (david instanceof Programmer));
        System.out.println("david instanceof Person? " + (david instanceof Person));
        Programmer pgr_david = (Programmer)david;
        Animal cat = new Animal();
        Bird Seagull = new Seagull();
    }
}

class Person {
    Person(){
        System.out.println("I can do something!");
    }
}

class Programmer extends Person {
    Programmer() {
        System.out.println("I can program!");
    }
}

class Animal {
    Animal(){

    }

    Animal(String kind){
        System.out.println("我属于" + kind + "种");
    }
}

abstract class Bird{
    Bird(){
        System.out.println("调用Bird()");
    }
    Bird(String feather){
        System.out.println("调用Bird(String feather)");
    }
}

class Seagull extends Bird{
    Seagull(){
        System.out.println("调用Seagull()");
    }
    Seagull(String feather){
        System.out.println("调用Seagull(String feather)");
    }
}
