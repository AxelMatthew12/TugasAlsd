package PrakPertama;
import java.util.Scanner;

public class Arrayplat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[][] platkota ={
            {"A"},
            {"B"},
            {"D"},
            {"E"},
            {"F"},
            {"G"},
            {"H"},
            {"L"},
            {"N"},
            {"T"},
        };
        String[][] asalkota ={
            {"BANTEN"},
            {"JAKARTA"},
            {"BANDUNG"},
            {"CIREBON"},
            {"BOGOR"},
            {"PEKALONGAN"},
            {"SEMARANG"},
            {"SURABAYA"},
            {"MALANG"},
            {"TEGAL"},
        };

        // Menampilkan daftar plat kota
        System.out.println("Daftar Plat Kota:");
        for(int i = 0; i < platkota.length; i++) {
            System.out.println((i + 1) + ". " + platkota[i][0]);
        }
        
        System.out.println("Masukkan nomor plat yang ingin Anda pilih: ");
        int pilihan = sc.nextInt();
        
        // Menampilkan plat yang dipilih oleh pengguna
        if(pilihan >= 1 && pilihan <= platkota.length) {
            System.out.println("Anda memilih plat " + platkota[pilihan - 1][0] + " dari kota " + asalkota[pilihan - 1][0]);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}
