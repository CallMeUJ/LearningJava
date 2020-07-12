package com.uj.demo1;

public class TDemo1 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("饶展维");
        stu.setId(1);
        OverClass<Student> over = new OverClass<>(stu);
        over.getOver();
    }
}

class OverClass<T extends Student>{

    private T over;

    OverClass(T t){
        over = t;
    }

    public T getOver() {
        System.out.println(over.getName());
        return over;
    }

    public void setOver(T over) {
        this.over = over;
    }
}

class Student{
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
