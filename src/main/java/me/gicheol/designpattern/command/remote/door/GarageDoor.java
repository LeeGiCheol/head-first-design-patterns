package me.gicheol.designpattern.command.remote.door;

public class GarageDoor {

    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " GarageDoor Up");
    }

    public void down() {
        System.out.println(location + " GarageDoor Down");
    }

    public void stop() {
        System.out.println(location + " GarageDoor Stop");
    }

    public void lightOn() {
        System.out.println("GarageDoor Light On!");
    }

    public void lightOff() {
        System.out.println("GarageDoor Light Off!");
    }

}
