package com.uj.demo4;

abstract class Person extends Animal{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void study();
    public abstract void work();
}
