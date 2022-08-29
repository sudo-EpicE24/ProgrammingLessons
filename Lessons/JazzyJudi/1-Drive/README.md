# Lesson 8 - Intro to Command-Based

Using the `ExampleCommand` and `ExampleSubsystem` as examples, create a command that runs a motor in the `driveSubsystem` when a button is pressed. Right-click on the `commands` folder, and select `Create a new class/command`, then click on `Command(New)`. If you click on `Command(Old)` things won't work. 

# Links:
- [Subystem docs](https://docs.wpilib.org/en/stable/docs/software/commandbased/subsystems.html)
- [Command docs](https://docs.wpilib.org/en/stable/docs/software/commandbased/commands.html)
- [Binding Commands docs](https://docs.wpilib.org/en/stable/docs/software/commandbased/binding-commands-to-triggers.html)
- Click the `Java` link in any WPILib docs for access the the class API (Application Programming Interface), which is helpful for finding methods, constructors, and more details.
  
# Hints:

<details><summary>What goes in a Command</summary>

- Use the steps above to create a new `Command`. Make sure the constructor has a parameter with whatevever subsystem you will use, ex: `(MySubsystem mySubsystem)`. After that, make sure you have put `private final MySubsystem mySubsystem` inside the class, above the constructor. Then, inside the constructor, write `mySubsystem = mySubsystem`, followed by `addRequirements(mySubsystem)`. This is honestly super confusing, but basically you create a private variable, then take the subsystem that gets passed into the constructor, and set the variable equal to that. You do this so you are able to use the subsystem outside of the constructor in the rest of the command. 

- After following the steps above, use `mySubsystem` to execute whatever code you need to. Make sure to think about when the command should end, what should happen when it ends(stopping motors that are running for safety), and then implement everything. 

</details>

<details><summary>Bind the command</summary>

- First, navigate to `RobotContainer.java`, then find the `ConfigureButtonBindings()` method. To bind a button, type `new JoystickButton(joystick, JoystickConstants.buttonOfYourChoice).whileHeld(new MyCommand(mySubsystem))`. This will run an instance of `MyCommand` which requires `mySubsystem` while the button is held. Look at the docs to see what you can use other than `.whileHeld()`. If it doesn't work, make sure your command is imported correctly into `robotContainer`.

</details>

