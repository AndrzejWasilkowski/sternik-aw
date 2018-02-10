package pl.sternik.aw.sklep;

public class Rekord extends Article implements Streamable {
    String format;
    int wielkosc;

    public Rekord(String format, int wielkosc){
        this.format = format;
        this.wielkosc = wielkosc;
    }

    public byte[] nextPacket() {
        return new byte[0];
    }


    public long filesize() {
        return 0;
    }

    public String fileType() {
        return null;
    }
}
