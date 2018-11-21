import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    private DiningRoom diningRoom;
    private Guest guest;

    @Before
    public void before() {
        diningRoom = new DiningRoom(45,"Jade Room", 300);
        guest = new Guest("Rhiannon", "Daviesbottom", 600);
    }


    // has capacity
    // has name
    // has price
    // has guest count
    // can add guest
    // remove guest
    // pull booked guest


    @Test
    public void roomHasCapacity() {
        assertEquals(45, diningRoom.getCapacity());
    }

    @Test
    public void roomHasName() {
        assertEquals("Jade Room", diningRoom.getName());
    }

    @Test
    public void roomHasPrice() {
        assertEquals(300, diningRoom.getPrice());
    }

    @Test
    public void roomHasGuestCount() {
        assertEquals(0, diningRoom.guestCount());
    }

    @Test
    public void addGuestRoRoom() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.guestCount());
    }

    @Test
    public void removeGuestFromRoom() {
        diningRoom.addGuest(guest);
        diningRoom.removeGuest();
        assertEquals(0, diningRoom.guestCount());
    }

    @Test
    public void pullBookedGuest() {
        diningRoom.addGuest(guest);
        assertEquals(guest,diningRoom.firstGuest());
    }
}
