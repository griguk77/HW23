import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CookTest {

    @Test
    void cook() {
        Cook cook = new Cook("Саша");
        assertEquals("Я кок", cook.cook());
    }
}