package org.firstinspires.ftc.teamcode.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.Constants;


public class Intake {


    private DcMotor intakeMotor;

    // initialization
    public Intake() {

    }

    public void init(HardwareMap hwMap) {
        this.intakeMotor = hwMap.get(DcMotor.class, Constants.Intake.intakeMotor);
    }


    // open claws
    public void forward() {
        this.intakeMotor.setPower(-Constants.Intake.forward);
    }

    public void backward() {
        this.intakeMotor.setPower(-Constants.Intake.backward);
    }


    // controller logic
    public void setControl(Gamepad gamepad) {
        if (gamepad.x) {
            this.forward();
        } else if (gamepad.y) {
            this.backward();
        }
    }


}