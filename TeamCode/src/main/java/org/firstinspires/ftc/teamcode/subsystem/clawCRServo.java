package org.firstinspires.ftc.teamcode.subsystem;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.constants;

public class clawCRServo extends Controller2 {

    private CRServo clawCRServo;

    // initialization
    public clawCRServo() {
    }

    public void init(HardwareMap hwMap) {
        this.clawCRServo = hwMap.get(CRServo.class, constants.Button.clawCRServo);
    }

    public void setControl(Gamepad gamepad) {
        if (gamepad.left_bumper) {
            this.clawCRServo.setPower(0.04);
        } else {
            if (gamepad.right_bumper) {
                this.clawCRServo.setPower(-0.04);
            } else {
                this.clawCRServo.setPower(0);
            }
        }
    }
}
//
////    public void init(HardwareMap hwMap) {
////        this.clawCRServo = hwMap.get(Servo.class, Constants.clawCRServo.clawCRServo);
////    }
//
//
//    // open claws
//    public void in() {
//        this.clawCRServo.setPosition(1);
//    }
//
//
//    // close claws
//    public void out() {
//        this.clawCRServo.setPosition(-1);
//    }
//
//
//    // controller logic
//    public void setControl(Gamepad gamepad) {
//        if (gamepad.b) {
//            this.in();
//        } else if (gamepad.a) {
//            this.out();
//        }
//    }
//
//
//}