package April.TestSearching.Minggu7;
import java.util.Scanner;

public class Mahasiswa {
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa(int ni, String n, int u, double i) {
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nim  = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK  = " + ipk);
    }
    public class MahasiswaMain{
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
    
            PencarianMhs data = new PencarianMhs();
            int jumMhs = 5;
    
            System.out.println("------------------------");
            System.out.println("Masukkan data mahasiswa secara Urut dari Nim");
            for (int i = 0; i < jumMhs; i++) {
                System.out.println("----------------");
                System.out.println("NIM\t: ");
                int nim = s.nextInt();
                System.out.println("Nama\t: ");
                s.nextLine(); // Consume newline left-over
                String nama = s.nextLine();
                System.out.println("Umur\t: ");
                int umur = s.nextInt();
                System.out.println("IPK\t: ");
                double ipk = s.nextDouble();
    
                Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
                data.tambah(m);
            }
            data.tampil();
            
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");
            System.out.println("Pencarian Data : ");
            System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
            System.out.println("NIM : ");
            int cari = s.nextInt();
            System.out.println("menggunakan sequential Search");
            int posisi = data.FindSeqSearch(cari);
            data.Tampilposisi(cari, posisi);
            data.TampilData(cari, posisi);
        
            System.out.println("=============================");
            System.out.println("menggunakan binary Search");
            posisi = data.FindBinarySeacrh(cari,0, jumMhs-1);
            data.Tampilposisi(cari,posisi);
            data.TampilData(cari, posisi);
        }
}
}
