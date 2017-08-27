package patterns.oreilly.command;

public class SimpleRemoteControl {

    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void onButtonPressed() {
        slot.execute();
    }
}
