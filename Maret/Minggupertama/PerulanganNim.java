package Maret.Minggupertama;

import java.util.Scanner;

public class PerulanganNim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long masuknim;
        int i = 0;
        System.out.println("Masukkan Nomer Induk Mahasiswa anda : ");
        System.out.println("=========================");
        masuknim = sc.nextLong();
        System.out.println("=========================");
        long duadigitterakhir = masuknim % 100;
        int hasilduadigit;
        if (duadigitterakhir < 10) {
            hasilduadigit = (int) duadigitterakhir + 10;
            System.out.println("N = " + hasilduadigit);
        } else {
            hasilduadigit = (int) duadigitterakhir;
            System.out.println(hasilduadigit);
        }
        for (i = 0; i <= hasilduadigit; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
