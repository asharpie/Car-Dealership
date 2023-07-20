import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarLotTest {
    @Test
    void emptyConstructor(){
        CarLot lot = new CarLot();
        assertNotNull(lot);

    }
    @Test
    void nonEmptyConstructor(){
        CarLot lot = new CarLot("Lot");
        assertAll("Dealership non-empty",
                () -> assertEquals("Lot", lot.getDealername()),
                () -> assertNotNull(lot.getCarArray()),
                () -> assertEquals(0, lot.getLogicalLength())

                );


    }

    @Test
    void setDealername() {
        CarLot lot = new CarLot();
        lot.setDealername("LOT");
        assertEquals("LOT", lot.getDealername());

    }

    @Test
    void addVehiclesToArray() {
        CarLot lot = new CarLot();
        lot.addVehiclesToArray("","","",0);
        assertAll("testing add car",
                () -> assertNotNull(lot.getVehicleFromArray(0)),
                () -> assertEquals(1,lot.getLogicalLength())

                );
    }
}