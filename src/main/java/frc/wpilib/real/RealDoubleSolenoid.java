package frc.wpilib.real;

import frc.wpilib.iface.IDoubleSolenoid;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class RealDoubleSolenoid implements IDoubleSolenoid {

    private DoubleSolenoid solenoid;

    public RealDoubleSolenoid(int forwardChannel, int reverseChannel) {
        solenoid = new DoubleSolenoid(forwardChannel, reverseChannel);
    }

    public DoubleSolenoid.Value get() {
        return solenoid.get();
    }

    public void set(DoubleSolenoid.Value value) {
        solenoid.set(value);
    }
}
