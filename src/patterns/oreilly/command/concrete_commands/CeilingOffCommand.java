package patterns.oreilly.command.concrete_commands;

import patterns.oreilly.command.Command;
import patterns.oreilly.command.model.CeilingFan;

public class CeilingOffCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingOffCommand (CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
