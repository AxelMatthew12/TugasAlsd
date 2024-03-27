package Maret.MingguKeenam.TUGAS;

public class Hotel {
    String nama;
    String kota;
    int harga;
    Byte bintang;

    Hotel(String n, String k,int h, Byte b){
        nama= n;
        kota = k;
        harga=h;
        bintang=b;
    }
    void tampil (){
        System.out.println("Nama = "+nama);
        System.out.println("kota="+kota);
        System.out.println("harga = "+harga);
        System.out.println("bintang ="+bintang);
    }
}
