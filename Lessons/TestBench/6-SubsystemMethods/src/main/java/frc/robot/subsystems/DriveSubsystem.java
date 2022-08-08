// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.utils.Candle;

import static frc.robot.Constants.DriveConstants.*;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new Inputs. */
  public DriveSubsystem() {

    DigitalInput limitSwitch = new DigitalInput(limitSwitchPort);
    TalonFX motor = new TalonFX(motorID);
    Candle candle = Candle.getInstance();
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
