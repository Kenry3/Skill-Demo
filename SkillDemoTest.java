import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testAlwaysTrue() {
        assertEquals(false, SkillDemo.alwaysTrue());// fails
    }
}
