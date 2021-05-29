package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.geometry.Translation2d;
import edu.wpi.first.wpilibj.kinematics.SwerveDriveKinematics;
import frc.robot.Controls;

// Distance between swervedrive modules are 22 inches

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

    SwerveModule frontLeftSDS = new SwerveModule(1,2);
    SwerveModule frontRightSDS = new SwerveModule(7,8);
    SwerveModule backleftSDS = new SwerveModule(3,4);
    SwerveModule backRightSDS = new SwerveModule(5,6);

    private final Translation2d frontRightPosition = new Translation2d(1,1);
    private final Translation2d frontLeftPosition = new Translation2d(0,1);
    private final Translation2d backRightPosition = new Translation2d(1,1);
    private final Translation2d backLeftPosition = new Translation2d(0,0);

    private final SwerveDriveKinematics kinematics = new SwerveDriveKinematics
            (frontRightPosition, frontLeftPosition, backRightPosition, backLeftPosition);

}
