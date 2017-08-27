package patterns.oreilly.command.concrete_commands;

import patterns.oreilly.command.Command;
import patterns.oreilly.command.model.Stereo;

public class StereoOnCommand implements Command {

    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(666);
    }
}
