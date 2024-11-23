package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Drivetrain;

public class BasicAuto extends SequentialCommandGroup {
    public BasicAuto(Drivetrain drivetrain, Arm arm){
        addCommands( // this is a call to a function
        // drive forward at 0.25 speed for x sec
        // turn if negative sped for x seconds
        // 15 sec auto

        //wait good for  turn = new WaitCommand(seconds)
        //lift arm 
            new AutoDrive(drivetrain, 0.25, 0.25).withTimeout(1.5), //time takes pause then wait deploy
            new AutoDrive(drivetrain, 0.15, -0.15).withTimeout(0.75),
            new LiftArm(arm, 0.4).withTimeout(0.5)
        );

        
    }
}
