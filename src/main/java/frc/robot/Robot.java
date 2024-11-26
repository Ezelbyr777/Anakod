package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
public class Robot extends TimedRobot {
 
   CANSparkMax leftMotor1 = new CANSparkMax(0, MotorType.kBrushless);  
   CANSparkMax leftMotor2 = new CANSparkMax(1, MotorType.kBrushless);  
   CANSparkMax rightMotor1 = new CANSparkMax(2, MotorType.kBrushless);  
   CANSparkMax rightMotor2 = new CANSparkMax(3, MotorType.kBrushless);  
   CANSparkMax arm_m = new CANSparkMax(4, MotorType.kBrushless);
  
  DifferentialDrive m_myrobot;
  Joystick m_leftstick;
  Joystick m_rightstick;

  JoystickButton gameButton1;
  JoystickButton gameButton2;
  JoystickButton gameButton3;
  JoystickButton gameButton4;
  JoystickButton gameButton5;
  JoystickButton gameButton6;
  JoystickButton gameButton7;
  JoystickButton gameButton8;
  JoystickButton gameButton9;
  JoystickButton gameButton10;
  JoystickButton gameButton12;
  
  @Override
  public void robotInit() {
  
  leftMotor2.follow(leftMotor1);
  rightMotor2.follow(rightMotor1);
  m_myrobot = new DifferentialDrive(leftMotor1, rightMotor1);
  
  m_leftstick = new Joystick(0);
  m_rightstick = new Joystick(1);
  
  gameButton1 = new JoystickButton(m_leftstick, 1);
  gameButton2 = new JoystickButton(m_leftstick, 2);
  gameButton3 = new JoystickButton(m_leftstick, 3);
  gameButton4 = new JoystickButton(m_leftstick, 4);
  gameButton5 = new JoystickButton(m_leftstick, 5);
  gameButton6 = new JoystickButton(m_leftstick, 6);
  gameButton7 = new JoystickButton(m_leftstick, 7);
  gameButton8 = new JoystickButton(m_leftstick, 8);
  gameButton9 = new JoystickButton(m_leftstick, 9);
  gameButton10 = new JoystickButton(m_leftstick, 10);
  gameButton12 = new JoystickButton(m_leftstick, 12);

  }
  @Override
  public void teleopPeriodic() {} {
  m_myrobot.tankDrive(m_leftstick.getY(), m_rightstick.getY());
  
  if(gameButton1.equals(null)){
     arm_m.set(0.3);
} else if(gameButton2.equals(null)){
     arm_m.set(-0.3);
}  else {
     arm_m.set(0);
}
}
}