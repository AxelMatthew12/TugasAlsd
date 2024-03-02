package Mingguketiga.Tugas.TugasKelompok;

class ProductBrain {
    private Menu[] pesanan;
    private int jumlahPesanan;

    public ProductBrain(int jumlahPesanan) {
        pesanan = new Menu[jumlahPesanan];
        this.jumlahPesanan = 0;
    }

    public void tambahPesanan(Menu menu) {
        pesanan[jumlahPesanan] = menu;
        jumlahPesanan++;
    }

    public Menu[] getPesanan() {
        return pesanan;
    }

    public int getJumlahPesanan() {
        return jumlahPesanan;
    }
}

    

