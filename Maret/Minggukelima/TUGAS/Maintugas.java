package Maret.Minggukelima.TUGAS;

public class Maintugas {
    public static void main(String[] args) {
        int number = 25; // Ganti dengan bilangan yang ingin diakarkan

        // Brute Force
        int sqrtBF = sqrtBruteForce(number);
        System.out.println("Akarnya dengan Brute Force: " + sqrtBF);

        // Divide Conquer
        int sqrtDC = sqrtDivideConquer(number);
        System.out.println("Akarnya dengan Divide Conquer: " + sqrtDC);
    }

    // Brute Force
    public static int sqrtBruteForce(int x) {
        if (x == 0 || x == 1) return x;

        int i = 1, result = 1;
        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }

    // Divide Conquer
    public static int sqrtDivideConquer(int x) {
        if (x == 0 || x == 1) return x;
        return sqrtDivideConquerHelper(x, 0, x);
    }

    public static int sqrtDivideConquerHelper(int x, int start, int end) {
        int mid = (start + end) / 2;

        if (mid * mid == x || (mid * mid < x && (mid + 1) * (mid + 1) > x))
            return mid;

        if (mid * mid < x)
            return sqrtDivideConquerHelper(x, mid + 1, end);
        else
            return sqrtDivideConquerHelper(x, start, mid - 1);
    }
}
