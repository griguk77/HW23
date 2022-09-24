import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    @Test
    void drive() {
        Driver driver = new Driver("Алексей");
        assertEquals("Я таксист", driver.drive());
    }
}