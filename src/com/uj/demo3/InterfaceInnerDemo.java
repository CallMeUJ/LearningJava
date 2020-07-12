package com.uj.demo3;

public class InterfaceInnerDemo {
    public static void main(String[] args) {
        OutterClass outterClass = new OutterClass();
        OutInterface outInterface = outterClass.ReturnOutInterface();
        outInterface.func();
    }
}

interface OutInterface{
    void func();
}

class OutterClass {
    private class InnerClass implements OutInterface{
        InnerClass(String s){
            System.out.println(s);
        }

        @Override
        public void func() {
            System.out.println("调用内部类func()方法");
        }
    }
    public OutInterface ReturnOutInterface(){
        return new InnerClass("调用内部类构造方法");
    }
}
