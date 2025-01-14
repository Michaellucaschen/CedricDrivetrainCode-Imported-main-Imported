package frc.robot.commands;

import frc.robot.subsystems.IntakeSubsystem;

public class RunIntakeCommand extends CommandBase {
  private final IntakeSubsystem intake;

  public RunIntakeCommand(IntakeSubsystem intake) {
    this.intake = intake;
    addRequirements(intake); // Ensure this command requires the intake subsystem
      }
    
      public void addRequirements(IntakeSubsystem intake2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addRequirements'");
      }
    
      @Override
  public void initialize () {
    intake.runIntake(1.0); // Start intake at full speed
  }

  @Override
  public void end(boolean interrupted) {
    intake.stopIntake(); // Stop intake
  }
}