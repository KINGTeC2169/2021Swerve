package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import frc.robot.Controls;

public class DriveSubsystem {
    private static DriveSubsystem instance;

    CANSparkMax sparkMax1 = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax sparkMax2 = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax sparkMax3 = new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax sparkMax4 = new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax sparkMax5 = new CANSparkMax(5, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax sparkMax6 = new CANSparkMax(6, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax sparkMax7 = new CANSparkMax(7, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax sparkMax8 = new CANSparkMax(8, CANSparkMaxLowLevel.MotorType.kBrushless);

    public void turnMotorsLeft(){
//        double speed = Controls.leftJoy.getRawAxis(1) * 0.6;
//        double turn = Controls.rightJoy.getRawAxis(2) * 0.3;
//        double left = speed + turn;
//        double right = speed - turn;
        double left = 1;

        sparkMax1.set(left);
        sparkMax2.set(left);
        sparkMax3.set(left);
        sparkMax4.set(left);
        sparkMax5.set(left);
        sparkMax6.set(left);
        sparkMax7.set(left);
        sparkMax8.set(left);
    }
    protected static DriveSubsystem getInstance(){
        if(instance == null){
            return instance;
        }
        else{
            return instance;
        }
    }

}
