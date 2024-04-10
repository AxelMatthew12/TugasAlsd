package April.TestSearching;

import April.TestSearching.Minggu7.Mahasiswa;

public class Nyobasaja {
    int nim;
    String nama;
    int umur;
    double ipk;
    
   
    public static void sequentialSearch(int[] arr, int key) {
        for (int i =0; i < arr.length; i++) {
            if (i == key) {
                System.out.println("Data telah ditemykan pada indeks ke-" + i);
            }
        }
        System.out.println("Data tidak ditemukan");
    }

    public static void main(String[] args) {
        int [] daftarNilai = {10 ,5 ,20, 15, 80, 45};
        sequentialSearch(daftarNilai, 5);
    }
    Nyobasaja(int ni , String n ,int u, double i) {
        nim = ni;
        nama =n ;
        umur = u;
        ipk = i;

       

    }
    void tampil(){
        System.out.println("Nim    =" + nim);
        System.out.println("Nama   =" + nama);
        System.out.println("Ipk    =" + ipk);
        System.out.println("Umur   =" + umur);
        
    }
    public class PencarianMhs {
        Mahasiswa listMhs [] = new Mahasiswa[5];
        int idx;

        void tambah (Mahasiswa m) {
            if (idx < listMhs.length) {
                listMhs[idx] = m;
                idx++;
            } else {
                System.out.println("Data sudah penuh !!");

            }
        }
    }
    
}
    
    
