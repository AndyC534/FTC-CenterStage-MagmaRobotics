//package org.firstinspires.ftc.teamcode.subsystem;
//
//
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.Gamepad;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//import com.qualcomm.robotcore.hardware.Servo;
////import com.qualcomm.robotcore.util.Range;
//
//import org.firstinspires.ftc.teamcode.constants;
//
//public class Controller2 {
////    private DcMotor frontLeftMotor;
////    private DcMotor frontRightMotor;
////    private DcMotor backLeftMotor;
////    private DcMotor backRightMotor;
//    //    private DcMotor planeLaunchMotor;
//    private DcMotor liftMotor;
//    private DcMotor intakeMotor;
////    private DcMotor climbMotor;
////    private Servo climbHookServo;
//    private Servo theStick;
//
//    public Controller2() {
//    }
//    public void init(HardwareMap hwMap) {
////        this.frontLeftMotor = hwMap.get(DcMotor.class, constants.Button.frontLeftMotor);
////        this.frontRightMotor = hwMap.get(DcMotor.class, constants.Button.frontRightMotor);
////        this.backLeftMotor = hwMap.get(DcMotor.class, constants.Button.backLeftMotor);
////        this.backRightMotor = hwMap.get(DcMotor.class, constants.Button.backRightMotor);
//        this.theStick = hwMap.get(Servo.class,constants.Button.theStick);
////        this.climbMotor = hwMap.get(DcMotor.class,constants.Button.climbMotor);
////        this.climbHookServo = hwMap.get(Servo.class,constants.Button.climbHookServo);
////        this.planeLaunchMotor = hwMap.get(DcMotor.class, constants.Button.planeLaunchMotor);
//        this.intakeMotor = hwMap.get(DcMotor.class, constants.Button.intakeMotor);
//        this.liftMotor = hwMap.get(DcMotor.class, constants.Button.liftUpDownMotor);
////        this.frontLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
////        this.frontRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
////        this.backLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
////        this.backRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        this.liftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
////        this.climbMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
////        this.planeLaunchMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//    }
//
//    public void setControl(Gamepad gamepad) {
//            if (gamepad.left_bumper) {
//                this.theStick.setPosition(1);
//            } else {
//                if (gamepad.right_bumper) {
//                    this.theStick.setPosition(0);
//                }
//            }
//            if (gamepad.dpad_up) {
//                this.liftMotor.setPower(0.5);
//            } else {
//                if (gamepad.dpad_down) {
//                    this.liftMotor.setPower(-0.5);
//                } else {
//                    this.liftMotor.setPower(0);
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
//    }
//}