/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.wpilib.iface.IDoubleSolenoid;
import frc.wpilib.real.RealDoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

import java.util.function.Supplier;

/**
 * Add your docs here.
 */
public class Floop extends Subsystem {
    private IDoubleSolenoid floopSolenoid;

    public static Floop make() {
        return new Floop(() -> {
            return new RealDoubleSolenoid(RobotMap.FLOOP_FORWARD_CHANNEL, RobotMap.FLOOP_REVERSE_CHANNEL);
        });
    }

    public Floop(Supplier<IDoubleSolenoid> solenoidSupplier) {
        floopSolenoid = solenoidSupplier.get();
    }

    public void open() {
        floopSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void close() {
        floopSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void toggle() {
        if (opened()) {
            close();
        } else {
            open();
        }
    }

    public boolean opened() {
        return floopSolenoid.get() == DoubleSolenoid.Value.kForward;
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    @Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}
