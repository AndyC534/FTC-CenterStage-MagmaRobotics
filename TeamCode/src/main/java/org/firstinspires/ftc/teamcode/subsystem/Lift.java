package org.firstinspires.ftc.teamcode.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Constants;


public class Lift {


    private DcMotor liftMotor;


    // initialization
    public Lift() {

    }

    public void init(HardwareMap hwMap) {
        this.liftMotor = hwMap.get(DcMotor.class, Constants.Lift.liftMotor);
        this.liftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }


    public void disableBrake() {
        this.liftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }


    // lift goes up
    public void up() {
        this.liftMotor.setPower(Constants.Lift.powerUp);
    }


    // lift goes down
    public void down() {
        this.liftMotor.setPower(-Constants.Lift.powerDown);
    }


    // lift stops and brakes
    public void stop() {
        this.liftMotor.setPower(0.0);
    }

    public void set(double power) {
        this.liftMotor.setPower(power);
    }

    // controller logic
    public void setControl(Gamepad gamepad) {
        if (gamepad.dpad_down) {
            this.up();
        } else if(gamepad.dpad_up) {
            this.down();
        } else {
            this.stop();
        }
    }


}