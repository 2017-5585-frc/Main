package org.usfirst.frc.team5585.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;
import org.usfirst.frc.team5585.robot.RobotMap;

/**
 *
 */
public class Shooter extends Subsystem {
	
	Victor upMotor = new Victor(RobotMap.upperShooterPort);
	Victor lowMotor = new Victor(RobotMap.lowerShooterPort);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void start() {
		upMotor.set(1.0);
		lowMotor.set(1.0);
	}
	
	public void stop() {
		upMotor.stopMotor();
		lowMotor.stopMotor();
	}
	public void aim(double amount) {
		double upSpeed = upMotor.getSpeed();
		double lowSpeed = lowMotor.getSpeed();
		if (amount > 0) {
			lowSpeed += 0.1;
			upSpeed -= 0.1;
			if (lowSpeed > 1.0) {
				lowSpeed = 1.0;
			}
			if (upSpeed < 0.0) {
				upSpeed = 0.0;
			}
		}
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new start());
    }
}

