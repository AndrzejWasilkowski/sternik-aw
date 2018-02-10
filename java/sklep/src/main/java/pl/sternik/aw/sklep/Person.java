package pl.sternik.aw.sklep;

public abstract class Person {
    public int id;
    public String name;
    public static int counter;

    Person(){
        this.id = Person.counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract boolean getAutorization();
}
