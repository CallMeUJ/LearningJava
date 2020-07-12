package com.uj.demo4;

public interface Ability extends ProgrammingAbility,TeachingAbility,CuringAbility {

}

interface ProgrammingAbility {
    void writeCpp();
    void writeJava();
    void writePython();
}

interface TeachingAbility {
    void teachChinese();
    void teachEnglish();
    void teachMath();
}

interface CuringAbility {
    void wang();
    void wen();
    void qie();
}
