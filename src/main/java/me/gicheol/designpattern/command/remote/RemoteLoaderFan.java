package me.gicheol.designpattern.command.remote;

import me.gicheol.designpattern.command.remote.fan.*;

public class RemoteLoaderFan {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan cellingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(cellingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(cellingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(cellingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
    }

}
