// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class TestBench extends SubsystemBase {
  public final MotorController MOTOR_1;
  public final MotorController MOTOR_2;
  public final MotorController MOTOR_3;
  public final MotorController MOTOR_4;

  /** Creates a new TestBench. */
  public TestBench() {
    MOTOR_1 = new CANSparkMax(Constants.MOTOR_CHANNEL_1, MotorType.kBrushless);
    MOTOR_2 = new CANSparkMax(Constants.MOTOR_CHANNEL_2, MotorType.kBrushless);
    MOTOR_3 = new CANSparkMax(Constants.MOTOR_CHANNEL_3, MotorType.kBrushless);
    MOTOR_4 = new CANSparkMax(Constants.MOTOR_CHANNEL_4, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
