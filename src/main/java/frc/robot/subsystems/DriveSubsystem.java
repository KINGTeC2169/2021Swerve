package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import frc.robot.Controls;

public class DriveSubsystem {
    private static DriveSubsystem instance;
    protected static DriveSubsystem getInstance(){
        if(instance == null){
            return instance;
        }
        else{
            return instance;
        }
    }

}
