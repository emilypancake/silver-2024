package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class AutoDrive extends Command{
    private Drivetrain drivetrain;
    double speedL, speedR;
    public AutoDrive(Drivetrain drivetrain, double speedL, double speedR){
        this.drivetrain = drivetrain; // this.variable = variable if both the variable and parameter have the same name
        this.speedL = speedL;
        this.speedR = speedR;
        addRequirements(drivetrain); //need to add any subsystems if used
        
    }

    @Override // typically execute doesn't do anything after exectues, but now we override

    public void execute(){ 
        drivetrain.drive(speedL, speedR);  //from the Joystick object, get the y double that becomes speed
    }
    public void end(boolean interrupted){
        drivetrain.stop();
    }
}

