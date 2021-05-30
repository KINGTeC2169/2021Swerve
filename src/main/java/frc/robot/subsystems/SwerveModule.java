package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj.geometry.Rotation2d;
import edu.wpi.first.wpilibj.geometry.Translation2d;
import edu.wpi.first.wpilibj.kinematics.SwerveDriveKinematics;
import edu.wpi.first.wpilibj.kinematics.SwerveDriveOdometry;
import edu.wpi.first.wpilibj.kinematics.SwerveModuleState;
import edu.wpi.first.wpilibj.trajectory.TrapezoidProfile;
//import com.kauailabs.navx.frc.AHRS;
import frc.robot.RobotMap;


public class SwerveModule {
    private static final double kWheelRadius = RobotMap.K_WHEEL_RADIUS;
    private static final int kEncoderResolution = RobotMap.K_ENCODER_RESOLUTION;
//    private final AHRS navX;

    private static CANSparkMax driveMotor;
    private static CANSparkMax turnMotor;
    private static final Encoder driveEncoder = new Encoder(0,0);
    private static final Encoder turnEncoder = new Encoder(1,1);
    private final PIDController drivePID = new PIDController(1,0,0);
    private final PIDController turnPID = new PIDController(1,0,0);

    public SwerveModule(int driveMotorChannel, int turnMotorChannel){
        driveMotor = new CANSparkMax(driveMotorChannel, CANSparkMaxLowLevel.MotorType.kBrushless);
        turnMotor = new CANSparkMax(turnMotorChannel, CANSparkMaxLowLevel.MotorType.kBrushless);

    }

    public SwerveModuleState getState(){
        return new SwerveModuleState(driveEncoder.getRate(), new Rotation2d(turnEncoder.get()));
    }

    public void setDesiredState(SwerveModuleState state){
        final double driveOutput;
    }
    /**
     * @param xSpeed speed of the drive motors in the X direction
     * @param ySpeed speed of the drive motors in the Y direction
     * @param angRate the angular rate of the robot
     * @param fieldRelative Whether the speeds are relative to the field or not
     */
    public void drive(double xSpeed, double ySpeed, double angRate, boolean fieldRelative){
        System.out.println("currently unimplemented method");

    }

}
