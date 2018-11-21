import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {
    private BedRoom bedRoom;
    private Guest guest;
    private Guest guest1;

    @Before
    public void before() {
        guest = new Guest("David", "Antwhipple", 1000);
        guest1 = new Guest("Sean", "Whithlewhite", 800);
        bedRoom = new BedRoom("Superior", 728, 2, 175);
    }


    // room has a type
    // room has a room number
    // room has a capacity
    // room has a price
    // add guest to room
    // count guests in room
    // remove guest
    // pull booked guest

    @Test
    public void roomHasType() {
        assertEquals("Superior", bedRoom.getType());
    }

    @Test
    public void roomHasNumber() {
        assertEquals(728, bedRoom.getRoomNumber());
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(2, bedRoom.getCapacity());
    }

    @Test
    public void roomHasPrice() {
        assertEquals(175, bedRoom.getPrice());
    }

    @Test
    public void roomHasNoGuests() {
        assertEquals(0,bedRoom.guestCount());
    }

    @Test
    public void addGuestToRoom() {
        bedRoom.addGuest(guest);
        bedRoom.addGuest(guest1);
        assertEquals(2, bedRoom.guestCount());
    }

    @Test
    public void removeGuestFromRoom() {
        bedRoom.addGuest(guest);
        bedRoom.removeGuest();
        assertEquals(0, bedRoom.guestCount());
    }

    @Test
    public void pullBookedGuest() {
        bedRoom.addGuest(guest);
        assertEquals(guest,bedRoom.firstGuest());
    }
}
