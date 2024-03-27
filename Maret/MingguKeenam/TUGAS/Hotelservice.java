package Maret.MingguKeenam.TUGAS;

public class Hotelservice {
     Hotel lisHtl[]= new Hotel[5];
     int idx;

     void tambah (Hotel h) {
        if (idx<lisHtl.length) {
            lisHtl[idx]= h;
            idx++;
        }else {
            System.out.println("Data sudah penuh !!");
        }
     }
     void tampil(){
        for(Hotel h : lisHtl) {
            h.tampil();
            System.out.println("=====================");
        }
     }
     void bubblleSort(){
        for(int i=0; i<lisHtl.length-1; i++){
            for(int j=1; j<lisHtl.length-i; j++){
                if (lisHtl[j].bintang > lisHtl[j-1].bintang) {
                    Hotel tmp = lisHtl[j];
                    lisHtl[j] = lisHtl[j-1];
                    lisHtl[j-1] = tmp;
                }
            }
        }
     }
    }

