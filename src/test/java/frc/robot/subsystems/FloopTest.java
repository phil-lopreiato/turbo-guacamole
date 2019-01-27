package frc.robot.subsystems;

import frc.wpilib.fake.FakeDoubleSolenoid;
import frc.robot.subsystems.Floop;

import org.junit.*;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import static org.junit.Assert.*;

public class FloopTest {

    private FakeDoubleSolenoid solenoid;
    private Floop floop;

    @Before
    public void beforeEach() {
        solenoid = new FakeDoubleSolenoid();
        floop = new Floop(() -> {
            return solenoid;
        });
    }

    @Test
    public void testOpen() {
        floop.open();
        assertTrue(floop.opened());
        assertEquals(solenoid.get(), DoubleSolenoid.Value.kForward);
    }

    @Test
    public void testClose() {
        floop.close();
        assertFalse(floop.opened());
        assertEquals(solenoid.get(), DoubleSolenoid.Value.kReverse);
    }

    @Test
    public void testToggle() {
        floop.close();
        floop.toggle();
        assertTrue(floop.opened());
        floop.toggle();
        assertFalse(floop.opened());
    }
}
