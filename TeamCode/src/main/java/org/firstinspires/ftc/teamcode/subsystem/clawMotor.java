//package org.firstinspires.ftc.teamcode.subsystem;
//
//import com.qualcomm.robotcore.hardware.CRServo;
//import com.qualcomm.robotcore.hardware.Gamepad;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//import org.firstinspires.ftc.teamcode.constants;
//
//public class clawMotor extends Controller2 {
//
//    private CRServo clawCRServo;
//
//    // initialization
//    public clawMotor() {
//    }
//
//    public void init(HardwareMap hwMap) {
//        this.clawCRServo = hwMap.get(CRServo.class, constants.Button.clawMotor);
//    }
//
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
//    }
//}
//
////    public void init(HardwareMap hwMap) {
////        this.clawMotor = hwMap.get(Servo.class, Constants.clawMotor.clawMotor);
////    }
//
//
//    // open claws
//    public void in() {
//        this.clawMotor.setPosition(1);
//    }
//
//
//    // close claws
//    public void out() {
//        this.clawMotor.setPosition(-1);
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