package pl.sternik.aw.sklep;

public class Employee extends Person {

    @Override
    public boolean getAutorization() {
        return false;
    }
}
