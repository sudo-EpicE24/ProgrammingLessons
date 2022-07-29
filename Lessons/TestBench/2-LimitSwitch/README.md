# Lesson 2: Limit Switch

Plug in a limit switch into any of the DIO (Digital Input/Output ports) and set the local variable `limitPort` in [Robot.java](src/main/java/frc/robot/Robot.java) to the correct index (It won't work as `-1`!).

Then, have the `CANdle` switch between 2 different colors depending on the output of the limit.

Try visiting the docs and looking for what methods are avalible for the [DigitalInput](https://docs.wpilib.org/en/stable/docs/software/hardware-apis/sensors/digital-inputs-software.html) (The limit switch's representation in code) before moving on to the hints. If you do end up using the hints, make sure to check each link to be able to research on your own. A huge part of coding is reading docs!

As an added challenge, use a debouncer to clean the input from the limit switch.

Good luck!

# Links:
- [DigitalInput docs](https://docs.wpilib.org/en/stable/docs/software/hardware-apis/sensors/digital-inputs-software.html)
- [Debouncer docs](https://docs.wpilib.org/en/stable/docs/software/advanced-controls/filters/debouncer.html?highlight=debouncer)
- Click the `Java` link in any WPILib docs for access the the class API (Application Programming Interface), which is helpful for finding methods, constructors, and more details.
  
# Hints:

<details> <summary>Where to write your code</summary> <li> Put your code in <a>Robot.java</a>'s <code>teleopPeriodic()</code> method to have it run every <a href="https://docs.wpilib.org/en/stable/docs/software/vscode-overview/creating-robot-program.html#timedrobot">robot loop</a> (20 ms) </details>

<details> <summary> Switching CANdle colors </summary> <li> Switch the candle between solid colors using the <code>Candle</code>'s <code>setAllToColor(r, g, b)</code> method, where each parameter is an integer from 0-255 representing the strength of each color channel </details>

<details> <summary> Getting input from the limit switch </summary> <li> Get the current state of the limit switch by using the <code>DigitalInput</code>'s <code>get()</code> method to get a boolean value (<code>true</code> for pressed, <code>false</code> for unpressed) </details>