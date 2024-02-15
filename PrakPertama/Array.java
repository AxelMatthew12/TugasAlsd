package PrakPertama;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] matkul = {
            "Pengantar Akutansi,Manajemen Bisnis",
            "Dasar pemrograman Teori",
            "Critical thinking problem solving",
            "Dasar pemrograman Praktikum",
            "Bahasa Inggris",
            "Bahasa Indonesia",
            "Agama Kristen",
            "Matematika dasar",
            "Konsep Teknologi Informasi"
        };
        double[] nilaiMatkul = new double[matkul.length]; // Array untuk menyimpan nilai
        int[] sksMatkul = {2, 2, 2, 2, 2, 2, 2, 2, 3}; // Array untuk menyimpan jumlah SKS setiap mata kuliah
        double[] bobotNilai = new double[matkul.length]; // Array untuk menyimpan bobot yang diberikan untuk setiap nilai

        System.out.println("=========================");
        System.out.println("Program menghitung IP Semester");
        System.out.println("=========================");

        // Meminta pengguna untuk memasukkan nilai untuk setiap mata kuliah
        double totalNilai = 0;
        double total = 0; // total bobot nilai dikalikan SKS
        int totalSKS = 0;
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai untuk " + matkul[i] + ": ");
            nilaiMatkul[i] = sc.nextDouble();
            
            // Menghitung bobot nilai dikalikan SKS untuk setiap mata kuliah
            if (nilaiMatkul[i] <= 39) {
                bobotNilai[i] = 0;
            } else if (nilaiMatkul[i] > 39 && nilaiMatkul[i] <= 50) {
                bobotNilai[i] = 1.0;
            } else if (nilaiMatkul[i] >= 50 && nilaiMatkul[i] <= 60) {
                bobotNilai[i] = 2.0;
            } else if (nilaiMatkul[i] > 60 && nilaiMatkul[i] <= 65) {
                bobotNilai[i] = 2.5;
            } else if (nilaiMatkul[i] > 65 && nilaiMatkul[i] <= 73) {
                bobotNilai[i] = 3.0;
            } else if (nilaiMatkul[i] > 73 && nilaiMatkul[i] <= 80) {
                bobotNilai[i] = 3.5;
            } else if (nilaiMatkul[i] > 80 && nilaiMatkul[i] <= 100) {
                bobotNilai[i] = 4.0;
            }
            
            // Menjumlahkan total bobot nilai dikalikan SKS
            total += bobotNilai[i] * sksMatkul[i];
            totalSKS += sksMatkul[i]; // Menjumlahkan total SKS
        }

        // Menampilkan nilai untuk setiap mata kuliah setelah semua nilai dimasukkan
        System.out.println("=========================================");
        System.out.println("MK \t\t\t\tNILAI ANGKA \tNILAI HURUF \tBOBOT NILAI");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < matkul.length; i++) {
            String kategori = ""; // Untuk menyimpan kategori nilai
            if (nilaiMatkul[i] <= 39) {
                kategori = "E";
            } else if (nilaiMatkul[i] > 39 && nilaiMatkul[i] <= 50) {
                kategori = "D";
            } else if (nilaiMatkul[i] >= 50 && nilaiMatkul[i] <= 60) {
                kategori = "C";
            } else if (nilaiMatkul[i] > 60 && nilaiMatkul[i] <= 65) {
                kategori = "C+";
            } else if (nilaiMatkul[i] > 65 && nilaiMatkul[i] <= 73) {
                kategori = "B";
            } else if (nilaiMatkul[i] > 73 && nilaiMatkul[i] <= 80) {
                kategori = "B+";
            } else if (nilaiMatkul[i] > 80 && nilaiMatkul[i] <= 100) {
                kategori = "A";
            }
            System.out.printf("%-50s%-15.2f%-10s%-10.1f\n", matkul[i], nilaiMatkul[i], kategori, bobotNilai[i]);
        }
        System.out.println("=========================================");

        // Menghitung dan menampilkan IP Semester
        double ipSemester = total / totalSKS;
        System.out.printf("IP Semester: %.2f\n", ipSemester);

        sc.close();
    }
}
