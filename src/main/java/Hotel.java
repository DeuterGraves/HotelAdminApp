import java.util.ArrayList;

public class Hotel {
    private int till;
    private ArrayList<BedRoom> bedRooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<EventSpace> eventSpaces;

    public Hotel(int till) {
        this.till = till;
        this.bedRooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
        this.eventSpaces = new ArrayList<>();
    }

    public int getTill() {
        return till;
    }

    public int bedRoomCount() {
        return this.bedRooms.size();
    }

    public int dingingRoomCount() {
        return this.diningRooms.size();
    }

    public int eventSpaceCount() {
        return this.eventSpaces.size();
    }

    public void addBedRoom(BedRoom bedRoom) {
         bedRooms.add(bedRoom);
    }
    public void addDiningRoom(DiningRoom diningRoom) {
         diningRooms.add(diningRoom);
    }
    public void addEventSpace(EventSpace eventSpace) {
         eventSpaces.add(eventSpace);
    }


    public void increaseTill(BedRoom bedRoom) {
        int price = bedRoom.getPrice();
        till += bedRoom.getPrice();
    }
}
