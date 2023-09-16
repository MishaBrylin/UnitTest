package HW02;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void testCarCreation() {
        Car car1 = new Car("Nissan", "Nissan Qashqai", 2019);

        // Проверка атрибутов продукта
        assert (car1 instanceof Vehicle);
        assertEquals(4, car1.getNumWheels());
        car1.testDrive();
        assertEquals(60, car1.getSpeed());
        car1.park();
        assertEquals(0, car1.getSpeed());

    }

}
