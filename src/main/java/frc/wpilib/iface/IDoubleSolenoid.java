package frc.wpilib.iface;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public interface IDoubleSolenoid {

    DoubleSolenoid.Value get();

    void set(DoubleSolenoid.Value v);
}
