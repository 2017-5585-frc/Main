package org.usfirst.frc.team5585.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;
import org.usfirst.frc.team5585.robot.RobotMap;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 */
public class Drivetrain extends Subsystem {
	private Talon frontLeft = new Talon(RobotMap.frontLeftMotorPort),
			frontRight = new Talon(RobotMap.frontRightMotorPort),
			rearLeft = new Talon(RobotMap.rearLeftMotorPort),
			rearRight = new Talon(RobotMap.rearRightMotorPort);
	private RobotDrive drivetrain = new RobotDrive(frontLeft,rearLeft,frontRight,rearRight);
	public void init() {
		/*
		 * init() preforms basic drivetrain setup such as reversing motors.
		 */
		rearLeft.setInverted(true);
		rearRight.setInverted(true);
	}
	public void setLeft(double value) {
		rearLeft.set(value);
		frontLeft.set(value);
	}
	public void setRight(double value) {
		rearRight.set(value);
		frontRight.set(value);
	}
	public void stop() {
		rearLeft.stopMotor();
		rearRight.stopMotor();
		frontLeft.stopMotor();
		frontRight.stopMotor();
	}
	public void defaultArcade() {
		
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

