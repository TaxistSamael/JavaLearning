package patterns.oreilly.command;

import patterns.oreilly.command.concrete_commands.NoCommand;

public class RemoteControl {

    private Command [] onCommands;
    private Command [] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        final Command noCommand = new NoCommand();
        for (int i=0; i<7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot >= onCommands.length || slot >= offCommands.length) return;
        
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonOnPressed(int slot) {
        onCommands[slot].execute();
    }

    public void onButtonOffPressed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n--- Remote Control --- \n");
        for (int i=0; i<onCommands.length; i++) {
            stringBuilder.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "   " + offCommands[i].getClass().getName() + "\n");
        }

        return stringBuilder.toString();
    }
}
