package pl.sternik.aw.sklep;

public interface Streamable extends Downloadable {
    byte[] nextPacket();
}
