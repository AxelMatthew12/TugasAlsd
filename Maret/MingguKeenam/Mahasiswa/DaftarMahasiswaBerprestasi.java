package Maret.MingguKeenam.Mahasiswa;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa lisMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < lisMhs.length) {
            lisMhs[idx] = m ;
            idx++;
        }else {
            System.out.println("Data sudah penuh !!");
        }
    }
    void tampil(){
        for(Mahasiswa m : lisMhs) {
            m.tampil();
            System.out.println("============================");
        }
    }
    void bubbleSort(){
        for(int i=0; i<lisMhs.length-1;i++){
            for(int j=1; j<lisMhs.length-i; j++){
                if (lisMhs[j].ipk > lisMhs[j-1].ipk) {
                    // proses swap
                    Mahasiswa tmp = lisMhs[j];
                    lisMhs[j]= lisMhs[j-1];
                    lisMhs[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for(int i=0; i<lisMhs.length-1;i++){
            int idxMin = i;
            for(int j=i+1; j < lisMhs.length; j++){
                if (lisMhs[j].ipk < lisMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }

            Mahasiswa tmp = lisMhs[idxMin];
            lisMhs[idxMin] = lisMhs[i];
            lisMhs[i] = tmp;
        }
    }
    void insertionSort() {
        for (int i = 1; i < lisMhs.length; i++) {
            Mahasiswa temp = lisMhs[i];
            int j = i - 1; // Ubah j menjadi i - 1
            while (j >= 0 && lisMhs[j].ipk < temp.ipk) { // Ubah kondisi perbandingan
                lisMhs[j + 1] = lisMhs[j]; // Geser elemen ke kanan
                j--;
            }
            lisMhs[j + 1] = temp; // Tempatkan elemen temp pada posisi yang sesuai
        }
    }
    
}
