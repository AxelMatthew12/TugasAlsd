package Maret.Minggukelima.Sum;
import java.util.Scanner;

public class Mainsum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=================================================");
            System.out.println("Program Menghitung Keuntungan Total Perusahaan");
            System.out.println("=================================================");
            System.out.print("Masukkan jumlah perusahaan: ");
            int numCompanies = sc.nextInt();
    
            Sum[] companies = new Sum[numCompanies]; // Array untuk menyimpan objek Sum perusahaan
    
            for (int i = 0; i < numCompanies; i++) {
                System.out.println("-------------------------------------------------");
                System.out.println("Perusahaan " + (i+1));
                System.out.print("Masukkan jumlah bulan: ");
                int numMonths = sc.nextInt();
    
                companies[i] = new Sum(numMonths); // Membuat objek Sum untuk setiap perusahaan
    
                for (int j = 0; j < companies[i].elemen; j++) {
                    System.out.print("Masukkan untung bulan ke-" + (j+1) + " (dalam juta): ");
                    companies[i].keuntungan[j] = sc.nextDouble();
                }
            }
    
            System.out.println("=================================================");
            for (int i = 0; i < numCompanies; i++) {
                System.out.println("Total keuntungan perusahaan " + (i+1) + " adalah:");
                System.out.printf("Metode Brute Force: %.2f\n", companies[i].totalBF(companies[i].keuntungan));
                System.out.printf("Metode Divide Conquer: %.2f\n", companies[i].totalDC(companies[i].keuntungan, 0, companies[i].elemen - 1));
            }
        }
    }
    
