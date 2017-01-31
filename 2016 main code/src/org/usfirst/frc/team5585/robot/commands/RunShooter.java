 package org.usfirst.frc.team5585.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5585.robot.Robot;
import org.usfirst.frc.team5585.robot.OI;;

/**
 *
 */
public class RunShooter extends Command {
	
    public RunShooter() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.Shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.Shooter.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Shooter.aim(OI.getElevation());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        for (int i = 0; i < 1;) {
        	return false;
        }
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.Shooter.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
