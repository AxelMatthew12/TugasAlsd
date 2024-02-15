package PrakPertama;
import java.util.Scanner;

public class KonversiNilai{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int inTugas;
    int inKuis;
    int inUts;
    int inUas;

    double perhitungantugas;
    double perhitungankuis;
    double perhitunganuts;
    double perhitunganuas;
    //  main code menu
        System.out.println("===============================");
        System.out.println("||          WELCOME          ||");
        System.out.println("===============================");
        System.out.println("|| Masukkan nilai TUGAS :    ||");
             inTugas=sc.nextInt();
        System.out.println("|| Masukkan nilai KUIS  :    ||");
             inKuis=sc.nextInt();
        System.out.println("|| Masukkan nilai UTS   :    ||");
             inUts=sc.nextInt();
        System.out.println("|| Masukkan nilai UAS   :    ||");
             inUas=sc.nextInt();
        if (inTugas > 100) {
            System.out.println("Data nilai anda tidak Valid ! ");
        }else{
            if (inKuis > 100) {
                System.out.println("Data nilai anda tidak Valid ! ");

            }else {
                if (inUts > 100) {
                    System.out.println("Data nilai anda tidak Valid ! ");
                }else{
                    if (inUas > 100) {
                        System.out.println("Data nilai anda tidak Valid !");
                    }else{
                        perhitungantugas=inTugas * 0.2;
                        perhitungankuis=inKuis*0.2;
                        perhitunganuts=inUts*0.3;
                        perhitunganuas=inUas*0.3;
                        double totalnilai= perhitungantugas+perhitungankuis+perhitunganuts+perhitunganuas;
                        System.out.println("====================================");
                        System.out.println("|| NILAI TERINPUT TUGAS :"+inTugas+"||");
                        System.out.println("|| NILAI TERINPUT KUIS  :"+inKuis+ "||");
                        System.out.println("|| NILAI TERINPUT UTS   :"+inUts  +"||");
                        System.out.println("|| NILAI TERINPUT UAS   :"+inUas  +"||");
                        System.out.println("========================");
                        System.out.println("|| NILAI AKHIR = "+totalnilai +    "||");
                    if (totalnilai<=39) {
                        System.out.println("|| NILAI HURUF = E");
                        System.out.println("|| ANDA TIDAK LULUS||");
                        }
                        else{
                    if (totalnilai > 39 && totalnilai <=50) {
                        System.out.println("|| NILAI HURUF = D");
                        System.out.println("||ANDA TIDAK LULUS||");
                        }else{
                    if (totalnilai > 50 && totalnilai < 60) {
                        System.out.println("|| NILAI HURUF = C ");
                        System.out.println("|| ANDA LULUS");
                        }else{
                    if (totalnilai > 60 && totalnilai < 65) {
                        System.out.println("|| NILAI HURUF = C+");
                        System.out.println("|| ANDA LULUS");
                        }else{
                    if (totalnilai > 65 && totalnilai< 73) {
                        System.out.println("|| NILAI HURUF = B");
                        System.out.println("|| ANDA LULUS");
                        }else {
                    if (totalnilai > 73 && totalnilai < 80) {
                        System.out.println("|| NILAI HURUF = B+");
                        System.out.println("|| ANDA LULUS");
                        }else{
                    if (totalnilai > 80 && totalnilai <= 100) {
                        System.out.println("|| NILAI HURUF = A");
                        System.out.println("|| ANDA LULUS ");
                        }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        }
        
   
}
}