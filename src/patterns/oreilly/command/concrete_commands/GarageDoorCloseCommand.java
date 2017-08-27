package patterns.oreilly.command.concrete_commands;

import patterns.oreilly.command.Command;
import patterns.oreilly.command.model.GarageDoor;

public class GarageDoorCloseCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
        garageDoor.lightOff();
    }
}
