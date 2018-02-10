package pl.sternik.aw.sklep.book;

import pl.sternik.aw.sklep.Article;

public class Book extends Article {
    private String autor;
    private int rok;

    public String getAutor() {
        return autor;
    }

    public int getRok() {
        return rok;
    }

    public void setAutor(String autor) {
        this.autor = autor;
        printChange();
    }

    public void setRok(int rok) {
        this.rok = rok;
        printChange();
    }

    @Override
    public String toString() {
        return "Book{" +
                "autor='" + autor + '\'' +
                ", rok=" + rok +
                "} " + super.toString();
    }

    public Book(){
        this.setAutor("brak autora");
        this.setRok(0);
        printChange();
    }
    public Book(int id, String nazwa, String opis, float cena, int ilosc, String autor, int rok){
        this.setId(id);
        this.setNazwa(nazwa);
        this.setOpis(opis);
        this.setCena(cena);
        this.setIlosc(ilosc);
        this.setAutor(autor);
        this.setRok(rok);
        printChange();
    }

}
