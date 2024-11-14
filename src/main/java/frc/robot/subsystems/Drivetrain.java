package frc.robot.subsystems; //tels you what folder you're in 

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    VictorSP leftMotor;
    VictorSP rightMotor;

    public Drivetrain(){
        leftMotor = new VictorSP(0);
        rightMotor = new VictorSP(1);
        leftMotor.setInverted(true); // to stop circle spinning????
    }
    public void drive(double speedR, double speedL){
        leftMotor.set(speedL);
        rightMotor.set(speedR);
    }
    public void stop(){
        leftMotor.stopMotor();
        rightMotor.stopMotor();
    }
    
}
