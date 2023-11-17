package org.firstinspires.ftc.teamcode.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.constants;

public class upDown extends Controller2 {

    private DcMotor upDownMotor;

    public upDown() {
    }

    public void init(HardwareMap hwMap) {
        this.upDownMotor = hwMap.get(DcMotor.class, constants.Button.upDownMotor);
    }

    public void setControl(Gamepad gamepad) {
        if (gamepad.dpad_up) {
            this.upDownMotor.setPower(0.5);
        } else {
            if (gamepad.dpad_down) {
                this.upDownMotor.setPower(-0.5);
            } else {
                this.upDownMotor.setPower(0);
            }
        }
    }
}