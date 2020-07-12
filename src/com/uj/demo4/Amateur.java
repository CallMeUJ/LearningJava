package com.uj.demo4;

public interface Amateur extends DanceAmateur,DrawAmateur,SingAmateur{

}

interface DanceAmateur{
    void moveArms();
    void moveLegs();
    void moveHead();
}

interface DrawAmateur{
    void drawSuMiao();
    void drawSuXie();
    void drawSeCai();
}

interface SingAmateur{
    void singChineseSong();
    void singEnglishSong();
    void singJapaneseSong();
}
