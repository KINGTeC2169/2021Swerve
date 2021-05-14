package frc.robot.commands;
//import frc.robot.subsystems.DriveSubsystem;
//import edu.wpi.first.wpilibj2.command.CommandBase;
//import edu.wpi.first.wpilibj.command.Command;

public class DriveCommand{
    public static DriveCommand instance;

    public static DriveCommand getInstance(){
        if(instance == null){
            return instance = new DriveCommand();
        }
        return instance;
    }

    
}
