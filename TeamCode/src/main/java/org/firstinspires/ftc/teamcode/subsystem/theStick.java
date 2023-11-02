package org.firstinspires.ftc.teamcode.subsystem;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.Constants;


public class theStick {


    private Servo theStick;


    // initialization
    public theStick() {

    }

    public void init(HardwareMap hwMap) {
        this.theStick = hwMap.get(Servo.class, Constants.theStick.theStick);
    }


    // open claws
    public void in() {
        this.theStick.setPosition(1);
    }


    // close claws
    public void out() {
        this.theStick.setPosition(-1);
    }


    // controller logic
    public void setControl(Gamepad gamepad) {
        if (gamepad.b) {
            this.in();
        } else if (gamepad.a) {
            this.out();
        }
    }


}