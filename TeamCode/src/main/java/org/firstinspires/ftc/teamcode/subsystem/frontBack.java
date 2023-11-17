package org.firstinspires.ftc.teamcode.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.constants;

public class frontBack extends Controller2 {

    private DcMotor frontBackMotor;

    public frontBack() {
    }

    public void init(HardwareMap hwMap) {
        this.frontBackMotor = hwMap.get(DcMotor.class, constants.Button.frontBackMotor);
    }

    public void setControl(Gamepad gamepad) {
        if (gamepad.dpad_left) {
            this.frontBackMotor.setPower(0.5);
        } else {
            if (gamepad.dpad_left) {
                this.frontBackMotor.setPower(-0.5);
            } else {
                this.frontBackMotor.setPower(0);
            }
        }
    }
}