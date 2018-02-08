package sternik.aw.zadania.zad7;

import java.util.Scanner;

public class z07 {
    public static void main(String[] args){
        int[] tablica = {2,3,4,1,5,7,2,9};

        Scanner in = new Scanner(System.in);

        z07 Z07 = new z07();

        System.out.println(Z07.ZnajdzLiczbe(tablica,in));

        in.close();

    }

    public int ZnajdzLiczbe (int[] tablica, Scanner in){
        System.out.println("Podaj szukaną liczbę");
        int x = in.nextInt();

        int miejsce = ZnajdzPodzielnaWhile(tablica,x);

        if (miejsce > -1) {
            System.out.printf("Liczba %d jest podzielna przez %d i znajduje się na piejscu %d \n",tablica[miejsce],x,miejsce);
        } else {
            System.out.println("Nie znaleziono liczby podzielnej");
        }
        return miejsce;
    }

    public int ZnajdzPodzielna(int[] tablica, int dzielnik){
        for (int i=0;i<tablica.length;i++){
            if (tablica[i]%dzielnik==0) {
                return i;
            }
        }
        return -1;
    }

    public int ZnajdzPodzielnaWhile(int[] tablica, int dzielnik){
        int i = 0;
        while(i < tablica.length && tablica[i]%dzielnik!=0){
            i++;
        }
        if (i<tablica.length){
            return i;
        } else{
            return -1;
        }
    }
}
