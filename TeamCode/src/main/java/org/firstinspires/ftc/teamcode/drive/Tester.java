package org.firstinspires.ftc.teamcode.drive;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.teamcode.subsystem.Drive;
//import org.firstinspires.ftc.teamcode.subsystem.Controller2;

@TeleOp(name="Test", group="OpMode")
public class Tester extends OpMode {

    private final Drive controller = new Drive();
//    private final Controller2 controller2 = new Controller2();
    private ElapsedTime runtime = new ElapsedTime();


    @Override
    public void init() {

        this.controller.init(hardwareMap);
//        this.controller2.init(hardwareMap);
    }

    @Override
    public void start() {
        this.runtime.reset();
    }

    @Override
    public void loop() {
        if (this.runtime.seconds() < 120) {
            this.controller.setControl(gamepad1);
//            this.controller2.setControl2(gamepad2);
        }
//        @Override
//        public void stop() {
        }
    }
//}
