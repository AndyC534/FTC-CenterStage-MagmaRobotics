package org.firstinspires.ftc.teamcode.drive.auto;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.Servo;
@Autonomous (name="autoBlueTop)", group="Auto")
@Disabled
public class autoBlueTop extends LinearOpMode {
    DcMotor backLeftMotor;
    DcMotor backRightMotor;
    DcMotor frontLeftMotor;
    DcMotor frontRightMotor;
//        DcMotor wrist;
//        DcMotor leftShoulder;
//        DcMotor rightShoulder;

    @Override
    public void runOpMode() {
        backLeftMotor = hardwareMap.get(DcMotor.class, "backLeftMotor");
        backRightMotor = hardwareMap.get(DcMotor.class, "backRightMotor");
        frontLeftMotor = hardwareMap.get(DcMotor.class, "frontLeftMotor");
        frontRightMotor = hardwareMap.get(DcMotor.class, "frontRightMotor");
//            wrist = hardwareMap.get(DcMotor.class, "wrist");
//            leftShoulder = hardwareMap.get(DcMotor.class, "leftShoulder");
//            rightShoulder = hardwareMap.get(DcMotor.class, "rightShoulder");

//            wrist.setPower(-1);
//            leftShoulder.setPower(-1);
//            rightShoulder.setPower(-1);


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
    }
}