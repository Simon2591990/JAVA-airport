import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Simon", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Simon", passenger.getName());
    }

    @Test
    public void canChangeName() {
        passenger.setName("Teemo");
        assertEquals("Teemo", passenger.getName());
    }

    @Test
    public void hasBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void canChangeNunmberOfBags() {
        passenger.setNumberOfBags(3);
        assertEquals(3, passenger.getNumberOfBags());
    }
}
