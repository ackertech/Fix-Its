package org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.Control;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.Robot.Jetsam_Bot_Camden;

@Autonomous (name = "AutonomousTestJetsam")

public class Auto extends LinearOpMode {

    Jetsam_Bot_Camden Bot = new Jetsam_Bot_Camden();

    @Override

    public void runOpMode() throws InterruptedException {


        Bot.initJetsam(hardwareMap);

        telemetry.addLine("Awaiting Start");
        telemetry.update();
        waitForStart();

        while (opModeIsActive()){

            //square
            Bot.driveForward(1);
            sleep(2000);
            Bot.turnRight(0.5);
            sleep(1000);
            Bot.driveForward(1);
            sleep(2000);
            Bot.turnRight(0.5);
            sleep(1000);
            Bot.driveForward(1);
            sleep(2000);
            Bot.turnRight(0.5);
            sleep(1000);
            Bot.driveForward(1);

                requestOpModeStop();
        }

        idle();

        }

}
