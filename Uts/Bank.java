package Uts;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Jumlah Nasabah yang ditangani:");
            int jumNsb = sc.nextInt();
            sc.nextLine(); 
             Rekening[] rekeningArray = new Rekening[jumNsb];
            Transaksi[] transaksiArray = new Transaksi[jumNsb];

        for (int i = 0; i < jumNsb; i++) {
            System.out.println("=======================");
            System.out.println("Masukkan data Nasabah:");
            System.out.print("No Rekening: ");
            String noRekening = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Nama Ibu: ");
            String namaIbu = sc.nextLine();
            System.out.print("No Telepon: ");
            String phone = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();

          
            Rekening r = new Rekening(noRekening, nama, namaIbu, phone, email);
            


            rekeningArray[i] = r;

            System.out.println("=======================");
            System.out.println("Masukkan saldo awal: ");
            double saldoawal = sc.nextDouble();
            System.out.println("Masukkan saldo Saat ini: ");
            double saldoakhir = sc.nextDouble();
            System.out.println("Masukkan Tanggal Transaksi: ");
            sc.nextLine(); // Menghindari masalah input
            String tanggalTransaksi = sc.nextLine();
            System.out.println("Type Transaksi: ");
            String type = sc.nextLine();
            double saldo = saldoawal - saldoakhir;

    
            Transaksi t = new Transaksi(saldo, saldoawal, saldoakhir, tanggalTransaksi, type);
            transaksiArray[i] = t;
            sc.nextLine(); 
            
            System.out.println("=======================");
            System.out.println("Tampilkan data? (1. Ya / 2. Lanjut)");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                r.tampilkan();
                t.Tampil();
            } else {
                System.out.println("Data tidak ditampilkan / tidak sesuai dengan inputan");
                System.out.println("====================================");
                System.out.println("Ditampilkan data sebelumnya:");
                r.tampilkan();
                t.Tampil();
            }
        }

        System.out.println("\nMenampilkan semua data nasabah dan transaksi:");
        for (int i = 0; i < rekeningArray.length; i++) {
        System.out.println("=======================");
        rekeningArray[i].tampilkan();
        transaksiArray[i].Tampil();
             }
        }
    }

