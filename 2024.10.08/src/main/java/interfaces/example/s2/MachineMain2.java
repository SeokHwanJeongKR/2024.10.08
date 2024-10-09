package interfaces.example.s2;

import interfaces.example.s1.SamsungWashingMachineV1;

public class MachineMain2 {
    public static void main(String[] args) {
        SamsungWashingMachineV2 machine = new SamsungWashingMachineV2();

        machine.checkSwitch(10);
        machine.setSpeed(2);
        machine.startButton();
        machine.pauseButton();
        machine.stopButton();
        machine.checkSwitch(10);
        machine.dry();
        machine.stopButton();
        machine.dry();
    }
}
