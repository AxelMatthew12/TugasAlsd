package Mingguketiga.Praktikum03;
import java.util.Scanner;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];

        int panjang = 0, lebar = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }

        for (int i = 0; i < 3; i++) {
            // Hitung luas
            int luas = arrayOfPersegiPanjang[i].hitungLuas();

            // Hitung keliling
            int keliling = arrayOfPersegiPanjang[i].hitungkeliling();
            
            System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: "
                    + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i].lebar
                    + ", Luas: " + luas + ", keliling: "+ keliling);
        }
    }
}
