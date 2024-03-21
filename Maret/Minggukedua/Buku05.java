package Maret.Minggukedua;

public class Buku05 {
    public static void main(String[] args) {
        // Membuat objek bk1 dan menginisialisasi dengan konstruktor
        Prakticum bk1 = new Prakticum("Today Ends Tomorrow Comes", "Denanda Pratiwi", 198, 13, 71000);
        
        // Menampilkan informasi buku bk1
        bk1.tampilInformasi();
        
        // Mengurangi stok buku bk1 sebanyak 5 dan menampilkan informasi terbaru
        bk1.terjual(5);
        bk1.tampilInformasi();
        
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Prakticum bk2 = new Prakticum("Self Reward", "Maheera Ayesha", 160, 29, 59000);

        bk2.tampilInformasi();
        
        bk2.terjual(11);
        bk2.tampilInformasi();

        int totalHargaBk1 = bk1.hitungHargaTotal(5);
        int diskonBk1 = bk1.hitungDiskon(totalHargaBk1);
        int hitungHargaBayarBk1 = bk1.hitungHargaBayar(totalHargaBk1, diskonBk1);

        // Menampilkan hasil perhitungan harga buku bk1
        System.out.println("Harga Total Buku 1: Rp " + totalHargaBk1);
        System.out.println("Diskon Buku 1: Rp " + diskonBk1);
        System.out.println("Harga Bayar Buku 1: Rp " + hitungHargaBayarBk1);

        // Menghitung harga total, diskon, dan harga bayar untuk buku bk2
        int totalHargaBk2 = bk2.hitungHargaTotal(11);
        int diskonBk2 = bk2.hitungDiskon(totalHargaBk2);
        int  hitungHargaBayarBk2 = bk2.hitungHargaBayar(totalHargaBk2, diskonBk2);

        // Menampilkan hasil perhitungan harga buku bk2
        System.out.println("Harga Total Buku 2: Rp " + totalHargaBk2);
        System.out.println("Diskon Buku 2: Rp " + diskonBk2);
        System.out.println("Harga Bayar Buku 2: Rp " + hitungHargaBayarBk2);

    }
}
