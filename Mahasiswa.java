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

    public static class PencarianMhs {
        Mahasiswa listMhs[] = new Mahasiswa[5];
        int idx;

        void tambah(Mahasiswa m) {
            if (idx < listMhs.length) {
                listMhs[idx] = m;
                idx++;
            } else {
                System.out.println("Data sudah penuh !!");
            }
        }

        void tampil() {
            for (Mahasiswa m : listMhs) {
                if (m != null) {
                    m.tampil();
                    System.out.println("===================");
                }
            }
        }

        public int FindSeqSearch(int cari) {
            int posisi = -1;
            for (int j = 0; j < listMhs.length; j++) {
                if (listMhs[j] != null && listMhs[j].nim == cari) {
                    posisi = j;
                    break;
                }
            }
            return posisi;
        }

        public void Tampilposisi(int x, int pos) {
            if (pos != -1) {
                System.out.println("Data : " + x + " Ditemukan data pada indeks " + pos);
            } else {
                System.out.println("Data " + x + " tidak ditemukan");
            }
        }

        public void TampilData(int x, int pos) {
            if (pos != -1) {
                System.out.println("Nim\t    : " + x);
                System.out.println("Nama\t   : " + listMhs[pos].nama);
                System.out.println("Umur\t   : " + listMhs[pos].umur);
                System.out.println("IPK\t  : " + listMhs[pos].ipk);
            } else {
                System.out.println("Data " + x + " tidak ditemukan");
            }
        }
    }

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
    }
}

