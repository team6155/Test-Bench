// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TestBench;

/** Ramp up all connected motors to full speed forwards and in reverse over the course of 4 seconds. */
public class TestMotors extends Command {
  TestBench motors;
  Timer timer;

  /** Creates a new TestMotors. */
  public TestMotors(TestBench motors) {
    this.motors = motors;
    addRequirements(motors);
    timer = new Timer();
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed = (timer.get() % 2) / 2;
    if (timer.get() > 2) {
      speed = -speed;
    }
    motors.MOTOR_1.set(speed);
    motors.MOTOR_2.set(speed);
    motors.MOTOR_3.set(speed);
    motors.MOTOR_4.set(speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    motors.MOTOR_1.set(0);
    motors.MOTOR_2.set(0);
    motors.MOTOR_3.set(0);
    motors.MOTOR_4.set(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return timer.get() > 4;
  }
}
