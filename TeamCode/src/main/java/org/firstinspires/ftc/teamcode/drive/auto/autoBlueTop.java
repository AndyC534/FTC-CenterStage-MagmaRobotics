package org.firstinspires.ftc.teamcode.drive.auto;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.Servo;
@Autonomous (name="backupAuto", group="Autonomous")
//@Disabled
public class autoBlueTop extends LinearOpMode {
    DcMotor BackLeftDrive;
    DcMotor BackRightDrive;
    DcMotor FrontLeftDrive;
    DcMotor FrontRightDrive;
//        DcMotor wrist;
//        DcMotor leftShoulder;
//        DcMotor rightShoulder;

    @Override
    public void runOpMode() {
        BackLeftDrive = hardwareMap.get(DcMotor.class, "BackLeftDrive");
        BackRightDrive = hardwareMap.get(DcMotor.class, "BackRightDrive");
        FrontLeftDrive = hardwareMap.get(DcMotor.class, "FrontLeftDrive");
        FrontRightDrive = hardwareMap.get(DcMotor.class, "FrontRightDrive");
//            wrist = hardwareMap.get(DcMotor.class, "wrist");
//            leftShoulder = hardwareMap.get(DcMotor.class, "leftShoulder");
//            rightShoulder = hardwareMap.get(DcMotor.class, "rightShoulder");

//            wrist.setPower(-1);
//            leftShoulder.setPower(-1);
//            rightShoulder.setPower(-1);


        FrontLeftDrive.setPower(1);
        FrontRightDrive.setPower(-1);
        BackLeftDrive.setPower(1);
        BackRightDrive.setPower(-1);

        sleep(2500);

        FrontLeftDrive.setPower(0);
        FrontRightDrive.setPower(0);
        BackLeftDrive.setPower(0);
        BackRightDrive.setPower(0);

        sleep(90000000);
    }
}