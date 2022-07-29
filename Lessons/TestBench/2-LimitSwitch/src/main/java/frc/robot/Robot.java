// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.utils.Candle;



/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  
  private final Candle candle = Candle.getInstance();
  private final int limitPort = -1;
  private final DigitalInput limit = new DigitalInput(limitPort);

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {

  }

  /**
   * This function is called every robot packet, no matter the mode. Use this for items like
   * diagnostics that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {

    candle.periodic(); // Used to run the periodic in the Candle Util

  }

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    if(limit.get()) {
      candle.setAllToColor(0, 255, 0);
    } else {
      candle.setAllToColor(255, 0, 0);
    }
  }

  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {

  }

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {

  }

}