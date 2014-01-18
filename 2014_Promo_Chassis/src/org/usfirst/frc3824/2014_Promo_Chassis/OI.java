// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3824.2014_Promo_Chassis;

import org.usfirst.frc3824.2014_Promo_Chassis.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton joystickShoot1;
    public JoystickButton joystickShoot2;
    public JoystickButton joystickShoot3;
    public JoystickButton joystickShoot4;
    public JoystickButton joystickShooterUp;
    public JoystickButton joystickShooterDown;
    public Joystick driveJoystick;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        driveJoystick = new Joystick(1);
        
        joystickShooterDown = new JoystickButton(driveJoystick, 6);
        joystickShooterDown.whileHeld(new ShooterAngleDown());
        joystickShooterUp = new JoystickButton(driveJoystick, 5);
        joystickShooterUp.whileHeld(new ShooterAngleUp());
        joystickShoot4 = new JoystickButton(driveJoystick, 4);
        joystickShoot4.whileHeld(new CannonShoot4());
        joystickShoot3 = new JoystickButton(driveJoystick, 3);
        joystickShoot3.whileHeld(new CannonShoot3());
        joystickShoot2 = new JoystickButton(driveJoystick, 2);
        joystickShoot2.whileHeld(new CannonShoot2());
        joystickShoot1 = new JoystickButton(driveJoystick, 1);
        joystickShoot1.whileHeld(new CannonShoot1());

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());

        SmartDashboard.putData("Cannon Shoot 1", new CannonShoot1());

        SmartDashboard.putData("Cannon Shoot 2", new CannonShoot2());

        SmartDashboard.putData("Cannon Shoot 3", new CannonShoot3());

        SmartDashboard.putData("Cannon Shoot 4", new CannonShoot4());

        SmartDashboard.putData("Shooter Angle Up", new ShooterAngleUp());

        SmartDashboard.putData("Shooter Angle Down", new ShooterAngleDown());

        SmartDashboard.putData("Drivetrain Normal Drive", new DrivetrainNormalDrive());

        SmartDashboard.putData("Set Shooter Angle", new SetShooterAngle());

        SmartDashboard.putData("Teleoperated", new Teleoperated());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriveJoystick() {
        return driveJoystick;
    }

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

