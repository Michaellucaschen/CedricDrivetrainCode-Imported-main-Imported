// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

// import edu.wpi.first.wpilibj2.smartdashboard
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    private final SparkMax intakeMotor = new SparkMax(50,MotorType.kBrushed); // Replace 0 with the actual motor port
  
    /**
     * 
     */
    public IntakeSubsystem() {
    }
  
    public void runIntake(double speed) {
      intakeMotor.set(speed);
      System.out.println(speed);
    }
  
    public void stopIntake() {
      intakeMotor.set(0);
    }
    public Command runIntakeCommand(){
      return this.startEnd (
        () -> this.runIntake(0.5), () -> this.stopIntake());
    }
  }
