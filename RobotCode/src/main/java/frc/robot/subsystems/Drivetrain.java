package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.Hardware.DRIVE_LEFT_CHANNEL;
import static frc.robot.Constants.Hardware.DRIVE_RIGHT_CHANNEL;

public class Drivetrain extends SubsystemBase {

    private final Talon leftWheels = new Talon(DRIVE_LEFT_CHANNEL);
    private final Talon rightWheels = new Talon(DRIVE_RIGHT_CHANNEL);

    public Drivetrain() {
        leftWheels.setInverted(true);
    }

    public void setDutyCycles(double leftDutyCycle, double rightDutyCycle) {
        leftWheels.set(leftDutyCycle);
        rightWheels.set(rightDutyCycle);

        System.out.println("");
    }

}
