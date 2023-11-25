//package org.firstinspires.ftc.teamcode.subsystem;
//
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.Gamepad;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//import org.firstinspires.ftc.teamcode.constants;
//
//public class Intake extends Controller2 {
//
//    private DcMotor intakeMotor;
//
//    public Intake() {
//    }
//
//    public void init(HardwareMap hwMap) {
//        this.intakeMotor = hwMap.get(DcMotor.class, constants.Button.intakeMotor);
//    }
//
//    public void setControl(Gamepad gamepad2) {
//        if (gamepad2.y) {
//            this.intakeMotor.setPower(1);
//        } else {
//            if (gamepad2.a) {
//                this.intakeMotor.setPower(-1);
//            } else {
//                this.intakeMotor.setPower(0);
//            }
//        }
//    }
//}

//
//public class Intake {
//
//
//    private DcMotor intakeMotor;
//
//    // initialization
//    public Intake() {
//
//    }
//
//    public void init(HardwareMap hwMap) {
//        this.intakeMotor = hwMap.get(DcMotor.class, constants.intakeMotor);
//    }
//
//
//    // open claws
//    public void forward() {
//        this.intakeMotor.setPower(-constants.Intake.forward);
//    }
//
//    public void backward() {
//        this.intakeMotor.setPower(-constants.Intake.backward);
//    }
//
//
//    // controller logic
//    public void setControl(Gamepad gamepad) {
//        if (gamepad.x) {
//            this.forward();
//        } else if (gamepad.y) {
//            this.backward();
//        }
//    }
//}