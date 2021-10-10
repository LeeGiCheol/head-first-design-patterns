package me.gicheol.designpattern.command.remote.audio;

import me.gicheol.designpattern.command.remote.Command;

public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
