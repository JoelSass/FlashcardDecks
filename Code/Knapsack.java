public class Knapsack {

    private static int[] weight = {3,3,3,3,3,3,4,4,4,4, 7, 7, 8, 8, 9};
    private static int[] profit = {4,4,4,4,4,4,5,5,5,5,10,10,11,11,13};

    private static int pack(int[] p, int[] w, int capacity) {
        
        // ******create memoization table******
        int n = w.length;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit += p[i];
        }
        int[][] a = new int[n][maxProfit + 1];
        
        // ****initialize memoization table****        
        a[0][0] = 0; // no items, no weight
        for (int t = 1; t <= maxProfit; t++) {
            if (p[0] != t) {
                a[0][t] = capacity + 1;
            } else {
                a[0][t] = w[0];
            }
        }

        // **********main calculation**********
        for (int i = 1; i < n; i++) {
            for (int t = 0; t <= maxProfit; t++) {
                if (t < p[i]) {
                    a[i][t] = a[i - 1][t];
                } else {
                    a[i][t] = Math.min(a[i - 1][t], a[i - 1][t - p[i]] + w[i]);
                }
            }
        }

        // *****find and return best pack******
        int j = 0;
        for (int t = 0; t <= maxProfit; t++) {
            if (a[n - 1][t] <= capacity) {
                j = t;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(pack(profit, weight, 17));
    }
}