//package org.firstinspires.ftc.teamcode.subsystem;
//
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.Gamepad;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//
//import org.firstinspires.ftc.teamcode.constants;
//
//
//public class MecanumDrive {
//
//
//    private DcMotor frontLeftMotor;
//    private DcMotor backLeftMotor;
//    private DcMotor frontRightMotor;
//    private DcMotor backRightMotor;
//
//
//    // initialization
//    public MecanumDrive() {
//
//    }
//
//
//    public void init(HardwareMap hwMap) {
//        this.frontLeftMotor = hwMap.get(DcMotor.class, constants.Button.frontLeftMotor);
//        this.backLeftMotor = hwMap.get(DcMotor.class, constants.Button.backLeftMotor);
//        this.frontRightMotor = hwMap.get(DcMotor.class, constants.Button.frontRightMotor);
//        this.backRightMotor = hwMap.get(DcMotor.class, constants.Button.backRightMotor);
//
//
//        this.frontLeftMotor.setDirection(DcMotor.Direction.REVERSE);
//        this.backLeftMotor.setDirection(DcMotor.Direction.REVERSE);
//        this.frontRightMotor.setDirection(DcMotor.Direction.FORWARD);
//        this.backRightMotor.setDirection(DcMotor.Direction.FORWARD);
//
//        this.frontLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        this.backLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        this.frontRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        this.backRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//    }
//
//
//    // normal drive
//    public void setNormal(double leftPower, double rightPower) {
//        this.frontLeftMotor.setPower(leftPower);
//        this.backLeftMotor.setPower(leftPower);
//        this.frontRightMotor.setPower(rightPower);
//        this.backRightMotor.setPower(rightPower);
//    }
//
//
//    // strafe drive
//    public void setStrafe(double leftPower, double rightPower) {
//        this.frontLeftMotor.setPower(-leftPower);
//        this.backLeftMotor.setPower(leftPower);
//        this.frontRightMotor.setPower(-rightPower);
//        this.backRightMotor.setPower(rightPower);
//    }
//
//
//    public void stop() {
//        this.setNormal(0, 0);
//    }
//
//
//    public void goForward() {
//        this.setNormal(0.5, 0.5);
//    }
//
//
//    public void goBackward() {
//        this.setNormal(0.5, 0.5);
//    }
//
//
//    // controller logic
//    public void setControl(Gamepad gamepad) {
//        if (gamepad.left_bumper) {
//            this.setStrafe(-0.5, -0.5);
//        } else if (gamepad.right_bumper) {
//            this.setStrafe(0.5, 0.5);
//        } else if (gamepad.dpad_up) {
//            this.goForward();
//        } else if (gamepad.dpad_down) {
//            this.goBackward();
//        } else {
//            this.setNormal(gamepad.left_stick_y, gamepad.right_stick_y);
//        }
//    }
//
//
//}