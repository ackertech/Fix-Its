package org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.Control;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.Robot.Arm_Bot;

@TeleOp(name = "ArmBotTeleOp")

public class ArmBotTeleOp extends OpMode {

    boolean elbowMove = false;

    public Arm_Bot Bot = new Arm_Bot();

    public void init() {
        Bot.initArmBot(hardwareMap);

    }

    public void loop() {

        handControl();
        elbowControl();
    }

    public void handControl() {
        if (gamepad1.a) {
            Bot.point();
        }

        else if (gamepad1.b) {
            Bot.openHand();
        }

        else if (gamepad1.left_bumper) {
            Bot.solute();
        }

        else if (gamepad1.x) {
            Bot.thumbsUp();
        }

        else {
            Bot.closeHand();
        }


    }


    public void elbowControl() {


        if (gamepad1.dpad_up == true && elbowMove == false) {
            elbowMove = true;
        }

        if (elbowMove = true) {
            Bot.moveElbowOpen();
        }
        if (Bot.elbowJ.getPosition() >= Bot.elbowOpen) {
            elbowMove = false;
        }

        if (gamepad1.dpad_down == true && elbowMove == false) {
            elbowMove = true;

    }

        if (elbowMove = true) {
            Bot.moveElbowClose();
        }

        if (Bot.elbowJ.getPosition() >= Bot.elbowOpen) {
            elbowMove = false;
        }

}



}