import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelRoom {
    private Hotel hotel;
    private BedRoom singleRoom;
    private BedRoom doubleRoom;
    private Guest guest;

    @Before
    public void before() {
        hotel = new Hotel(0);
        singleRoom = new BedRoom("Single Room", 300, 1, 45);
        doubleRoom = new BedRoom("Double Room", 400, 2, 60);
        guest = new Guest("Bea", "Whittie", 200);
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
        assertEquals(0, hotel.RoomCount());
    }

    @Test
    public void canAddRoom() {
        hotel.addSingleRoom(singleRoom);
        assertEquals(1, hotel.RoomCount());

    }

    @Test
    public void canCheckInToRoom() {
        singleRoom.addGuest(guest);

        assertEquals(1, singleRoom.guestCount());
    }


}
