package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
public class Robot extends TimedRobot {
 
  private CANSparkMax leftMotor1 = new CANSparkMax(0, MotorType.kBrushless);  
  private CANSparkMax leftMotor2 = new CANSparkMax(1, MotorType.kBrushless);  
  private CANSparkMax rightMotor1 = new CANSparkMax(2, MotorType.kBrushless);  
  private CANSparkMax rightMotor2 = new CANSparkMax(3, MotorType.kBrushless);  
  private Joystick joy1 = new Joystick(0);
 
  @Override
  public void teleopPeriodic() {} {
  double speed = -joy1.getRawAxis(1) * 0.6; 
  double turn = joy1.getRawAxis(4) * 0.3 ; 
  
  double left = speed + turn;
  double right = speed - turn;

  leftMotor1.set(left);
  leftMotor2.set(left);
  rightMotor1.set(-right);
  rightMotor2.set(-right);
 }
}
