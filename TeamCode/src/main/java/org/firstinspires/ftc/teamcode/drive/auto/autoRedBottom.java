package org.firstinspires.ftc.teamcode.drive.auto;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous (name="autoRedBottom)", group="Auto")
//@Disabled
public class autoRedBottom extends LinearOpMode {
        DcMotor backLeftMotor;
        DcMotor backRightMotor;
        DcMotor frontLeftMotor;
        DcMotor frontRightMotor;


        @Override
        public void runOpMode() {

            backLeftMotor = hardwareMap.get(DcMotor.class, "backLeftMotor");
            backRightMotor = hardwareMap.get(DcMotor.class, "backRightMotor");
            frontLeftMotor = hardwareMap.get(DcMotor.class, "frontLeftMotor");
            frontRightMotor = hardwareMap.get(DcMotor.class, "frontRightMotor");
            backLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            backRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            waitForStart();


            frontLeftMotor.setPower(1);
            frontRightMotor.setPower(-1);
            backLeftMotor.setPower(1);
            backRightMotor.setPower(-1);

            sleep(2500);

            frontLeftMotor.setPower(0);
            frontRightMotor.setPower(0);
            backLeftMotor.setPower(0);
            backRightMotor.setPower(0);

            sleep(90000000);

//            frontLeftMotor.setPower(-1);
//            frontRightMotor.setPower(-1);
//            backLeftMotor.setPower(-1);
//            backRightMotor.setPower(-1);
//
//            sleep(1200);
//
//            frontLeftMotor.setPower(-1);
//            frontRightMotor.setPower(1);
//            backLeftMotor.setPower(1);
//            backRightMotor.setPower(-1);
//
//            sleep(4000);
//
//            frontLeftMotor.setPower(0);
//            frontRightMotor.setPower(0);
//            backLeftMotor.setPower(0);
//            backRightMotor.setPower(0);

            // ^ This is the code for parking //

//            return false;
        }
    }