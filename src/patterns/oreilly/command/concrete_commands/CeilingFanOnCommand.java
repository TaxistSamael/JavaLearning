package patterns.oreilly.command.concrete_commands;

import patterns.oreilly.command.Command;
import patterns.oreilly.command.model.CeilingFan;

public class CeilingFanOnCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
        ceilingFan.setSpeed(666);
    }
}
