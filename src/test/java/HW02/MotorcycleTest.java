package HW02;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class MotorcycleTest {
    @Test
    public void testMotorcycleCreation() {
        Motorcycle Motorcycle1 = new Motorcycle("Yamaha", "Yamaha YZF-R1", 2020);

        // Проверка атрибутов продукта
        assert (Motorcycle1 instanceof Vehicle);
        assertEquals(2, Motorcycle1.getNumWheels());
        Motorcycle1.testDrive();
        assertEquals(75, Motorcycle1.getSpeed());
        Motorcycle1.park();
        assertEquals(0, Motorcycle1.getSpeed());

    }
}
