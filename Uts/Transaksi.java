package Uts;

public class Transaksi {
     double saldo;
     double saldoAwal;
     double saldoAkhir;
     String tanggalTransaksi;
     String type;
     

    public Transaksi(double saldo, double saldoAwal, double saldoAkhir, String tanggalTransaksi, String type) {
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
    }

    public void Tampil() {
        System.out.println("====== TRANSAKSI =====");
        System.out.println("|| Penggunaan Saldo: " + saldo + " ||");
        System.out.println("|| Saldo Awal: " + saldoAwal + " ||");
        System.out.println("|| Saldo Saat ini: " + saldoAkhir + " ||");
        System.out.println("|| Tanggal Transaksi: " + tanggalTransaksi + " ||");
        System.out.println("|| Tipe: " + type + " ||");
        System.out.println("========================");
    }
}
 class PencarianTransaksi {
    public Transaksi[] listtF = new Transaksi[5];
    public int idx = 0;

     void tambah(Transaksi t) {
        if (idx < listtF.length) {
            listtF[idx] = t;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }


    void tampilkan() {
        for (Transaksi t : listtF) {
            if (t != null) {
                t.Tampil();
                System.out.println("===============");
                }
  }
 }
 
}

        
    
