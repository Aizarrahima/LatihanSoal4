package PolaSegitiga;

/**
 *
 * @author Aizar
 */
public class LatihanSoal4B {

    public static void main(String[] args) {
        int nilaiAwal = 5; // deklarasi variabel nilaiAwal bertipe data integer
        int beda = 5; // deklarasi variabel beda bertipe data integer
        int nilai; // untuk update nilai

        for (int x = 0; x <= 5; x++) { // perulangan luar untuk membentuk perulangan ke bawah
            for (int y = x; y < 5; y++) { // perulangan dalam untuk membentuk perulangan ke
                // sebagai operator penjumlahan
                nilai = nilaiAwal;
                nilaiAwal += beda;
                System.out.print(nilai + " "); // untuk mencetak variabel nilai
            }
            System.out.println(" "); // untuk memisahkan baris ke bawah
        }
    }
}
