package me.gicheol.designpattern.command.simpleremote.light;

import me.gicheol.designpattern.command.simpleremote.Command;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

}
