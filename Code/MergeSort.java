public class MergeSort {

    static int theArray[] = {4,1,8,3,11,10,56,6,7,5,2};

    public static int[] sort(int[] s) {
        showStep(s, "Divide:  ");

        int n = s.length;
        if(n >= 2) {
            // *******generate sub arrays******
            int m = n / 2;
            int s1[] = new int[m];
            int s2[] = new int[n - m];
            for (int i = 0; i < m; i++) {
                s1[i] = s[i];
            } 
            for (int i = 0; i < n - m; i++) {
                s2[i] = s[m + i];
            }

            // ************recurse*************
            sort(s1);
            sort(s2);
            int result[] = merge(s1, s2, s);
            showStep(result, "Conquer: ");
            return result;
        }
        return null;
    }

    public static int[] merge(int a[], int b[], int c[]) {

        // *******create loop parameters*******
        int n = a.length;
        int m = b.length;
        int i, j, k;
        i = j = k = 0;

        // ***************Sort*****************
        while ((i < n) && (j < m)) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        // **********Any leftovers in A?*******
        while (i < n) {
            c[k] = a[i];
            i++;
            k++;
        } 

        // **********Any leftovers in B?*******
        while (j < m) {
            c[k] = b[j];
            j++;
            k++;
        }

        return c;
    }

    public static void showStep(int[] x, String label) {
        int n = x.length;
        System.out.print(label + "[");
        for(int i = 0; i < n; i++) {
            if(i == n - 1) {
                System.out.println(x[i] + "]");
            } else {
                System.out.print(x[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        int s[] = sort(theArray);
    }
}
