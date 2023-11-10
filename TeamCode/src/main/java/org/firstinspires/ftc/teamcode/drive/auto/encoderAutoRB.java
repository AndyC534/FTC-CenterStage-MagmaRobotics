package org.firstinspires.ftc.teamcode.drive.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
//import com.qualcomm.robotcore.hardware.Servo;


@Autonomous(name="encoderAutoRB", group="Autonomous")
public class encoderAutoRB extends LinearOpMode {

    private DcMotor frontLeftMotor;
    private DcMotor frontRightMotor;
    private DcMotor backLeftMotor;
    private DcMotor backRightMotor;

    private int leftPos;
    private int rightPos;

    @Override
    public void runOpMode() {
        frontLeftMotor = hardwareMap.get(DcMotor.class, "frontLeftMotor");
        backLeftMotor = hardwareMap.get(DcMotor.class, "backLeftMotor");

        frontRightMotor = hardwareMap.get(DcMotor.class, "frontRightMotor");
        backRightMotor = hardwareMap.get(DcMotor.class, "backRightMotor");

//        upDown = hardwareMap.get(DcMotor.class, "upDownMotor");
//        frontBack = hardwareMap.get(DcMotor.class, "frontBackMotor");

        frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        upDown.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        frontRightMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        backRightMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        leftPos = 0;
        rightPos = 0;

        waitForStart();

        move(100, 100, 0.5);
    }

    private void move(int leftTarget, int rightTarget, double speed) {
        leftPos += leftTarget;
        rightPos += rightTarget;

        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        frontLeftMotor.setPower(speed);
        frontRightMotor.setPower(speed);
        backLeftMotor.setPower(speed);
        backRightMotor.setPower(speed);

        frontLeftMotor.setTargetPosition(leftPos);
        frontRightMotor.setTargetPosition(rightPos);
        backLeftMotor.setTargetPosition(leftPos);
        backRightMotor.setTargetPosition(rightPos);

        while (opModeIsActive() && anyMotorBusy()) {
            idle();
        }
    }

    /**
     * Return true if any motor is still moving.
     */
    private boolean anyMotorBusy() {
        if (frontLeftMotor.isBusy()) return true;
        if (frontRightMotor.isBusy()) return true;
        if (backLeftMotor.isBusy()) return true;
        if (backRightMotor.isBusy()) return true;
        return false;
    }
}
// either 0.04 or -0.04 for continuous servo