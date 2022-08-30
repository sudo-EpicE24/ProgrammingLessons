// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.utils;

import java.util.function.DoubleSupplier;

import com.ctre.phoenix.led.Animation;
import com.ctre.phoenix.led.CANdle;
import com.ctre.phoenix.led.CANdleConfiguration;
import com.ctre.phoenix.led.ColorFlowAnimation;
import com.ctre.phoenix.led.FireAnimation;
import com.ctre.phoenix.led.LarsonAnimation;
import com.ctre.phoenix.led.SingleFadeAnimation;
import com.ctre.phoenix.led.TwinkleAnimation;
import com.ctre.phoenix.led.CANdle.LEDStripType;
import com.ctre.phoenix.led.CANdle.VBatOutputMode;
import com.ctre.phoenix.led.ColorFlowAnimation.Direction;
import com.ctre.phoenix.led.LarsonAnimation.BounceMode;
import com.ctre.phoenix.led.TwinkleAnimation.TwinklePercent;

import edu.wpi.first.networktables.NetworkTableInstance;

/** Add your docs here. */
public class Candle {
    private static Candle CANDLE = null;

    private int ledOffset = 8; // LED Offset Used Throughout All Animations
    private int stripLength = 60; // The amount of LEDs we actually want to control (Don't go too high or current draw will be too much)
    private final int CANDLE_ID = 6; // CAN ID of the candle
    private CANdle candle = new CANdle(CANDLE_ID); //Creates an instance of the CANdle, this is what we send commands to


    private int solidR = 255; // Default color values for solid LEDs
    private int solidB = 0;
    private int solidG = 255;

    


    // This holds all the possible LED states that have been programmed
    public enum LEDState {
        Fire,
        Larson,
        ColorFlow,
        Twinkle,
        SolidColor,
        Off
    }

    private LEDState currentState = LEDState.Off; // Initialize current LED state

    public Candle() {
        changeLedState(LEDState.Off);

        // Configure settings on the candle
        CANdleConfiguration configAll = new CANdleConfiguration();
        configAll.statusLedOffWhenActive = true;
        configAll.disableWhenLOS = false;
        configAll.stripType = LEDStripType.GRB;
        configAll.brightnessScalar = 0.1;
        configAll.vBatOutputMode = VBatOutputMode.Modulated;

        candle.configAllSettings(configAll, 100);
        candle.configLOSBehavior(true);
    }


    /**
     *
     * This is used to switch between the premade LED states
     *  
     * @param state
     */
    public void changeLedState(LEDState state) {

        for (int i = 0; i < 10; ++i) {
            candle.clearAnimation(i);
        }
        candle.setLEDs(0, 0, 0, 0, 8, 128);
        switch (state) {
            case Fire:
                candle.animate(new FireAnimation(1, 0.7, stripLength, 0.8, 0.4, false, ledOffset), 1);

                currentState = LEDState.Fire;
                // candle.animate(new TwinkleAnimation(255, 18, 213, 0, .1, 120 + 8 - 58,
                // TwinklePercent.Percent30, 58), 3);
                break;
            case Twinkle:
                candle.animate(new TwinkleAnimation(255, 255, 255, 255, .5, stripLength, TwinklePercent.Percent30, ledOffset), 1);

                currentState = LEDState.Twinkle;
                break;
            case Larson:

                candle.animate(new LarsonAnimation(255, 0, 255, 255, .3, stripLength, BounceMode.Front, 4, ledOffset), 1);

                currentState = LEDState.Larson;
                break;
            case ColorFlow:

                candle.animate(new ColorFlowAnimation(255, 0, 0, 255, .4, stripLength, Direction.Forward, ledOffset), 1);

                currentState = LEDState.ColorFlow;
                break;
            case SolidColor:

                currentState = LEDState.SolidColor;
                break;

            case Off:

                currentState = LEDState.Off;
                break;
            default:
                break;
        }
    }


    /**
     * 
     * This should be called in robot periodic for it to work as a periodic method
     */
    public void periodic() {


        if(currentState == LEDState.SolidColor) candle.setLEDs(solidR, solidG, solidB, 255, ledOffset, stripLength);


    }

    public double getVbat() {
        return candle.getBusVoltage();
    }

    public double get5V() {
        return candle.get5VRailVoltage();
    }

    public double getCurrent() {
        return candle.getCurrent();
    }

    public double getTemperature() {
        return candle.getTemperature();
    }

    public void configBrightness(double percent) {
        candle.configBrightnessScalar(percent, 0);
    }

    public void configLos(boolean disableWhenLos) {
        candle.configLOSBehavior(disableWhenLos, 0);
    }

    public void configLedType(LEDStripType type) {
        candle.configLEDType(type, 0);
    }

    public void configStatusLedBehavior(boolean offWhenActive) {
        candle.configStatusLedState(offWhenActive, 0);
    }


    /**
     * 
     * Set all LEDs to a specified color when callede
     * 
     * @param r Red value 0 (none) - 255 (full)
     * @param g Green value 0 (none) - 255 (full)
     * @param b Blue value 0 (none) - 255 (full)
     */
    public void setAllToColor(int r, int g, int b) {

        if(r == solidR && g == solidG && b == solidB) {
            currentState = LEDState.SolidColor;
            return;
        }

        solidR = r;
        solidB = b;
        solidG = g;

        currentState = LEDState.SolidColor;

    }


    /**
     * This is used for custom animations that are not a part of LEDStates
     * 
     * @param animation
     */
    public void setToAnimation(Animation animation){

        for (int i = 0; i < 10; ++i) {
            candle.clearAnimation(i);
        }
        candle.animate(animation);
    } 

    /**
     * @return The Single instance of Singleton Candle
     */
    public static Candle getInstance() {
        // To ensure only one instance is created
        if (CANDLE == null) {
            CANDLE = new Candle();
        }
        return CANDLE;
    }

}
