package com.uj.demo4;

abstract class Animal{
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract void move();
    public abstract void eat();
    public abstract void sleep();
}