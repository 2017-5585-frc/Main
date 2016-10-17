package org.usfirst.frc.team5585.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	public static int compressorPort=0;
	public static int ultrasonicPort=0;
	
	public static int solenoid1Port1=1;
	public static int solenoid1Port2=0;
	
	public static int upperShooterPort=2,
					lowerShooterPort=3; 
	public static int joystickPort=1,
			xboxPort=0;
	public static int frontLeftMotorPort = 0,
			frontRightMotorPort = 1,
			rearLeftMotorPort = 2,
			rearRightMotorPort = 3;
}
