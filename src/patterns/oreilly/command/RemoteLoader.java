package patterns.oreilly.command;

import patterns.oreilly.command.concrete_commands.*;
import patterns.oreilly.command.model.CeilingFan;
import patterns.oreilly.command.model.GarageDoor;
import patterns.oreilly.command.model.Light;
import patterns.oreilly.command.model.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        final RemoteControl remoteControl = new RemoteControl();
        final Light light = new Light();
        final CeilingFan ceilingFan = new CeilingFan();
        final GarageDoor garageDoor = new GarageDoor();
        final Stereo stereo = new Stereo();

        final LightOnCommand livingRoomLightOn = new LightOnCommand(light);
        final LightOffCommand livingRoomLightOff = new LightOffCommand(light);

        final LightOnCommand kitchenLightOn = new LightOnCommand(light);
        final LightOffCommand kitchenLightOff = new LightOffCommand(light);

        final CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        final CeilingOffCommand ceilingOffCommand = new CeilingOffCommand(ceilingFan);

        final GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        final GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        final StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        final StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingOffCommand);
        remoteControl.setCommand(3, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(4, stereoOnCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonOnPressed(0);
        remoteControl.onButtonOffPressed(0);

        remoteControl.onButtonOnPressed(1);
        remoteControl.onButtonOffPressed(1);

        remoteControl.onButtonOnPressed(2);
        remoteControl.onButtonOffPressed(2);

        remoteControl.onButtonOnPressed(3);
        remoteControl.onButtonOffPressed(3);

        remoteControl.onButtonOnPressed(4);
        remoteControl.onButtonOffPressed(4);
    }
}
