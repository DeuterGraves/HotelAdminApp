import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    private Guest guest;
    private BedRoom bedRoom;

    @Before
    public void before() {
        guest = new Guest("Bea", "Whittie", 150);
        bedRoom = new BedRoom("Single", 116, 1, 45);
    }

    @Test
    public void guestHasFirstName() {
        assertEquals("Bea", guest.getfName());
    }

    @Test
    public void guestHasLastName() {
        assertEquals("Whittie", guest.getlName());
    }

    @Test
    public void guestHasWallet() {
        assertEquals(150, guest.getWallet());
    }

    //decrease wallet method test
    @Test
    public void guestCanPayForRoom() {
        assertEquals(105, guest.decreaseWallet(bedRoom));
    }
}


