package Maret.Minggukelima.namapangkat;

public class Namapangkat {
    public int nilai, pangkat;

    public int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    public int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            int temp = pangkatDC(a, n / 2);
            if (n % 2 == 0) {
                return temp * temp;
            } else {
                return temp * temp * a;
            }
        }
    }
}
