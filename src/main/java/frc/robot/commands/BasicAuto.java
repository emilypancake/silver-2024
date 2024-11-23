package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Drivetrain;

public class BasicAuto extends SequentialCommandGroup {
    public BasicAuto(Drivetrain drivetrain, Arm arm){
        addCommands( // this is a call to a function
        // drive forward at 0.25 speed for 1.25
            new AutoDrive(drivetrain, 0.25, 0.25).withTimeout(1.5) //time takes pause then wait deploy
            new AutoDrive(drivetarin, 0.15, )
        );
    }
}
