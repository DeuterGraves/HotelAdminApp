public class Guest {
    private String fName;
    private String lName;
    private int wallet;

    public Guest(String fName, String lName, int wallet) {
        this.fName = fName;
        this.lName = lName;
        this.wallet = wallet;
    }


    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getWallet() {
        return wallet;
    }

    public int decreaseWallet(BedRoom bedRoom) {
        return wallet - bedRoom.getPrice();
    }

    //decrease wallet method

}
