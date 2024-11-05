import java.util.*;

public class Perm_Sorted_Order {
    public static void swap(char[] c, int x, int i) {
        char t = c[x];
        c[x] = c[i];
        c[i] = t;
    }

    public static void permutation(char[] c, int i) {
        if (i == c.length) {
            System.out.println(new String(c)); // Print the permutation
            return;
        }
        for (int x = i; x < c.length; x++) {
            swap(c, x, i);
            permutation(c, i + 1);
            swap(c, x, i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String st = sc.next();
        char[] c = st.toCharArray();
        Arrays.sort(c);
        permutation(c, 0);
        sc.close();
    }
}
