package org.firstinspires.ftc.teamcode.drive;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystem.Controller1;
import org.firstinspires.ftc.teamcode.subsystem.Controller2;


@TeleOp(name="Test", group="OpMode")
public class Tester extends OpMode {

    private final Controller1 controller1 = new Controller1();
    private final Controller2 controller2 = new Controller2();


    @Override
    public void init() {

        this.controller1.init(hardwareMap);
        this.controller2.init(hardwareMap);
    }

    @Override
    public void start(){}

    @Override
    public void loop(){
        this.controller1.setControl((gamepad1));
        this.controller2.setControl((gamepad2));
    }

    @Override
    public void stop(){
}
}
