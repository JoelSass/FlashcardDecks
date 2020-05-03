public class Binom {

    public static int binom(int n, int k) {
        if (n == k || k == 0) {
            return 1;
        } else {
            k = n - k < k ? k - n : k;
            int sum = 1;
            for (int i = 0; i <= k; i++) {
                sum = sum * (n - i) / (i + 1);
                System.out.println(sum);
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        binom(4,6);
    }

}
