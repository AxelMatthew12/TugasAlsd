package Uts;

public class Rekening {
    String noRekening;
    String nama;
    String namaIbu;
    String phone;
    String Email;

    Rekening(String noRekening, String nama, String namaIbu, String phone, String Email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.phone = phone;
        this.Email= Email;
    }

    void tampilkan() {
        System.out.println("========== DATA NASABAH ==");
        System.out.println("||No Rekening : " + noRekening + "\t||");
        System.out.println("||Nama        : " + nama + "\t||");
        System.out.println("||Nama Ibu    : " + namaIbu + "\t||");
        System.out.println("||No HP       : " + phone + "\t||");
        System.out.println("||Email     : " + Email+ "\t||");
        System.out.println("==========================");
    }
}

class PencarianNasabah {
    Rekening[] listNsb = new Rekening[5];
    int idx = 0;

    void tambah(Rekening r) {
        if (idx < listNsb.length) {
            listNsb[idx] = r;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilkan() {
        for (Rekening r : listNsb) {
            if (r != null) {
                r.tampilkan();
                System.out.println("===============");
            }
        }
    }
    
   
    void sortByNamaDescending() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                // Cari indeks dengan nama terbesar
                if (listNsb[j].nama.compareTo(listNsb[maxIndex].nama) > 0) {
                    maxIndex = j;
                }
            }
            // Tukar elemen di posisi i dengan elemen di posisi maxIndex
            Rekening temp = listNsb[i];
            listNsb[i] = listNsb[maxIndex];
            listNsb[maxIndex] = temp;
                }
            }
        }


    

    


