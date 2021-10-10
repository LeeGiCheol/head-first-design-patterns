package me.gicheol.designpattern.command.simpleremote.door;

import me.gicheol.designpattern.command.simpleremote.Command;

public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.up();
    }

}
