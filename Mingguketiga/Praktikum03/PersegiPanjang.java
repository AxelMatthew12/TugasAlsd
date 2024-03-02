package Mingguketiga.Praktikum03;

public class PersegiPanjang {
    // Deklarasi atribut panjang dan lebar
    public int panjang;
    public int lebar;

    // Konstruktor dengan parameter panjang dan lebar
    public PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    // Method untuk menghitung luas persegi panjang
    public int hitungLuas() {
        int luas = panjang * lebar;
        return luas;
    }

    public int hitungkeliling() {
      int keliling = 2 * (panjang + lebar);
      return keliling;
    }
}
