# Lesson 1: Lights

For reference on deploying code and interfacing with the robot, use the README in the root of this repository

The majority of robot code is in [Robot.java](src/main/java/frc/robot/Robot.java), and this is also where you will be writing all of the code for this lesson.

Your goal is to change the lights on the LED strip using the methods in [Robot.java](src/main/java/frc/robot/Robot.java). Read the comments above each method to see when they will be called, and make sure that your code goes inside the curly braces {} belonging to each method.

To start off, use `candle.changeLedState()` to switch between a series of animations. You'll notice red squiggles underneath the statement, meaning there are errors. You have to give the method you are calling the state you want to change it to as an argument. 

To add an argument to a method call, add a variable inside of the parenthesis (), in this case `LEDState.Fire` to change the animation. You might notice that after you type `LEDState .` (dot) there are many different options. These are the animations that have been premade, and you can try them all out after you get Fire working. 

Make sure the robot is on and you are connected via wifi or USB (With Cloudflare WARP or any vpn service turned off), and make sure you have driver station open. Then deploy the robot code, and after it is deployed enable it in Teleop to test if your code works. 

After it works, try changing when the animations play, and making multiple animations play at different times. You can also change the type of animation if you're up for more of a challenge. 

# Links

- [Timed Robot Docs](https://docs.wpilib.org/en/stable/docs/software/vscode-overview/creating-robot-program.html#timedrobot)
- [Candle API](https://store.ctr-electronics.com/content/api/java/html/classcom_1_1ctre_1_1phoenix_1_1led_1_1_c_a_ndle.html)

# Hints
<details><summary>Candle Methods</summary>

- Use `candle.changeLedState(LEDState.Fire)` to switch around to different premade states by changing `Fire` to different animations. You can use `candle.setAllToColor()` to set all the lights to a given color, and if you want to play around with it more, try using `candle.setToAnimation()` to create your own custom animations.

</details>