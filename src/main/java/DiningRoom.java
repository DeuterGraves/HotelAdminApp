import java.util.ArrayList;

public class DiningRoom {
    private int capacity;
//    private String hours;
    private ArrayList<Guest> guestList;
    private String name;
    private int price;

    public DiningRoom(int capacity, String name, int price ){
        this.capacity = capacity;
//        this.hours = hours;
        this.guestList = new ArrayList<>();
        this.name = name;
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
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
