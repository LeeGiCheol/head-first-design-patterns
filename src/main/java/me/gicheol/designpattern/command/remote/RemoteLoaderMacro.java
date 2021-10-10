package me.gicheol.designpattern.command.remote;

import me.gicheol.designpattern.command.remote.audio.Stereo;
import me.gicheol.designpattern.command.remote.audio.StereoOffCommand;
import me.gicheol.designpattern.command.remote.audio.StereoOnWithCDCommand;
import me.gicheol.designpattern.command.remote.door.GarageDoor;
import me.gicheol.designpattern.command.remote.door.GarageDoorDownCommand;
import me.gicheol.designpattern.command.remote.door.GarageDoorUpCommand;
import me.gicheol.designpattern.command.remote.fan.CeilingFan;
import me.gicheol.designpattern.command.remote.fan.CeilingFanOffCommand;
import me.gicheol.designpattern.command.remote.fan.CeilingFanOnCommand;
import me.gicheol.designpattern.command.remote.light.Light;
import me.gicheol.designpattern.command.remote.light.LightOffCommand;
import me.gicheol.designpattern.command.remote.light.LightOnCommand;
import me.gicheol.designpattern.command.remote.macro.MacroCommand;

public class RemoteLoaderMacro {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan cellingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(cellingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(cellingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = { livingRoomLightOn, kitchenLightOn, ceilingFanOn, garageDoorUp, stereoOnWithCD };
        Command[] partyOff = { livingRoomLightOff, kitchenLightOff, ceilingFanOff, garageDoorDown, stereoOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("\n--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);
        System.out.println("\n--- Pushing Macro Undo ---");
        remoteControl.undoButtonWasPushed();
    }

}
