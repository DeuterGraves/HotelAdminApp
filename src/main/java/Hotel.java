import java.util.ArrayList;

public class Hotel {
    private int till;
    private ArrayList<BedRoom> bedRooms;

    public Hotel(int till) {
        this.till = till;
        this.bedRooms = new ArrayList<>();
    }

    public int getTill() {
        return till;
    }

    public int RoomCount() {
        return this.bedRooms.size();
    }

    public void addSingleRoom(BedRoom bedRoom) {
         bedRooms.add(bedRoom);
    }



}
