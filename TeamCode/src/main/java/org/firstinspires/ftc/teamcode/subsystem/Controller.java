package org.firstinspires.ftc.teamcode.subsystem;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;
import org.firstinspires.ftc.teamcode.constants;

public class Controller {
    private DcMotor FrontLeftDrive;
    private DcMotor FrontRightDrive;
    private DcMotor BackLeftDrive;
    private DcMotor BackRightDrive;
    private DcMotor Intake;
    private DcMotor Arm1;
//    private DcMotor clawMotor;
    private DcMotor Arm2;
//    private Servo servoTest;

    public Controller() {
    }

    public void init(HardwareMap hwMap) {
        this.FrontLeftDrive = hwMap.get(DcMotor.class, constants.Button.FrontLeftDrive);
        this.FrontRightDrive = hwMap.get(DcMotor.class, constants.Button.FrontRightDrive);
        this.BackLeftDrive = hwMap.get(DcMotor.class, constants.Button.BackLeftDrive);
        this.BackRightDrive = hwMap.get(DcMotor.class, constants.Button.BackRightDrive);
        this.Intake = hwMap.get(DcMotor.class, constants.Button.Intake);
        this.Arm1 = hwMap.get(DcMotor.class, constants.Button.Arm1);
//        this.clawMotor = hwMap.get(DcMotor.class, constants.Button.clawMotor);
        this.Arm2 = hwMap.get(DcMotor.class, constants.Button.Arm2);
//        this.servoTest = hwMap.get(Servo.class, constants.Button.servoTest);
        this.FrontLeftDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.FrontRightDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.BackLeftDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.BackRightDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.Intake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.Arm1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        this.clawMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.Arm2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }

    public void setControl(Gamepad gamepad) {
        double leftPower;
        double rightPower;

        double drive = -gamepad.left_stick_y;
        double turn = gamepad.right_stick_y;
        leftPower = Range.clip(drive + turn, -1.0, 1.0);
        rightPower = Range.clip(drive - turn, -1.0, 1.0);

        this.FrontLeftDrive.setPower(leftPower);
        this.FrontRightDrive.setPower(rightPower);
        this.BackLeftDrive.setPower(leftPower);
        this.BackRightDrive.setPower(rightPower);

//        if (gamepad.left_bumper) {
//            this.clawMotor.setPower(0.05);
//        } else {
//            if (gamepad.right_bumper) {
//                this.clawMotor.setPower(-0.05);
//            } else {
//                this.clawMotor.setPower(0);
//            }
//        }

        if (gamepad.dpad_up) {
            this.Arm1.setPower(0.5);
        } else {
            if (gamepad.dpad_down) {
                this.Arm1.setPower(-0.5);
            } else {
                this.Arm1.setPower(0);
            }
        }

        if (gamepad.dpad_left) {
            this.Arm2.setPower(0.5);
        } else {
            if (gamepad.dpad_right) {
                this.Arm2.setPower(-0.5);
            } else {
                this.Arm2.setPower(0);
            }
        }

        if (gamepad.y) {
            this.Intake.setPower(1);
        } else {
            if (gamepad.a) {
                this.Intake.setPower(-1);
            } else {
                this.Intake.setPower(0);
            }
        }

//        if (gamepad.x) {
//            this.servoTest.setPosition(1);
//        } else {
//            if (gamepad.b); {
//                this.servoTest.setPosition(0);
//            }
//        }

//            if (gamepad.dpad_up) {
//                this.frontLeftMotor.setPower(1);
//                this.backLeftMotor.setPower(1);
//                this.frontRightMotor.setPower(1);
//                this.backRightMotor.setPower(1);
//            } else {
//                if (gamepad.dpad_down) {
//                    this.frontLeftMotor.setPower(-1);
//                    this.backLeftMotor.setPower(-1);
//                    this.frontRightMotor.setPower(-1);
//                    this.backRightMotor.setPower(-1);
//                } else {
//                    if (gamepad.dpad_left) {
//                        this.frontLeftMotor.setPower(-1);
//                        this.backLeftMotor.setPower(1);
//                        this.frontRightMotor.setPower(1);
//                        this.backRightMotor.setPower(-1);
//                    } else {
//                        if (gamepad.dpad_right) {
//                            this.frontLeftMotor.setPower(1);
//                            this.backLeftMotor.setPower(-1);
//                            this.frontRightMotor.setPower(-1);
//                            this.backRightMotor.setPower(1);
//                        } else {
//                            this.frontLeftMotor.setPower(0);
//                            this.backLeftMotor.setPower(0);
//                            this.frontRightMotor.setPower(0);
//                            this.backRightMotor.setPower(0);
    }
}