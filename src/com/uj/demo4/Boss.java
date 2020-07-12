package com.uj.demo4;

public class Boss <T extends Person & ProgrammingAbility> {
    private T worker;

    Boss(){
        System.out.println("太穷了，雇不到人");
    }

    Boss(T worker){
        employWorker(worker);
    }

    public void employWorker(T worker){
        this.worker = worker;
    }

    public void letItWork(){
        System.out.print("老板让" + worker.getName());
        worker.work();
    }

    public void letItProgram(){
        System.out.print("老板让" + worker.getName() + "承认");
        worker.writeJava();
    }

    public void letItTeach(){
        System.out.print("老板让" + worker.getName());
        //worker.teachMath();
        System.out.println("搞数学培训，但是" + worker.getName() + "说他不会");
    }

}
