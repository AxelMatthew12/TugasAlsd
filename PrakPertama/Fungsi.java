package PrakPertama;

public class Fungsi {
    public static void main(String[] args) {
        double totalgarden1 = 0; 
        double totalgarden2 = 0;
        double totalgarden3 = 0;
        double totalgarden4 = 0;
        double[][] stokbarang={
            // Royalgarden1
            {10, 5, 15, 7},
            // Royalgarden2
            {6, 11, 9, 12},
            // Royalgarden3
            {2, 10, 10, 5},
            // Royalgarden4
            {5, 7, 12, 9},
        };
        double[] harga = {75.000, 50.000 , 60.000 , 10.000};
        
        // Pengurangan stok untuk Royal Garden 4
        stokbarang[3][0] -= 1; // Aglonema
        stokbarang[3][1] -= 2; // Keladi
        stokbarang[3][2] -= 0; // Alocasia
        stokbarang[3][3] -= 5; // Mawar
        
        // Menghitung total untuk setiap Royal Garden
        for(int i = 0; i < stokbarang.length; i++) {
            double total = 0;
            for(int j = 0; j < stokbarang[i].length; j++) {
                total += stokbarang[i][j] * harga[j];
            }
            switch (i) {
                case 0:
                    totalgarden1 = total;
                    break;
                case 1:
                    totalgarden2 = total;
                    break;
                case 2:
                    totalgarden3 = total;
                    break;
                case 3:
                    totalgarden4 = total;
                    break;
                default:
                    break;
            }
        }
        
        // Menampilkan hasil
        System.out.println("Pendapatan untuk : ");
        System.out.println("Royal garden 1 = " + totalgarden1);
        System.out.println("Royal garden 2 = " + totalgarden2);
        System.out.println("Royal garden 3 = " + totalgarden3);
        System.out.println("Royal garden 4 = " + totalgarden4);
        
        // Menampilkan stok terbaru untuk Royal Garden 4
        System.out.println("Stok terbaru untuk Royal Garden 4:");
        System.out.println("Aglonema: " + stokbarang[3][0]);
        System.out.println("Keladi: " + stokbarang[3][1]);
        System.out.println("Alocasia: " + stokbarang[3][2]);
        System.out.println("Mawar: " + stokbarang[3][3]);
    }
}
