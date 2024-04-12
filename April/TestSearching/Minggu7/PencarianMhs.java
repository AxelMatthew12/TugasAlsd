package April.TestSearching.Minggu7;

public class PencarianMhs {
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
    public int FindBinarySeacrh(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].nim) {
               return (mid); 
            }else if (listMhs[mid].nim > cari) {
                return FindBinarySeacrh(cari, left,mid -1);
            } else {
                return FindBinarySeacrh(cari,mid + 1, right);
            }
        }
        return -1;
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
