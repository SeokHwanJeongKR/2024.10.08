package interfaces.example.s2;

import interfaces.example.s1.WashingMachine;

public class SamsungWashingMachineV2
        implements WashingMachine , DryMachine {
    //속도 0 꺼짐
    //속도 가 있으면 켜짐
    private int speed = 0;

    public boolean onOffSwitch;

    public void checkSwitch(int speed) {
        if (speed == 0) {
            onOffSwitch = false;
            this.speed = speed;
        } else if (speed < 0) {
            System.out.println("제대로 된 속도를 입력 부탁드립니다");
        } else {
            onOffSwitch = true;
            this.speed = speed;
        }
    }

    @Override
    public void startButton() {
        if (!onOffSwitch) {
            System.out.println("전원이 꺼져있습니다 속도를 올려주세요");
        } else {
            System.out.println("전원을 킵니다 속도는 " + speed + " 로 설정 되었습니다");
        }

    }

    @Override
    public void pauseButton() {
        if (speed != 0) {
            System.out.println("세탁기를 일시 정지합니다");
            speed = 0;
        } else {
            System.out.println("이미 세탁기가 멈춰있습니다");
        }

    }

    @Override
    public void stopButton() {
        if (speed != 0) {
            System.out.println("세탁기를 정지 합니다");
            speed = 0;
        } else {
            System.out.println("이미 세탁기가 멈춰있습니다");
        }
    }



    @Override
    public int setSpeed(int speed) {
        switch (speed) {
            case 1:
                this.speed = 20;
                System.out.println("세탁 시간이 20분 소요 됩니다");
                break;
            case 2:
                this.speed = 50;
                System.out.println("세탁 시간이 50분 소요 됩니다");
                break;
            case 3:
                this.speed = 100;
                System.out.println("세탁 시간이 100분 소요 됩니다");
                break;
        }

        return speed;
    }


    @Override
    public void dry() {
        if (speed == 0) {
            System.out.println("건조를 시작합니다");
        } else {
            System.out.println("아직 세탁기가 돌아갑니다");
        }

    }
}
