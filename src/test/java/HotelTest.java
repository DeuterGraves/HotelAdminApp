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

    //    @Test
//    public void increaseTill() {
//        hotel.addTill();
//        assertEquals(1, hotel.getTill());
//    }

    @Test
    public void countOfBedRooms() {
        assertEquals(0, hotel.bedRoomCount());
    }
    @Test
    public void countOfDingingRooms() {
        assertEquals(0, hotel.dingingRoomCount());
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
        assertEquals(1, hotel.dingingRoomCount());

    }

    @Test
    public void canAddEventSpace() {
        hotel.addEventSpace(eventSpace);
        assertEquals(1, hotel.eventSpaceCount());

    }

    @Test
    public void canCheckInToRoom() {
        singleRoom.addGuest(guest);

        assertEquals(1, singleRoom.guestCount());
    }


}
