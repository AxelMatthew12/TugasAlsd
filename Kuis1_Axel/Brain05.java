package Kuis1_Axel;

public class Brain05 {
    public String kategori;
    public String nama;
    public String merk;
    public int stok;
    public int terjual;

    public void Elektronik05(String kategori,String nama, String merk, int stok) {
        this.nama = nama;
        this.merk = merk;
        this.stok = stok;
        this.kategori = kategori;
    }

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
        int sisa = stok - terjual;
        System.out.println("||Kategori: "+kategori+", Nama: " + nama + ", Merek: " + merk + ", Stok: " + stok + ", Terjual: " + terjual + ", Sisa: " + sisa +"||");
        
    }

    public void hitungsisa05() {
        int sisa = stok - terjual;
        System.out.println("Sisa stok: " + sisa);
    }

    public void cariproduk05(int jumlahStok) {
        if (stok == jumlahStok) {
            System.out.println("Produk dengan stok " + jumlahStok + " ditemukan: ");
            tampil05();
        } else {
            System.out.println("Produk dengan stok " + jumlahStok + " tidak ditemukan.");
        }
    }

    public void daftarproduk() {
        System.out.println("Daftar Produk:");
        tampil05();
    }
}
