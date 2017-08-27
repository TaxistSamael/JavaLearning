package patterns.oreilly.command.concrete_commands;

import patterns.oreilly.command.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No command assigned");
    }
}
