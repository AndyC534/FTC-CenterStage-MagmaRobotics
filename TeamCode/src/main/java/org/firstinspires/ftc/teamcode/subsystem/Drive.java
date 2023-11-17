package org.firstinspires.ftc.teamcode.subsystem;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
//import com.qualcomm.robotcore.hardware.Servo;
//import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.constants;

public class Drive {
    private DcMotor frontLeftMotor;
    private DcMotor frontRightMotor;
    private DcMotor backLeftMotor;
    private DcMotor backRightMotor;


    public Drive() {
    }

    public void init(HardwareMap hwMap) {
        this.frontLeftMotor = hwMap.get(DcMotor.class, constants.Button.frontLeftMotor);
        this.frontRightMotor = hwMap.get(DcMotor.class, constants.Button.frontRightMotor);
        this.backLeftMotor = hwMap.get(DcMotor.class, constants.Button.backLeftMotor);
        this.backRightMotor = hwMap.get(DcMotor.class, constants.Button.backRightMotor);
        this.frontLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.frontRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.backLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.backRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    // Tank drive code
    public void setControl(Gamepad gamepad) {
        double leftPower;
        double rightPower;

        double leftDrive = -gamepad.left_stick_y;
        double rightDrive = gamepad.right_stick_y;
        leftPower = leftDrive;
        rightPower = rightDrive;

        this.frontLeftMotor.setPower(leftPower);
        this.frontRightMotor.setPower(rightPower);
        this.backLeftMotor.setPower(leftPower);
        this.backRightMotor.setPower(rightPower);
    }
}