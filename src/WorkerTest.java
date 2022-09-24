import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Worker worker = new Worker("Вася");
        assertEquals("Вася", worker.getName());
    }

    @org.junit.jupiter.api.Test
    void voice() {
        Worker worker = new Worker("Коля");
        assertEquals("Коля", worker.voice());
    }
}