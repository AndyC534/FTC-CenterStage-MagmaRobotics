package org.firstinspires.ftc.teamcode.subsystem;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.CRServo;
//import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.constants;

public class Controller2 {
    private DcMotor upDownMotor;
    private DcMotor frontBackMotor;
    private DcMotor intakeMotor;
    private CRServo clawCRServo;

    public Controller2() {
    }

    public void init(HardwareMap hwMap) {

        this.clawCRServo = hwMap.get(CRServo.class, constants.Button.clawCRServo);
        this.intakeMotor = hwMap.get(DcMotor.class, constants.Button.intakeMotor);
        this.upDownMotor = hwMap.get(DcMotor.class, constants.Button.upDownMotor);
        this.frontBackMotor = hwMap.get(DcMotor.class, constants.Button.frontBackMotor);

        this.intakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.upDownMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.frontBackMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }
}

//    public void setControl(Gamepad gamepad) {
//        if (gamepad.left_bumper) {
//            this.clawCRServo.setPower(0.04);
//        } else {
//            if (gamepad.right_bumper) {
//                this.clawCRServo.setPower(-0.04);
//            } else {
//                this.clawCRServo.setPower(0);
//            }
//        }
//
//        if (gamepad.dpad_up) {
//            this.upDownMotor.setPower(0.5);
//        } else {
//            if (gamepad.dpad_down) {
//                this.upDownMotor.setPower(-0.5);
//            } else {
//                this.upDownMotor.setPower(0);
//            }
//
//            if (gamepad.dpad_left) {
//                this.frontBackMotor.setPower(0.5);
//            } else {
//                if (gamepad.dpad_right) {
//                    this.frontBackMotor.setPower(-0.5);
//                } else {
//                    this.frontBackMotor.setPower(0);
//                }
//
//                if (gamepad.y) {
//                    this.intakeMotor.setPower(1);
//                } else {
//                    if (gamepad.a) {
//                        this.intakeMotor.setPower(-1);
//                    } else {
//                        this.intakeMotor.setPower(0);
//                    }
//                }
//            }
//        }
//    }
//}