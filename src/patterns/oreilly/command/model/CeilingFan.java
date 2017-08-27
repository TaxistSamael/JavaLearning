package patterns.oreilly.command.model;

public class CeilingFan {

    public void on() {
        System.out.println("Seiling Fan on");
    }

    public void off() {
        System.out.println("Seiling Fan off");
    }

    public void setSpeed(int speed){
        System.out.println("Seiling Fan speed is " + speed);
    }
}
