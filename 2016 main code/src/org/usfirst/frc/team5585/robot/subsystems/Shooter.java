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
		/**
		 * start() takes no arguments and starts the shooter motors.
		 */
		upMotor.set(1.0);
		lowMotor.set(1.0);
	}
	
	public void stop() {
		/**
		 * stop() takes no arguments and stops the shooter motors.
		 */
		upMotor.stopMotor();
		lowMotor.stopMotor();
	}
	public void aim(int amount) {
		/**
		 * aim() controls the elevation of the shooter subsystem using the motor speeds. It takes an integer argument, which scales the degree of aiming.
		 * An argument of 0 resets the shooter to initial state.
		 */
		double upSpeed = upMotor.getSpeed();
		double lowSpeed = lowMotor.getSpeed();
		if (amount > 0) {
			lowSpeed += 0.1*amount;
			upSpeed -= 0.1*amount;
			if (lowSpeed > 1.0) {
				lowSpeed = 1.0;
			}
			if (upSpeed < 0.0) {
				upSpeed = 0.0;
			}
		}
		if (amount < 0) {
			lowSpeed -= 0.1*amount;
			upSpeed +=0.1*amount;
			if (lowSpeed < 0.0) {
				lowSpeed = 0.0;
			}
			if (upSpeed > 1.0) {
				upSpeed = 1.0;
			}
		}
		if (amount == 0) {
			lowSpeed = 1.0;
			upSpeed = 1.0;
		}
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //TODO setDefaultCommand(new startShooter());
    }
}

