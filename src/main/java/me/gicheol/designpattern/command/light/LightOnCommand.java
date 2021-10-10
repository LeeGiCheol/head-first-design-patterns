package me.gicheol.designpattern.command.light;

import me.gicheol.designpattern.command.Command;

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
