package sternik.aw.zadania.zad9;

import java.util.Scanner;

public class z09 {
    public static void main(String[] args){
        int[][] tab = {{2,3,4},{4,3,2},{7,5,6},{3,4,2}};
        wypisz(tab);
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj pierwszy wiersz: ");
        int w1 = in.nextInt();
        System.out.print("Podaj z jakim wierszem chcesz zamienić: ");
        int w2 = in.nextInt();

        in.close();

        zamien(w1,w2,tab);
        wypisz(tab);
    }
    public static void wypisz(int[][] tab){
        for (int i=0;i<tab.length;i++){
            for (int j=0;j<tab[i].length;j++){
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] zamien(int w1,int w2, int[][] tab){
        int[][] tmp = new int[2][];
        tmp[0]  = new int[tab[w1].length];
        tmp[1]  = new int[tab[w2].length];
        tmp[0] = tab[w1];
        tmp[1] = tab[w2];
        tab[w1] = tmp[1];
        tab[w2] = tmp[0];


        return tab;
    }

}
