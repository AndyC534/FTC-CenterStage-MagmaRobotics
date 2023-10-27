package org.firstinspires.ftc.teamcode.drive.auton;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous (name="autoRedBottom)", group="Auto")
public class autoRedBottom extends LinearOpMode {
        DcMotor backLeftDrive;
        DcMotor backRightDrive;
        DcMotor frontLeftDrive;
        DcMotor frontRightDrive;
        DcMotor wrist;
        DcMotor leftShoulder;
        DcMotor rightShoulder;

        @Override
        public void runOpMode() {
            backLeftDrive = hardwareMap.get(DcMotor.class, "backLeftDrive");
            backRightDrive = hardwareMap.get(DcMotor.class, "backRightDrive");
            frontLeftDrive = hardwareMap.get(DcMotor.class, "frontLeftDrive");
            frontRightDrive = hardwareMap.get(DcMotor.class, "frontRightDrive");
//            wrist = hardwareMap.get(DcMotor.class, "wrist");
            leftShoulder = hardwareMap.get(DcMotor.class, "leftShoulder");
            rightShoulder = hardwareMap.get(DcMotor.class, "rightShoulder");
            backLeftDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            backRightDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

            leftShoulder.setPower(-1);
            rightShoulder.setPower(-1);
//            wrist.setPower(-1);

            frontLeftDrive.setPower(1);
            frontRightDrive.setPower(1);
            backLeftDrive.setPower(1);
            backRightDrive.setPower(1);

            sleep(650);

            frontLeftDrive.setPower(-1);
            frontRightDrive.setPower(-1);
            backLeftDrive.setPower(-1);
            backRightDrive.setPower(-1);

            sleep(611);

            frontLeftDrive.setPower(-1);
            frontRightDrive.setPower(1);
            backLeftDrive.setPower(1);
            backRightDrive.setPower(-1);

            sleep(2150);

            frontLeftDrive.setPower(0);
            frontRightDrive.setPower(0);
            backLeftDrive.setPower(0);
            backRightDrive.setPower(0);

            // ^ This is the code for parking //

        }
    }