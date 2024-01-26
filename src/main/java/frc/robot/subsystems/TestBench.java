// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class TestBench extends SubsystemBase {
  public final MotorController MOTOR_1;
  public final MotorController MOTOR_2;
  public final MotorController MOTOR_3;
  public final MotorController MOTOR_4;

  /** Creates a new TestBench. */
  public TestBench() {
    MOTOR_1 = new Spark(Constants.MOTOR_CHANNEL_1);
    MOTOR_2 = new Spark(Constants.MOTOR_CHANNEL_2);
    MOTOR_3 = new Spark(Constants.MOTOR_CHANNEL_3);
    MOTOR_4 = new Spark(Constants.MOTOR_CHANNEL_4);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
