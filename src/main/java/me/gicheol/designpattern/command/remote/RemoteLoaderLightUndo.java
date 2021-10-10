package me.gicheol.designpattern.command.remote;

import me.gicheol.designpattern.command.remote.light.Light;
import me.gicheol.designpattern.command.remote.light.LightOffCommand;
import me.gicheol.designpattern.command.remote.light.LightOnCommand;

public class RemoteLoaderLightUndo {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);

        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }

}
