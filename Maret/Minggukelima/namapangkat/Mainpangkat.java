package Maret.Minggukelima.namapangkat;
import java.util.Scanner;
public class Mainpangkat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Namapangkat[] png = new Namapangkat[elemen];

        for(int i =0; i < elemen; i++ ){
            png[i] = new Namapangkat();
            System.out.println("Masukkan nilai yang akan dipangkat ke-"+(i+1)+" : ");
            png[i].nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat ke -" + (i+1)+ " : ");
            png[i].pangkat = sc.nextInt();
        }

        System.out.println("=============================================");
        System.out.println("Hasil Pangkat Brute Force ");
        for(int i = 0; i < elemen; i++) {
            System.out.println("Nilai "+png[i].nilai+"pangkat" + png[i].pangkat +"adalah: "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));

        }
        System.out.println("==============================================");
        System.out.println("Hasil Pangkat dengan Devide and Conquer");
        for(int i = 0; i < elemen; i++){
            System.out.println("Nilai "+png[i].nilai+"pangkat" + png[i].pangkat +"adalah: "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
   
}
