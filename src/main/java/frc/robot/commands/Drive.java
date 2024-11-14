package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain; // quick fix and this will auto pop up

public class Drive extends Command { 
    private Drivetrain drivetrain;
    private Joystick joyL, joyR; 
    public Drive(Drivetrain drivetrain, Joystick joyL, Joystick joyR){
        this.drivetrain = drivetrain; // this.variable = variable if both the variable and parameter have the same name
        this.joyL = joyL;
        this.joyR = joyR;
        addRequirements(drivetrain); //need to add any subsystems if used
        
    }

    @Override // typically execute doesn't do anything after exectues, but now we override

    public void execute(){ 
        drivetrain.drive(joyL.getY(), joyR.getY());  //from the Joystick object, get the y double that becomes speed
    }
    public void end(boolean interrupted){
        drivetrain.stop();
    }
}


// inherit initialize() execute() isfinished() periodic if end then true end() call when cmd end