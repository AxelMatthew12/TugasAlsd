package Coret;

import java.util.Scanner;
import java.util.Arrays;

public class Mahasiswa {

    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa(int nim, String nama, int umur, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println("NIM   = " + nim);
        System.out.println("Nama  = " + nama);
        System.out.println("Umur  = " + umur);
        System.out.println("IPK   = " + ipk);
        System.out.println("===================");
    }

    public static class PencarianMhs {
        Mahasiswa[] listMhs;
        int idx;

        public PencarianMhs(int jumlahMahasiswa) {
            listMhs = new Mahasiswa[jumlahMahasiswa];
            idx = 0;
        }

        void tambah(Mahasiswa m) {
            if (idx < listMhs.length) {
                listMhs[idx] = m;
                idx++;
            } else {
                System.out.println("Data sudah penuh!!");
            }
        }

        void tampil() {
            for (Mahasiswa m : listMhs) {
                if (m != null) {
                    m.tampil();
                }
            }
        }

        int[] findBinarySearch(String target) {
            // Mengurutkan array berdasarkan nama mahasiswa sebelum melakukan pencarian biner
            Arrays.sort(listMhs, (a, b) -> a.nama.compareTo(b.nama));

            // Melakukan binary search
            int left = 0;
            int right = idx - 1;
            int[] hasilPencarian = new int[listMhs.length];
            int count = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                int compareHasil = listMhs[mid].nama.compareTo(target);

                if (compareHasil == 0) {
                    // Nama ditemukan
                    // Cari kemungkinan nama serupa di sekitar indeks yang ditemukan
                    hasilPencarian[count] = mid;
                    count++;
                    // Cek sebelah kiri indeks
                    int temp = mid - 1;
                    while (temp >= left && listMhs[temp].nama.equals(target)) {
                        hasilPencarian[count] = temp;
                        count++;
                        temp--;
                    }
                    // Cek sebelah kanan indeks
                    temp = mid + 1;
                    while (temp <= right && listMhs[temp].nama.equals(target)) {
                        hasilPencarian[count] = temp;
                        count++;
                        temp++;
                    }
                    break;
                } else if (compareHasil < 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            // Mengembalikan array hasil pencarian
            return Arrays.copyOf(hasilPencarian, count);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah mahasiswa yang ingin diinput
        System.out.println("Masukkan jumlah mahasiswa yang ingin dimasukkan: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline yang tersisa

        PencarianMhs data = new PencarianMhs(jumlahMahasiswa);

        // Meminta pengguna untuk memasukkan data mahasiswa
        System.out.println("------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari NIM:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("----------------");
            System.out.println("NIM: ");
            int nim = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline yang tersisa
            System.out.println("Nama: ");
            String nama = scanner.nextLine();
            System.out.println("Umur: ");
            int umur = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline yang tersisa
            System.out.println("IPK: ");
            double ipk = scanner.nextDouble();
            scanner.nextLine(); // Konsumsi newline yang tersisa

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        // Menampilkan data mahasiswa
        System.out.println("----------------");
        data.tampil();

        // Meminta pengguna untuk memasukkan nama mahasiswa yang ingin dicari
        System.out.println("-------------------------------");
        System.out.println("Masukkan nama mahasiswa yang dicari: ");
        String cari = scanner.nextLine();

        // Melakukan binary search untuk mencari nama mahasiswa
        int[] hasil = data.findBinarySearch(cari);

        if (hasil.length > 0) {
            System.out.println("Mahasiswa dengan nama '" + cari + "' ditemukan:");
            // Periksa jumlah hasil yang ditemukan
            if (hasil.length > 1) {
                System.out.println("Peringatan: Terdapat lebih dari satu hasil yang cocok dengan nama yang dicari.");
            }
            // Tampilkan detail mahasiswa yang ditemukan
            for (int indeks : hasil) {
                data.listMhs[indeks].tampil();
            }
        } else {
            System.out.println("Mahasiswa dengan nama '" + cari + "' tidak ditemukan.");
        }

        scanner.close();
    }
}
