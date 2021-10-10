package me.gicheol.designpattern.command.simpleremote;

import me.gicheol.designpattern.command.simpleremote.door.GarageDoor;
import me.gicheol.designpattern.command.simpleremote.door.GarageDoorOpenCommand;
import me.gicheol.designpattern.command.simpleremote.light.Light;
import me.gicheol.designpattern.command.simpleremote.light.LightOnCommand;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }

}
