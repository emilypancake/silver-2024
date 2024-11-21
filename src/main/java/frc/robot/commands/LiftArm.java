package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;

public class LiftArm extends Command{
    private Arm arm;
    private double speedA;
    public LiftArm(Arm arm, double speedA){
        this.arm = arm;
        this.speedA = speedA;
        addRequirements(arm);
    }
    @Override
    public void execute(){
        arm.liftArm(speedA);
    }
    @Override
    public void end(boolean i){
        arm.stop();
    }
}
