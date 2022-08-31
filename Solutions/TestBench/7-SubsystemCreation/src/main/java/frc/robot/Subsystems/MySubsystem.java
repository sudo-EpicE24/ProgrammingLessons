// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MySubsystem extends SubsystemBase {


  private WPI_TalonFX myMotor = new WPI_TalonFX(5);

  /** Creates a new MySubsystem. */
  public MySubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setMotorSpeed(double speed) {
    myMotor.set(speed);
  }

  public double getMotorSpeed(double speed) {
    return myMotor.get();
  }
}
