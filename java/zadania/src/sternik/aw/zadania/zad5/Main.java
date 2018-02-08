package sternik.aw.zadania.zad5;

public class Main {
    public static void main(String[] args) {
        String[] tablica = {"Jeden","Dwa","Trzy","Cztery","Pięć"};

        PetlaFor(tablica);
        System.out.println();

        PetlaFor(tablica);
        System.out.println();

        PetlaFor(tablica);
        System.out.println();
    }


    static String PetlaFor(String[] tablica){
        for(int i=0;i<tablica.length;i++){
            System.out.println(tablica[i]);
        }
        return "";
    }
    static String PetlaWhile(String[] tablica){
        int i = 0;
        while(i < tablica.length ) {
            System.out.println(tablica[i]);
            i++;
        }
        return "";
    }
    static String PetlaForeach(String[] tablica){
        for (String slowo:tablica ) {
            System.out.println(slowo);
        }
        return "";
    }
}
