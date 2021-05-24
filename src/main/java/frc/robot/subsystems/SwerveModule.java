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
import com.kauailabs.navx.frc.AHRS;
import frc.robot.RobotMap;


public class SwerveModule {
    private static final double kWheelRadius = RobotMap.K_WHEEL_RADIUS;
    private static final int kEncoderResolution = RobotMap.K_ENCODER_RESOLUTION;

    private static CANSparkMax driveMotor;
    private static CANSparkMax turnMotor;
    private static final Encoder driveEncoder = new Encoder(0,0);
    private static final Encoder turnEncoder = new Encoder(1,1);
    private final PIDController drivePID = new PIDController(0,0,0);
    private final PIDController turnPID = new PIDController(0,0,0);

    public SwerveModule(int driveMotorChannel, int turnMotorChannel){
        driveMotor = new CANSparkMax(driveMotorChannel, CANSparkMaxLowLevel.MotorType.kBrushless);
        turnMotor = new CANSparkMax(turnMotorChannel, CANSparkMaxLowLevel.MotorType.kBrushless);

    }
    private final AHRS NavX = new AHRS();
    public SwerveModuleState getState(){
        return new SwerveModuleState(driveEncoder.getRate(), new Rotation2d(turnEncoder.get()));
    }

    private final Translation2d frontRightPosition = new Translation2d(1,1);
    private final Translation2d frontLeftPosition = new Translation2d(0,1);
    private final Translation2d backRightPosition = new Translation2d(1,1);
    private final Translation2d backLeftPosition = new Translation2d(-1,1);

    private final SwerveDriveKinematics kinematics = new SwerveDriveKinematics(frontRightPosition, frontLeftPosition,
            backRightPosition, backLeftPosition);
    private final SwerveDriveOdometry odometry = new SwerveDriveOdometry(kinematics, );
}
