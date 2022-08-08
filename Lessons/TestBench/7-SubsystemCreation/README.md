# Lesson 7 - Creating Subsystems

To create a new subsystem in VSCode, right-click on the `Subsystems` folder and select `Create a new class/command` at the very bottom. Then begin typing `subsystem` or find it in the list of options, and select it. You will be prompted to enter a name, our naming convention is `NameSubsystem` where `Name` is whatever you want. 




[Robot.java](src/main/java/frc/robot/Robot.java).

# Links:
- [Subystem docs](https://docs.wpilib.org/en/stable/docs/software/commandbased/subsystems.html)
- Click the `Java` link in any WPILib docs for access the the class API (Application Programming Interface), which is helpful for finding methods, constructors, and more details.
  
# Hints:

<details><summary>How to make methods</summary>

- Write `public int myMethod(double number, String name){}` to create a method named `myMethod` that returns an `int`, and takes a `double` and a `String` as parameters. You can switch out the return type, name, and parameters based on the application. Keep in mind you can have `void` as the return type if you don't want any return value.

</details>

<details><summary>How to make motors</summary>

- Write `private WPI_TalonFX name = new WPI_TalonFX(CANID);` to create a new motor with a given CAN ID. Make sure to write this code at the very top of the subsystem class, above the constructor, but still inside the first set of braces. You can do this for any 

</details>
