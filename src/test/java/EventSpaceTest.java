import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EventSpaceTest {

//    Arrange
    private Guest guest;
    private EventSpace eventSpace;

    @Before
    public void before(){
        guest = new Guest("Roberta", "Anderton", 350);
        eventSpace = new EventSpace(80, "The Shandon Suite", 250);
    }

    @Test
    public void eventSpaceHasCapacity(){
        assertEquals(80, eventSpace.getCapacity());
    }

    @Test
    public void eventSpaceHasBookingStatus(){
        assertEquals(false,eventSpace.isBooked());
    }

    @Test
    public void eventSpaceHasGuestList(){
        assertEquals(0, eventSpace.guestCount());
    }

    @Test
    public void eventSpaceHasName(){
        assertEquals("The Shandon Suite", eventSpace.getName());
    }

    @Test
    public void eventSpaceHasPrice(){
        assertEquals(250, eventSpace.getPrice());
    }

    @Test
    public void addGuestRoRoom() {
        eventSpace.addGuest(guest);
        assertEquals(1, eventSpace.guestCount());
    }

    @Test
    public void removeGuestFromRoom() {
        eventSpace.addGuest(guest);
        eventSpace.removeGuest();
        assertEquals(0, eventSpace.guestCount());
    }

    @Test
    public void pullBookedGuest() {
        eventSpace.addGuest(guest);
        assertEquals(guest,eventSpace.firstGuest());
    }

    @Test
    public void eventSpaceGetsBooked(){
        eventSpace.setBooking(true);
        assertEquals(true, eventSpace.isBooked());
    }
}


