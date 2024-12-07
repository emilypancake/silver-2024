package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
    VictorSP arm;

    public Arm(){
        arm = new VictorSP(2);   
    }
    public void liftArm(double speedA){
        arm.set(speedA);

    }
    public void stop(){
        arm.stopMotor();
    }
}
