package Maret.Minggukelima.BruteForceDivideConquer;
import java.util.Scanner;

public class Mainfaktorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for(int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
            System.out.println("==============================================");
            System.out.println("Hasil Faktorial dengan Brute Force ");
            long startTimeBF = System.nanoTime();
            int resultBF = fk[i].faktorialBF(fk[i].nilai);
            long endTimeBF = System.nanoTime();
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + resultBF);
            System.out.println("Waktu eksekusi Brute Force: " + (endTimeBF - startTimeBF) + " nanosekon");

            System.out.println("======================================================");
            System.out.println("Hasil Faktorial dengan Devide and Conquer");
            long startTimeDC = System.nanoTime();
            int resultDC = fk[i].faktorialDC(fk[i].nilai);
            long endTimeDC = System.nanoTime();
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + resultDC);
            System.out.println("Waktu eksekusi Divide and Conquer: " + (endTimeDC - startTimeDC) + " nanosekon");

            System.out.println("=========================================================");
        }
    }
}
