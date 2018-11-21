import java.util.ArrayList;

public class BedRoom {
    private String type;
    private int roomNumber;
    private int capacity;
//    private String bookedGuest;
    private ArrayList<Guest> guestList;
    private int price;

    public BedRoom(String type, int roomNumber, int capacity, int price ) {
        this.type = type;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
//        this.bookedGuest = Guest guest;
        this.guestList = new ArrayList<>();
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

//    public String getBookedGuest() {
//        return bookedGuest;
//    }

    public ArrayList<Guest> getGuests() {
        return guestList;
    }

    public int getPrice() {
        return price;
    }

    public int guestCount() {
        return guestList.size();
    }

    public void addGuest(Guest guest) {
        guestList.add(guest);
    }


    public void removeGuest() {
        guestList.clear();
    }

    public Guest firstGuest() {
       return guestList.get(0);
    }
}


