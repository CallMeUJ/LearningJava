package com.uj.demo1;

public class EnumDemo {
    public enum Seasons {
        SPRING, SUMMER, AUTUMN, WINTER
    }

    public static void main(String[] args) {
        System.out.println(Seasons.SPRING);
        System.out.println(Seasons.SPRING.getClass().getName());
        Seasons[] enumArray = Seasons.values();

        for (int i = 0; i < enumArray.length; i++) {
            System.out.println(enumArray[i]);
        }

        for(Seasons tmp : enumArray){
            System.out.println(tmp);
        }

        Seasons s1 = Seasons.SPRING;
        Seasons s2 = Seasons.valueOf("SPRING");
        Seasons s3 = Seasons.valueOf("SUMMER");
        try {
            Seasons s4 = Seasons.valueOf("OK");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println();
        }
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(Seasons.WINTER.ordinal());
    }
}


