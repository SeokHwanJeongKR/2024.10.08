package interfaces.example.s1;

import interfaces.example.s2.SamsungWashingMachineV2;

public class MachineMain {
    public static void main(String[] args) {
        SamsungWashingMachineV1 machine = new SamsungWashingMachineV1();

        machine.checkSwitch(10);
        machine.setSpeed(2);
        machine.startButton();
        machine.pauseButton();
        machine.stopButton();
        machine.checkSwitch(10);
        machine.startButton();
    }
}
