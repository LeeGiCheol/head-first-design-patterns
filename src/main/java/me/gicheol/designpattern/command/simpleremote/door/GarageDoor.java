package me.gicheol.designpattern.command.simpleremote.door;

public class GarageDoor {

    public void up() {
        System.out.println("GarageDoor Up!");
    }

    public void down() {
        System.out.println("GarageDoor down!");
    }

    public void stop() {
        System.out.println("GarageDoor Stop!");
    }

    public void lightOn() {
        System.out.println("GarageDoor Light On!");
    }

    public void lightOff() {
        System.out.println("GarageDoor Light Off!");
    }

}
