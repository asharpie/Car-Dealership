import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    void emptyConstructor(){
        Vehicle car = new Vehicle();
        assertNotNull(car);


    }
    @Test
    void nonEmptyConstructor(){
        Vehicle car = new Vehicle("Ford","Sports","Blue",23000);
        assertAll("Car non-empty constructor test",
                () -> assertEquals("Ford",car.getMake()),
                () -> assertEquals("Sports", car.getModel()),
                () -> assertEquals("Blue", car.getColor()),
                () -> assertTrue(23000 == car.getCost())

                );

    }

    @Test
    void setMake() {
        Vehicle car = new Vehicle();
        car.setMake("Kia");
        assertTrue(car.getMake().equals("Kia"));
    }

    @Test
    void setModel() {
        Vehicle car = new Vehicle();
        car.setModel("Sports");
        assertTrue(car.getModel().equals("Sports"));

    }

    @Test
    void setColor() {
        Vehicle car = new Vehicle();
        car.setColor("Grey");
        assertTrue(car.getColor().equals("Grey"));
    }

    @Test
    void setCost() {
        Vehicle car = new Vehicle();
        car.setCost(17000);
        assertEquals(17000, car.getCost());
    }

    @Test
    void testToString() {
        Vehicle car = new Vehicle("Ford","Sports","Blue",23000);
        assertEquals("MakeFord, model Sports, color Blue, cost 23000.0",car.toString());
    }
}