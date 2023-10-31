//package org.firstinspires.ftc.teamcode.drive.auton.encoder;
//
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
////import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
//
//@Autonomous(name="encoderAutonRT", group="Autonomous")
////@Disabled
//public class encoderDriveAutonRT extends LinearOpMode {
//
//    private DcMotor frontLeftDrive = null;
//    private DcMotor frontRightDrive = null;
//    private DcMotor backLeftDrive = null;
//    private DcMotor backRightDrive = null;
//
//    private ElapsedTime runtime = new ElapsedTime();
//
//    static final double COUNTS_PER_MOTOR_REV = 537.6;    // This is for the NeveRest Orbital 20 Gearmotor
//    static final double DRIVE_GEAR_REDUCTION = 1.0;     // No External Gearing.
//    static final double WHEEL_DIAMETER_INCHES = 4.0;     // This is for the 4" mecanum wheels
//    static final double COUNTS_PER_INCH = (COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION) /
//            (WHEEL_DIAMETER_INCHES * 3.141592);
//    static final double DRIVE_SPEED = 0.8;
//    static final double TURN_SPEED = 0.6;
//
//    @Override
//    public void runOpMode() {
//
//        frontLeftDrive = hardwareMap.get(DcMotor.class, "frontLeftDrive");
//        frontRightDrive = hardwareMap.get(DcMotor.class, "frontRightDrive");
//        backLeftDrive = hardwareMap.get(DcMotor.class, "backLeftDrive");
//        backRightDrive = hardwareMap.get(DcMotor.class, "backRightDrive");
//
//        // To drive forward, most robots need the motor on one side to be reversed, because the axles point in opposite directions.
//
//        frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);
//        frontRightDrive.setDirection(DcMotor.Direction.FORWARD);
//        backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
//        backRightDrive.setDirection(DcMotor.Direction.FORWARD);
//
//        frontLeftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontRightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backLeftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backRightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        frontLeftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        frontRightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        backLeftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        backRightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//
//        // Send telemetry message to indicate successful Encoder reset
//        telemetry.addData("Starting at", "%7d :%7d",
//                frontLeftDrive.getCurrentPosition(),
//                frontRightDrive.getCurrentPosition());
//        backLeftDrive.getCurrentPosition();
//        backRightDrive.getCurrentPosition();
//        telemetry.update();
//
//        waitForStart();
//
//        // Note: Reverse movement is obtained by setting a negative distance (not speed)
//        encoderDrive(DRIVE_SPEED, 23.5, 23.5, 0.5);  // S1: Forward 23.5 inches with 0.5 Sec timeout
//        encoderDrive(TURN_SPEED, 2, -2, 0.5);  // S3: Turn right 2 inches with 0.5 sec timeout
//        encoderDrive(DRIVE_SPEED, 25, 25, 3.0);  // S4: Forward 25 inches with 3 Sec timeout
//
//        telemetry.addData("Path", "Complete");
//        telemetry.update();
//        sleep(1000);  // pause to display final telemetry message.
//    }
//    public void encoderDrive(double speed,
//                             double leftInches, double rightInches,
//                             double timeoutS) {
//    }
//}