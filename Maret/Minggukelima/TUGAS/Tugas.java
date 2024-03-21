package Maret.Minggukelima.TUGAS;

public class Tugas {

        // Brute Force Approach
        public static int sqrtBruteForce(int x) {
            if (x == 0 || x == 1)
                return x;
    
            int result = 1;
            while (result * result <= x) {
                result++;
            }
            return result - 1;
        }
    
        // Divide Conquer Approach
        public static int sqrtDivideConquer(int x) {
            if (x == 0 || x == 1)
                return x;
            
            int left = 1, right = x, ans = 0;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (mid <= x / mid) {
                    left = mid + 1;
                    ans = mid;
                } else {
                    right = mid - 1;
                }
            }
            return ans;
        }
    
    }
    

