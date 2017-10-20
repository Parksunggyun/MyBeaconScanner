package altong.mon.mybeaconscanner;

/**
 * Created by 15U560 on 2017-10-19.
 */

public class Beacon {
    private String address;
    private int rssi;
    private String now;

    public Beacon(String address, int rssi, String now) {
        this.address = address;
        this.rssi = rssi;
        this.now = now;
    }

    public String getAddress() {
        return address;
    }

    public int getRssi() {
        return rssi;
    }

    public String getNow() {
        return now;
    }
}
