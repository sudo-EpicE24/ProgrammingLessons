# Lesson 5: Motors

## Setup:

Add a Falcon 500 to the CAN loop, plug it into power, and make sure to note it's CAN ID from Phoenix Tuner.

## Instructions:

Make the Falcon's output dependant on any axis, just like the LED strip.

Good luck!

# Links:
- [TalonFX API](https://store.ctr-electronics.com/content/api/java/html/classcom_1_1ctre_1_1phoenix_1_1motorcontrol_1_1can_1_1_talon_f_x.html)
- [Joystick docs](https://docs.wpilib.org/en/stable/docs/software/basic-programming/joystick.html)
- [Joystick API](https://first.wpi.edu/wpilib/allwpilib/docs/release/java/edu/wpi/first/wpilibj/Joystick.html)
- [XBoxController docs](https://docs.wpilib.org/en/stable/docs/software/basic-programming/joystick.html#xboxcontroller-class)
- [XBoxController API](https://first.wpi.edu/wpilib/allwpilib/docs/release/java/edu/wpi/first/wpilibj/XboxController.html)
  
# Hints:

<details><summary>Where to write your code</summary>

- Put your code in [Robot.java](src/main/java/frc/robot/Robot.java)'s `teleopPeriodic()` method to have it run every [robot loop](https://docs.wpilib.org/en/stable/docs/software/vscode-overview/creating-robot-program.html#timedrobot") (20 ms)

</details>

<details> <summary> Switching CANdle colors </summary>

- Switch the candle between solid colors using the `Candle`'s `setAllToColor(r, g, b)` method, where each parameter is an integer from 0-255 representing the strength of each color channel

</details>

<details> <summary> Getting values from the joystick </summary>

- Get the current input from any axis on the joystick (joysticks and triggers) by using the `Joystick`'s `getRawAxis(axis)` method, where axis is the integer address of the target axis. Alternatively (easier option), use one of `XboxController`'s prebuilt methods such as `getLeftTriggerAxis()`
 
</details>

<details> <summary> Writing output to Falcon 500 </summary>

- Use the `WPI_TalonFX`'s `set(percentage)` to set the motor's speed to a percentage output (0.0 for off, 1.0/-1.0 for full forward/backward), or `setVoltage(outputVolts)` to give the motor a specified voltage (0.0 for off, 12.0/-12.0 for full forward/backward)
 
</details>