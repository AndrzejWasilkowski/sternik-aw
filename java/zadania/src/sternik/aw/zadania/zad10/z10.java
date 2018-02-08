package sternik.aw.zadania.zad10;

public class z10 {
    public static void main(String[] args){
        int[][] liczby = {{2,3,4,5},{5,4,3,2}};
        String[] znaki = {"+","-","*","/"};

        z10 Z10 = new z10();

        int[] wynik = Z10.obicz(liczby,znaki);
        wypisz(wynik);
    }
    public static void wypisz(int[] tab){
        for (int i:tab){
            System.out.print(i+" ");
        }
    }

    public int[] obicz(int[][] liczby, String[] znaki){
        int[] wynik = new int[znaki.length];
        int wybor;

        for (int i=0;i<znaki.length;i++){
            if(znaki[i]=="*"){
                wybor = 1;
            } else if(znaki[i]=="/"){
                wybor = 2;
            } else if(znaki[i]=="-") {
                wybor = 3;
            } else {
                wybor = 4;
            }

            switch (wybor){
                case 1:
                    wynik[i] = liczby[0][i] * liczby[1][i];
                    break;
                case 2:
                    wynik[i] = liczby[0][i] / liczby[1][i];
                    break;
                case 3:
                    wynik[i] = liczby[0][i] - liczby[1][i];
                    break;
                case 4:
                    wynik[i] = liczby[0][i] + liczby[1][i];
                    break;
            }

        }
        return wynik;
    }
}
