package org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.Robot;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.DriveTrain.DualMotorDrive1;

public class Jetsam_Bot_Camden extends DualMotorDrive1 {

    //hardware variable
    public HardwareMap hwBot = null;

    public Servo flag = null;

    public RevBlinkinLedDriver ledLights;
    public RevBlinkinLedDriver.BlinkinPattern ledPattern;

    public Jetsam_Bot_Camden() {

    }

    public void initJetsam(HardwareMap hwMap) {

        hwBot = hwMap;

        rearLeftMotor = hwBot.dcMotor.get("rear_left_motor");
        rearRightMotor = hwBot.dcMotor.get("rear_right_motor");

        rearLeftMotor.setDirection(DcMotor.Direction.FORWARD);
        rearRightMotor.setDirection(DcMotor.Direction.REVERSE);

        setMotorRunModes(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        setMotorRunModes(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        rearLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rearRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


        //servo init
        flag = hwBot.get(Servo.class, "flag");
        flag.setDirection(Servo.Direction.FORWARD);

        ledLights = hwBot.get(RevBlinkinLedDriver.class, "led_strip");

        ledPattern = RevBlinkinLedDriver.BlinkinPattern.COLOR_WAVES_LAVA_PALETTE;
        ledLights.setPattern((ledPattern));

    }

    //servo methods
    public void raiseFlag() {
        flag.setPosition(0.5);
    }

    public void lowerFlag() {
        flag.setPosition(0);
    }

    public void setLedPattern (RevBlinkinLedDriver.BlinkinPattern patternName){
            ledLights.setPattern(patternName);

    }



}


