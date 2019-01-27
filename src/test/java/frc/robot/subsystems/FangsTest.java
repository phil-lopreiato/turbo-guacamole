package frc.robot.subsystems;

import frc.wpilib.fake.FakeDoubleSolenoid;
import frc.robot.subsystems.Fangs;

import org.junit.*;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import static org.junit.Assert.*;

public class FangsTest {

    private FakeDoubleSolenoid solenoid;
    private Fangs fangs;

    @Before
    public void beforeEach() {
        solenoid = new FakeDoubleSolenoid();
        fangs = new Fangs(() -> {
            return solenoid;
        });
    }

    @Test
    public void testRaise() {
        fangs.raise();
        assertTrue(fangs.isUp());
    }

    @Test
    public void testLower() {
        fangs.lower();
        assertFalse(fangs.isUp());
    }

    @Test
    public void testToggle() {
        fangs.lower();
        assertFalse(fangs.isUp());
        fangs.toggle();
        assertTrue(fangs.isUp());
        fangs.toggle();
        assertFalse(fangs.isUp());
    }
}
