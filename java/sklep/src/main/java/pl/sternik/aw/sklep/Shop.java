package pl.sternik.aw.sklep;

import java.util.Date;

public class Shop {
    private Downloadable downloadable;

    private static Object[][] magazyn;

    class Order {
        private int[] quantities;
        private Date dataZamowienia;

        void accept() {
            for (int i = 0; i < magazyn.length ; i++) {
                Integer stan = (Integer) magazyn[i][1];
                Integer dodano = quantities[i];
                Integer suma = stan + dodano;
                magazyn[i][1] = suma;
            }
        }

        public int[] getQuantities() {
            return quantities;
        }

        public Date getDataZamowienia() {
            return dataZamowienia;
        }

        public void setQuantities(int[] quantities) {
            this.quantities = quantities;
        }

        public void setDataZamowienia(Date dataZamowienia) {
            this.dataZamowienia = dataZamowienia;
        }
    }

    public static void main(String[] args) {
        ustawStanPoczatkowy();
        Shop sklep = new Shop();
        System.out.println("----- Stan początkowy");
        sklep.pokazStan();

        Shop.Order ord1 = sklep.new Order();
        ord1.dataZamowienia = new Date();
        int[] zam1 = { 10, 10, 10, 10, 10, 5, 0, 5, 0, 5 };
        ord1.quantities = zam1;
        ord1.accept();
        System.out.println("----- Stan po 1 zamówieniu");
        sklep.pokazStan();

        Shop.Order ord2 = sklep.new Order();
        ord2.dataZamowienia = new Date();
        int[] zam2 = { 40, 30, 20, 4, 3, 2, 0, 1, 33, 15 };
        ord2.quantities = zam2;
        ord2.accept();
        System.out.println("----- Stan po 2 zamówieniu");
        sklep.pokazStan();

        sklep.setDownloadable(new Downloadable() {
            public long filesize() {
                return 432;
            }

            public String fileType() {
                return "Fajny Typ Pliku";
            }
        });
        System.out.println("Typ plku: " + sklep.getDownloadable().fileType());
        System.out.println("Rozmiar plku: " + sklep.getDownloadable().filesize());
    }

    public String pokazStan() {
        String poz, wyn = "";

        for (int i = 0; i < magazyn.length; i++) {
            poz = "poz " + i + ") ";
            for (int j = 0; j < magazyn[i].length; j++) {
                poz = poz + magazyn[i][j] + " ";
            }
            System.out.println(poz);
            wyn = wyn + " [" + i + "]" + magazyn[i][0] + "-" + magazyn[i][1];
        }
        return wyn;
    }

    static void ustawStanPoczatkowy() {
        magazyn = new Object[10][2];
        magazyn[0][0] = "Mleko";
        magazyn[1][0] = "Jogurt";
        magazyn[2][0] = "Chleb";
        magazyn[3][0] = "Cukier";
        magazyn[4][0] = "Śmietana";
        magazyn[5][0] = "Bułki";
        magazyn[6][0] = "Rogale";
        magazyn[7][0] = "Kawa";
        magazyn[8][0] = "Herbata";
        magazyn[9][0] = "Lody";
        for (int i = 0; i < magazyn.length; i++) {
            magazyn[i][1] = 0;
        }
    }

    public Downloadable getDownloadable() {
        return downloadable;
    }

    public void setDownloadable(Downloadable downloadable) {
        this.downloadable = downloadable;
    }
}


