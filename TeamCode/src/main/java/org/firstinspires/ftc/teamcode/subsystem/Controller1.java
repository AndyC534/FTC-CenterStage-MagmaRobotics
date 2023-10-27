package org.firstinspires.ftc.teamcode.subsystem;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.constants;

public class Controller1 {
    private DcMotor frontLeftMotor;
    private DcMotor frontRightMotor;
    private DcMotor backLeftMotor;
    private DcMotor backRightMotor;
    //    private DcMotor planeLaunchMotor;
    //    private DcMotor liftMotor;
    //    private DcMotor intakeMotor;
    //    private Servo theStick;

    public Controller1() {
    }

    public void init(HardwareMap hwMap) {
        this.frontLeftMotor = hwMap.get(DcMotor.class, constants.Button.frontLeftMotor);
        this.frontRightMotor = hwMap.get(DcMotor.class, constants.Button.frontRightMotor);
        this.backLeftMotor = hwMap.get(DcMotor.class, constants.Button.backLeftMotor);
        this.backRightMotor = hwMap.get(DcMotor.class, constants.Button.backRightMotor);
//        this.theStick = hwMap.get(Servo.class,constants.Button.theStick);
//        this.planeLaunchMotor = hwMap.get(DcMotor.class, constants.Button.planeLaunchMotor);
//        this.intakeMotor = hwMap.get(DcMotor.class, constants.Button.intakeMotor);
//        this.liftMotor = hwMap.get(DcMotor.class, constants.Button.liftMotor);
        this.frontLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.frontRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.backLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.backRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        this.liftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        this.planeLaunchMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void setControl(Gamepad gamepad) {
        double leftPower;
        double rightPower;

        double drive = -gamepad.left_stick_y;
        double turn = gamepad.right_stick_y;
        leftPower = Range.clip(drive + turn, -1.0, 1.0);
        rightPower = Range.clip(drive - turn, -1.0, 1.0);

        this.frontLeftMotor.setPower(leftPower);
        this.frontRightMotor.setPower(rightPower);
        this.backLeftMotor.setPower(leftPower);
        this.backRightMotor.setPower(rightPower);
//        if (gamepad.x) {
//            this.planeLaunchMotor.setPower(1);
//        } else {
//            if (gamepad.a) {
//                this.planeLaunchMotor.setPower(-1);
//           }
//        }
//            if (gamepad.left_bumper) {
//                this.theStick.setPosition(0);
//            } else {
//                if (gamepad.right_bumper) {
//                    this.theStick.setPosition(1 );
//                }
//                if (gamepad.dpad_up) {
//                    this.liftMotor.setPower(0.5);
//                } else {
//                    if (gamepad.dpad_down) {
//                        this.liftMotor.setPower(-0.5);
//                    } else {
//                        this.liftMotor.setPower(0);
//            }
//                    if (gamepad.y) {
//                        this.intakeMotor.setPower(0.5);
//                    } else {
//                        if (gamepad.a) {
//                            this.intakeMotor.setPower(-0.5);
//                        } else {
//                            this.intakeMotor.setPower(0);
//                    }
        if (gamepad.dpad_up) {
            this.frontLeftMotor.setPower(1);
            this.backLeftMotor.setPower(1);
            this.frontRightMotor.setPower(1);
            this.backRightMotor.setPower(1);
        } else {
            if (gamepad.dpad_down) {
                this.frontLeftMotor.setPower(-1);
                this.backLeftMotor.setPower(-1);
                this.frontRightMotor.setPower(-1);
                this.backRightMotor.setPower(-1);
            } else {
                if (gamepad.dpad_left) {
                    this.frontLeftMotor.setPower(-1);
                    this.backLeftMotor.setPower(1);
                    this.frontRightMotor.setPower(1);
                    this.backRightMotor.setPower(-1);
                } else {
                    if (gamepad.dpad_right) {
                        this.frontLeftMotor.setPower(1);
                        this.backLeftMotor.setPower(-1);
                        this.frontRightMotor.setPower(-1);
                        this.backRightMotor.setPower(1);
                    } else {
                        this.frontLeftMotor.setPower(0);
                        this.backLeftMotor.setPower(0);
                        this.frontRightMotor.setPower(0);
                        this.backRightMotor.setPower(0);
                    }
                }
            }
        }
    }
}