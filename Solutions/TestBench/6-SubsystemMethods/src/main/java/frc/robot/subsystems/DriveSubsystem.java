// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


import static frc.robot.Constants.DriveConstants.*;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class DriveSubsystem extends SubsystemBase {
  
  private DigitalInput limitSwitch = new DigitalInput(limitSwitchPort);
  private WPI_TalonFX motor = new WPI_TalonFX(motorID);

  /** Creates a new Inputs. */
  public DriveSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public boolean getLimitSwitch() {

    return limitSwitch.get();
  }

  /**
   * Speed between -1 and 1
   * @param speed
   */
  public void setMotorSpeed(double speed){

    double clampedSpeed = MathUtil.clamp(speed, -1, 1);

    motor.set(clampedSpeed);

  }
}
