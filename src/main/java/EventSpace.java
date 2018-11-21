import java.util.ArrayList;

public class EventSpace {
    private int capacity;
    private boolean booked;
    private ArrayList<Guest> guestList;
    private String name;
    private int price;

    public EventSpace(int capacity, String name, int price){
        this.capacity = capacity;
        this.booked = false;
        this.guestList = new ArrayList<>();
        this.name = name;
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isBooked() {
        return booked;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setBooking(boolean booked) {
        this.booked = booked;
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
