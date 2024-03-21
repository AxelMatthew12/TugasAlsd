package Kuis1_Axel;

public class Brain05 {
    // mengapa kamu mendeklarasikan ini ?
    // Jawaban : ini adalah deklarasi variabel
    public String kategori;
    public String nama;
    public String merk;
    public int stok;
    public int terjual;
// apa maksud dari kontruktor paramater? : adalah kontruktor yang mengambil
// Parameter saat objek dibuat.

// mengapa memakai parameter ?
// mengapa menggunakan this.
    public void Elektronik05(String kategori,String nama, String merk, int stok) {
        this.nama = nama;
        this.merk = merk;
        this.stok = stok;
        this.kategori = kategori;
    }

    //  mengapa kamu menggunakan return velue untuk semua atribut  ?

    public String getKategori() {
        return kategori;
    }

    public String getNama05() {
        return nama;
    }

    public String getmerk05() {
        return merk;
    }

    public int getstok05() {
        return stok;
    }

    public int getterjual05(){
        return terjual;
    }

    public void tampil05() {
        // mengapa kamu menggunakan cara stok- terjual
        int sisa = stok - terjual;
        System.out.println("||Kategori: "+kategori+", Nama: " + nama + ", Merek: " + merk.toLowerCase() + ", Stok: " + stok + ", Terjual: " + terjual + ", Sisa: " + sisa +"||");
        
    }

    public void hitungsisa05() {
        // mengapa int sisa kamu masukkan lagi ke sini
        int sisa = stok - terjual;
        System.out.println("Sisa stok: " + sisa);
    }

    public void cariproduk05(int jumlahStok) {
        // apa guna dari ini dan mengapa kamu menggunakan if/else dan stok == jumlah stok ?
        if (stok == jumlahStok) {
            System.out.println("Produk dengan stok " + jumlahStok + " ditemukan: ");
            tampil05();
        } else {
            System.out.println("Produk dengan stok " + jumlahStok + " tidak ditemukan.");
        }
    }

    // untuk apa code ini?
    public void daftarproduk() {
        System.out.println("Daftar Produk:");
        tampil05();
    }
}
