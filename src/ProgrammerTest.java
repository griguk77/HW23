import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgrammerTest {

    @Test
    void program() {
        Programmer programmer = new Programmer("Евгений");
        assertEquals("Я Андроид-разработчик", programmer.program());
    }
}