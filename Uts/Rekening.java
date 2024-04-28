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



    

    


