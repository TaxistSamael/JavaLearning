package patterns.oreilly.command.concrete_commands;

import patterns.oreilly.command.Command;
import patterns.oreilly.command.model.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
