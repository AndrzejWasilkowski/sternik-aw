package sternik.aw.zadania.zad6;

public class z06 {
    public static void main(String[] args){
        int[][] values={{3,8,16},{1,22,28,24},{3},{41,42}};

        System.out.println(ZnajdzMin(values));
        System.out.println(ZnajdzMax(values));
    }
    public static int ZnajdzMin (int[][] tablica){
        int min = tablica[0][0];
        for (int[] i:tablica) {
            for (int j:i) {
                if (min>j){
                    min = j;
                }
            }
        }
        return min;
    }
    public static int ZnajdzMax (int[][] tablica){
        int max = tablica[0][0];
        for (int[] i:tablica) {
            for (int j:i) {
                if (max<j){
                    max = j;
                }
            }
        }
        return max;
    }
}
