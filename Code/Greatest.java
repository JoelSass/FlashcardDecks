public class Greatest {

    public static int divisive(int x, int y) {
        System.out.println("gx: " + x);
        System.out.println("gy: " + y);
        if (x == y) {
            return x;
        } else if (x > y) {
            return divisive(x - y, y);
        } else {
            return divisive(y, y - x);
        }
    }

    public static int euclid(int x, int y) {
        System.out.println("ex: " + x);
        System.out.println("ey: " + y);
        if (y == 0) {
            return x;
        } else {
            return euclid(y, x % y);
        }
    }

    public static void main(String[] args) {
        //System.out.println(divisive(45, 5));
        System.out.println(euclid(4, 5));
        System.out.println("" + 4 % 1);
    }
}
