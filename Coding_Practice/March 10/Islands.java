import java.util.*;

public class Islands {
    static int islands(int arr[][], int M, int N) {
        int count = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1) {
                    check(arr, i, j, M, N);
                    count++;
                }
            }
        }
        return count;
    }

    static void check(int arr[][], int i, int j, int M, int N) {
        if (i < 0 || i >= M || j < 0 || j >= N || arr[i][j] != 1) {
            return;
        }

        arr[i][j] = 2;

        check(arr, i + 1, j, M, N); 
        check(arr, i - 1, j, M, N); 
        check(arr, i, j + 1, M, N); 
        check(arr, i, j - 1, M, N); 
        check(arr, i + 1, j-1, M, N); 
        check(arr, i +1, j+1, M, N); 
        check(arr, i-1, j -1, M, N); 
        check(arr, i-1, j +1, M, N); 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[M][N]; // Corrected declaration and initialization
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = islands(arr, M, N);
        System.out.println("Number of islands: " + result);
    }
}
