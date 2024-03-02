package Mingguketiga.Tugas.TugasKelompok;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Selamat datang-----");
        System.out.println("1. LOGIN");
        System.out.println("2. LOGOUT");
        int choise = sc.nextInt();
        switch (choise) {
            case 1:
                loginMenu();
                break;
            case 2:
                System.out.println("Anda telah logout...");
                break;
            default:
                break;
        }
    }

    static void loginMenu() {
        String inisial = "Manajer";
        String inisial2 = "Kasir";

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama anda");
        String setname = sc.nextLine();
        System.out.println("Masukkan role anda");
        System.out.println("|Manajer,Kasir|");
        String setrole = sc.nextLine();

        if (setrole.equalsIgnoreCase(inisial)) {
            System.out.println("Menu manajer");
        } else {
            if (setrole.equalsIgnoreCase(inisial2)) {
                System.out.println("Masukkan jumlah pemesan: ");
                int jumlahPesanan = sc.nextInt();
                ProductBrain productBrain = new ProductBrain(jumlahPesanan);
                for (int i = 0; i < jumlahPesanan; i++) {
                    System.out.println("1. Catat menu");
                    System.out.println("2. Pembayaran");
                    System.out.println("3. Pesan menu ");
                    int pilihanMenu = sc.nextInt();
                    switch (pilihanMenu) {
                        case 1:
                            System.out.println("Masukkan nomor menu: ");
                            System.out.println("Pilihan: ");
                            System.out.println("1. Nasi bakar");
                            System.out.println("2. Nasi uduk");
                            System.out.println("3. Nasi ayam geprek");
                            System.out.println("4. Es teh");
                            System.out.println("5. Teh anget");
                            System.out.println("6. Air putih");
                            int nomorMenu = sc.nextInt();
                            String namaMenu = "";
                            double hargaMenu = 0;
                            switch (nomorMenu) {
                                case 1:
                                    namaMenu = "Nasi bakar";
                                    hargaMenu = 15000;
                                    break;
                                case 2:
                                    namaMenu = "Nasi uduk";
                                    hargaMenu = 12000;
                                    break;
                                case 3:
                                    namaMenu = "Nasi ayam geprek";
                                    hargaMenu = 18000;
                                    break;
                                case 4:
                                    namaMenu = "Es teh";
                                    hargaMenu = 5000;
                                    break;
                                case 5:
                                    namaMenu = "Teh anget";
                                    hargaMenu = 4000;
                                    break;
                                case 6:
                                    namaMenu = "Air putih";
                                    hargaMenu = 2000;
                                    break;
                                default:
                                    System.out.println("Menu tidak valid");
                                    break;
                            }
                            Menu menu = new Menu(namaMenu, hargaMenu);
                            productBrain.tambahPesanan(menu);
                            break;
                        default:
                            break;
                    }
                }
                // Menampilkan pesanan dan total harga
                System.out.println("Pesanan:");
                Menu[] pesanan = productBrain.getPesanan();
                int jumlahPesanans = productBrain.getJumlahPesanan();
                double totalHarga = 0;
                for (int i = 0; i < jumlahPesanans; i++) {
                    System.out.println(pesanan[i].getNama() + " : Rp" + pesanan[i].getHarga());
                    totalHarga += pesanan[i].getHarga();
                }
                System.out.println("Total harga: Rp" + totalHarga);
            }
        }
    }
}
