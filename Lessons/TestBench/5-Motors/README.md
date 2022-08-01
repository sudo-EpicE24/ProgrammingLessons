# Lesson 5: Motors

## Setup:

Add a Falcon 500 to the RIO, and make sure to note it's CAN ID from Phoenix Tuner.

## Instructions:

Make the LED strip's color channels dependant on the triggers, for example the red channel dependant on the left trigger and blue on right trigger. In case you want to access a joystick axis manually, some constants have been given to you in [Constants.java](src/main/java/frc/robot/Constants.java). Make sure to import these by using `import static frc.robot.Constants.JoystickConstants;` with the other imports in [Robot.java](src/main/java/frc/robot/Robot.java).

Good luck!

# Links:
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

<details> <summary> Manually choosing a joystick axis </summary>

- The addresses of each axis are given in [Constants.java](src/main/java/frc/robot/Constants.java), and as long as you have imported the class in a static context, can be accessed with `JoystickConstants.%AXIS%`, where %AXIS% is your desired axis.
 
</details>