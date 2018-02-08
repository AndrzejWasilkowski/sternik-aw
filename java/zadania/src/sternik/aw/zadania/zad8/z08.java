package sternik.aw.zadania.zad8;

import java.util.Scanner;

public class z08 {
    public static void main(String[] args){
        int[] tab = StworzTablice();
        String[][] tabUzupelniony = new String[tab.length][];
        for(int i=0;i<tab.length;i++){
            tabUzupelniony[i] = new String[tab[i]];
            for(int j=0;j < tab[i];j++){
                tabUzupelniony[i][j] = i+"-"+j;
            }
        }
        Wypisz(tabUzupelniony);
    }

    public static void Wypisz(String[][] tablca){
        for (int i=0;i<tablca.length;i++){
            for (int j=0;j<tablca[i].length;j++){
                System.out.print(tablca[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[] StworzTablice(){
        int[] tablica;
        String[] linia;

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wymiar: ");
        String tekst = in.nextLine();
        linia = tekst.split(" ");
        in.close();

        tablica = new int[linia.length];
        for(int i=0;i<linia.length;i++){
            tablica[i] = Integer.valueOf(linia[i]);
        }

        return tablica;
    }
}
