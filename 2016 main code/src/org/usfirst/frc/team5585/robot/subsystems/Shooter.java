package org.usfirst.frc.team5585.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;
import org.usfirst.frc.team5585.robot.RobotMap;

/**
 *
 */
public class Shooter extends Subsystem {
	
	public upMotor = RobotMap.upperShooter;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void start() {
		
	}
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

