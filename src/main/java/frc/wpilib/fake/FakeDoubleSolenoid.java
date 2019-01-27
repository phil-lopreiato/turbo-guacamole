package frc.wpilib.fake;

import frc.wpilib.iface.IDoubleSolenoid;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class FakeDoubleSolenoid implements IDoubleSolenoid {

    private DoubleSolenoid.Value value;

    @Override
    public DoubleSolenoid.Value get() {
        return value;
    }

    @Override
    public void set(DoubleSolenoid.Value value) {
        this.value = value;
    }
}
