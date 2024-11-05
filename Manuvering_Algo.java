import java.util.*;
class Main {
    public static int Manuvering(int x, int y, int r, int d) {
        if (r == x-1 && d == y-1) {
            return 1;
        }
        if (r >= x || d >= y) {
            return 0;
        }
        int q = Manuvering(x, y, r + 1, d);
        int w = Manuvering(x, y, r, d + 1);

        return q + w;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println(Manuvering(rows, cols, 0, 0));
        sc.close();
    }
}
