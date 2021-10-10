package me.gicheol.designpattern.singleton.init;

public class Singleton {

    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
            uniqueInstance = new Singleton();

        return uniqueInstance;
    }

}
