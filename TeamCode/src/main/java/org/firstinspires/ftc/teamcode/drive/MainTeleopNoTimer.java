//package org.firstinspires.ftc.teamcode.drive;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
////import org.firstinspires.ftc.teamcode.subsystem.Intake;
////import org.firstinspires.ftc.teamcode.subsystem.Lift;
////import org.firstinspires.ftc.teamcode.subsystem.MecanumDrive;
////import org.firstinspires.ftc.teamcode.subsystem.theStick;
//
//
//@TeleOp(name="Main Teleop Mode", group="OpMode")
//public class MainTeleopNoTimer extends OpMode {
//
//
//    private ElapsedTime runtime = new ElapsedTime();
//    private MecanumDrive drive = new MecanumDrive();
////    private Lift lift = new Lift();
////    private Intake intake = new Intake();
//    private theStick theStick = new theStick();
//
//    @Override
//    public void init() {
//        this.drive.init(hardwareMap);
////        this.lift.init(hardwareMap);
////        this.intake.init(hardwareMap);
//        this.theStick.init(hardwareMap);
//
//        telemetry.addData("Status", "Initialized");
//    }
//
//    @Override
//    public void start() {
//    }
//
//    @Override
//    public void loop() {
//            this.drive.setControl(gamepad1);
//
//    }
//
//
//    @Override
//    public void stop() {
//        telemetry.addData("Status", "Stopped");
//    }
//
//
//}