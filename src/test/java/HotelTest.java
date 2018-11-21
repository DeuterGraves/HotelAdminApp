import org.junit.Before;
import org.junit.Test;

//import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Guest guest;
    private BedRoom singleRoom;
    private BedRoom doubleRoom;
    private DiningRoom diningRoom;
    private EventSpace eventSpace;
    private Hotel hotel;

    @Before
    public void before() {
        guest = new Guest("Bea", "Whittie", 200);
        singleRoom = new BedRoom("Single Room", 300, 1, 45);
        doubleRoom = new BedRoom("Double Room", 400, 2, 60);
        diningRoom = new DiningRoom(40, "Tapas Tree", 20);
        eventSpace = new EventSpace(120, "The Opal Office", 800);
        hotel = new Hotel(0);
    }

    @Test
    public void hotelHasTill(){
        assertEquals(0,hotel.getTill());
    }

        @Test
    public void hotelCanIncreaseTill() {
        hotel.increaseTill(singleRoom);
        assertEquals(45, hotel.getTill());
    }

    @Test
    public void countOfBedRooms() {
        assertEquals(0, hotel.bedRoomCount());
    }
    @Test
    public void countOfDingingRooms() {
        assertEquals(0, hotel.diningRoomCount());
    }
    @Test
    public void countOfEventSpaces() {
        assertEquals(0, hotel.eventSpaceCount());
    }

    @Test
    public void canAddBedRoom() {
        hotel.addBedRoom(singleRoom);
        hotel.addBedRoom(doubleRoom);
        assertEquals(2, hotel.bedRoomCount());

    }

    @Test
    public void canAddDiningRoom() {
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.diningRoomCount());

    }

    @Test
    public void canAddEventSpace() {
        hotel.addEventSpace(eventSpace);
        assertEquals(1, hotel.eventSpaceCount());

    }

    @Test
    public void canAddGuestToRoom() {
        singleRoom.addGuest(guest);

        assertEquals(1, singleRoom.guestCount());
    }

//    search for available rooms
//    search for booked rooms
//    search available rooms with capacity of minimum x?

    /*
    check in to include:
    - identify the room
    - add guests to room
    - change room booked status
    - increase til by room price
    - idenfity booked guest
    - decrease booked guests' wallet by room price
     */

/* check out to include:
- identify room being checked out of
- clear guests
- change room booked status
 */





}
