package Kuis1_Axel;
import java.util.Scanner;

public class Toko05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Berapa banyak produk yang ingin dimasukkan? ");
        int jumlahProduk = scanner.nextInt();


        if (jumlahProduk > 5) {
            System.out.println("Error: Jumlah produk yang dimasukkan melebihi lima.");
        } else {
            scanner.nextLine(); 

            // deklarasi array
            Brain05[] daftarProduk = new Brain05[jumlahProduk];
            // mengapa menggunakan for loop
            for (int i = 0; i <= jumlahProduk; i++) {
                System.out.println("=========================================================");
                System.out.println("Masukkan informasi untuk produk ke-" + (i + 1) + ":");
                System.out.println("||   Kategori: Laptop/L, Hp/H , TV/T ||");
                System.out.println("  ||  Kategori Code:   ||");
                String kategori = scanner.nextLine();
                System.out.print("  ||  Nama:            ||");
                String nama = scanner.nextLine();
                System.out.print("  ||   Merk:           ||");
                String merk = scanner.nextLine();
                System.out.print("  ||   Stok:           ||");
                int stok = scanner.nextInt();
                System.out.println("  || Terjual sebanyak ?  ||");
                int terjual = scanner.nextInt();
                scanner.nextLine(); 
            // apa kegunaan dari code ini ?
            daftarProduk[i] = new Brain05();
            daftarProduk[i].nama = nama;
            daftarProduk[i].merk = merk;
            daftarProduk[i].stok = stok;
            daftarProduk[i].terjual = terjual;
            daftarProduk[i].hitungsisa05();
            daftarProduk[i].kategori = kategori;
        }

            // bagaimana pola perulangan dari code ini ?
        for (int i = 0; i < daftarProduk.length - 1; i++) {
            for (int j = 0; j < daftarProduk.length - 1 - i; j++) {
                if (daftarProduk[j].stok < daftarProduk[j + 1].stok) {
                    Brain05 temp = daftarProduk[j];
                    daftarProduk[j] = daftarProduk[j + 1];
                    daftarProduk[j + 1] = temp;
                }
            }
            }

            // Menampilkan informasi produk
            System.out.println("====================");
            System.out.println("Informasi Produk:");
            for (Brain05 produk : daftarProduk) {
                produk.tampil05();
            }
        }
    }
}
