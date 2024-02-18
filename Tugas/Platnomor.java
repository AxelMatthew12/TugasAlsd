package Tugas;
import java.util.Scanner;
public class Platnomor {
    static void mainbrain(){
        Scanner sc= new Scanner(System.in);
        int pilihan1;    
        System.out.println("=======================================");
        System.out.println("||              WELCOME              ||");
        System.out.println("||                                   ||");
        System.out.println("||             1. Masuk              ||");
        System.out.println("||             2. Keluar             ||");
        System.out.println("=======================================");
        pilihan1=sc.nextInt();
        // switch
        switch (pilihan1) {
            case 1:
            masukmenu();
                break;
                case 2:
                keluarmenu();
                break;
            default:
                break;
        }
    }
    static void masukmenu(){
        Scanner sc= new Scanner(System.in);
        System.out.println("||==================================||");
        System.out.println("||                                  ||");
        System.out.println("||             WELCOME              ||");
        System.out.println("||        1. CEK PLATNOMOR          ||");
        System.out.println("||        2. CEK KOTA ASAL PLAT     ||");
        System.out.println("||        3. KELUAR                 ||");
        System.out.println("||==================================||");
        System.out.println("|| Option : ");
        int optionch=sc.nextInt();
        switch (optionch) {
            case 1:
             menuceknomor();
                break;
                case 2:
                menucekplat();
                break;
        
            default:
                break;
        }
    }
    static void menuceknomor(){
        Scanner sc= new Scanner(System.in);
    System.out.println("===================================");
    System.out.println("||            WELCOME            ||");
    System.out.println("||          1. CEK               ||");
    System.out.println("||          2. BACK ?            ||");
    System.out.println("===================================");
    int option= sc.nextInt();
    if (option==1) {
        System.out.println("|| Masukkan nomor plat anda :    ||");
        String masuknomor= sc.next();
        if (masuknomor.length() > 7) {
            System.out.println("Nomor plat tidak valid. Panjang nomor plat harus kurang dari atau sama dengan 7 karakter.");
            menuceknomor(); // Memanggil kembali fungsi untuk mengulang input
        } else {
            System.out.println("|| Masukkan Huruf depan plat :   ||");
            String masukdepan= sc.next();
            
            switch (masukdepan) {
                case "N":
                    System.out.println(" PLAT NOMOR ANDA DARI MALANG");
                    break;
                case "A":
                    System.out.println("PLAT NOMOR ANDA DARI BANTEN");
                    break;
                    case "D":
                    System.out.println("PLAT NOMOR ANDA DARI BANDUNG");
                    break;
                    case "E":
                    System.out.println("PLAT NOMOR ANDA DARI CIREBON");
                    break;
                    case "F":
                    System.out.println("PLAT NOMOR ANDA DARI BOGOR");
                    break;
                    case "G":
                    System.out.println("PLAT NOMOR ANDA DARI PEKALONGAN");
                    break;
                    case "H":
                    System.out.println("PLAT NOMOR ANDA DARI SEMARANG");
                    break;
                    case "L":
                    System.out.println(" PLAT NOMOR ANDA DARI SURABAYA");
                    break;
                    case "T":
                    System.out.println("PLAT NOMOR ANDA DARI TEGAL");
                    break;
                    case "B":
                    System.out.println(" PLAT NOMOR ANDA DARI JAKARTA");
                    break;
            
                default:
                    break;
            }
        }
         }
    }
    static void menucekplat(){
        Scanner sc= new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("||         WELCOME         ||");
        System.out.println("||    1. LIAT INFO KODE    ||");
        System.out.println("||    2. KEMBALI KE AWAL   ||");
        System.out.println("=============================");
        int option= sc.nextInt();
        switch (option) {
            case 1:
                infokode();
                break;
                case 2 :
                masukmenu();
                break;
        
            default:
                break;
        }
    }
    static void infokode(){

    }
    static void keluarmenu(){

    }
    public static void main(String[] args) {
        mainbrain();
    }
}
