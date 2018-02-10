package pl.sternik.aw.sklep;

import org.apache.log4j.Logger;

public class Article {
    public int id;
    private int ilosc;
    private String nazwa;
    private float cena;
    private String opis;

    private static int counter;

    private static final Logger Log = Logger.getLogger("Article");

    public Article (int id, String nazwa, String opis, int ilosc, float cena) {
        counter =id;
        this.id = id;
        this.nazwa = nazwa;
        this.opis = opis;
        this.cena = cena;
        this.ilosc = ilosc;
    }

    public Article(){
        super();
        counter ++;
        this.id = counter;
        this.nazwa = "brak nazwy";
        this.opis = "brak opisu";
        this.cena = 0;
        this.ilosc = 0;
    }

    protected void printChange() {
        Log.debug("Zmieniono wartość pola");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
        printChange();
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
        printChange();
    }

    public void setCena(float cena) {
        this.cena = cena;
        printChange();
    }

    public void setOpis(String opis) {
        this.opis = opis;
        printChange();
    }

    public int getId() {
        return id;
    }

    public int getIlosc() {
        return ilosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public static int getCounter() {
        return counter;
    }

    public float getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Article{" +
                "ilosc=" + ilosc +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", opis='" + opis + '\'' +
                '}';
    }
}



