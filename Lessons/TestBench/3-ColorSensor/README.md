# Lesson 3: Color Sensor

## Setup:

Make sure there is a color sensor plugged into the onboard I2C port on the RIO

## Instructions:

First, have the LED strip display a single color, with the intensity based on the proximity to the color sensor. Then, set the color to whatever the color sensor is reading.

Good luck!

# Links:
- [ColorSensor V3 API](https://codedocs.revrobotics.com/java/com/revrobotics/colorsensorv3)
- [ColorSensor V3 Demos](https://github.com/REVrobotics/Color-Sensor-v3-Examples/tree/master/Java)
  
# Hints:

<details><summary>Where to write your code</summary>

- Put your code in [Robot.java](src/main/java/frc/robot/Robot.java)'s `teleopPeriodic()` method to have it run every [robot loop](https://docs.wpilib.org/en/stable/docs/software/vscode-overview/creating-robot-program.html#timedrobot") (20 ms)

</details>

<details> <summary> Switching CANdle colors </summary>

- Switch the candle between solid colors using the `Candle`'s `setAllToColor(r, g, b)` method, where each parameter is an integer from 0-255 representing the strength of each color channel

</details>

<details> <summary> Getting proximiy from the color sensor </summary>

- Get the current proximity of the color sensor by using the `ColorSensorV3`'s `getProximity()` method to get an integer value (`0` for maximum distance, `2047` for minimum distance)
 
</details>

<details> <summary> Getting color from the color sensor </summary>

- Get the current colr of the color sensor by using the `ColorSensorV3`'s `getColor()` method to get a `Color` object.
- Use the `Color` object's `red`, `green`, and `blue` fields to access the intensity of each color (`0` for no color in that channel, `1` for full color in that channel)
 
</details>