package Maret.Mingguketiga.Tugas.Mahasiswa;
import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);

         System.out.println("Masukkan jumlah mahasiswa : ");
         int jumlahMahasiswa= sc.nextInt();

         Mahasiswa[] mahasiswas = new Mahasiswa[jumlahMahasiswa];

         double totalIPK = 0; // Variabel untuk menyimpan total IPK

         for(int i = 0; i < jumlahMahasiswa; i++) {
            Mahasiswa mahasiswa = new Mahasiswa();

            System.out.println("Masukkan data untuk Mahasiswa ke-" + (i+1) + ":");
            System.out.println("Nama: ");
            mahasiswa.setNama(sc.next());

            System.out.println("Jenis kelamin (L/P): ");
            mahasiswa.setKelamin(sc.next());

            System.out.println("NIM: ");
            mahasiswa.setNIM(sc.next());

            System.out.println("IPK: ");
            double ipk = sc.nextDouble();
            mahasiswa.setIPK(ipk);

            totalIPK += ipk; // Menambahkan IPK ke totalIPK

            mahasiswas[i] = mahasiswa;
         }

         System.out.println("Data Mahasiswa: ");
         int counter = 1;
         for (Mahasiswa mahasiswa : mahasiswas) {
             System.out.println("\nMahasiswa ke-" + counter);
             System.out.println("Nama         :  " + mahasiswa.getNama());
             System.out.println("Jenis kelamin:  " + mahasiswa.getJeniskelamin());
             System.out.println("NIM          :  " + mahasiswa.getNIM());
             System.out.println("IPK          :  " + mahasiswa.getIPK());
             System.out.println();
             counter++;
         }

         // Menghitung rata-rata IPK
         double rataRataIPK = totalIPK / jumlahMahasiswa;
         System.out.println("Rata-rata IPK Mahasiswa: " + rataRataIPK);

         sc.close();
    }
}
