import java.util.Scanner;

public class Floid {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int y = 0; y < N; y++)
                matrix[i][y] = in.nextInt();
        for (int k = 0; k < N; ++k)
            for (int i = 0; i < N; ++i)
                for (int j = 0; j < N; ++j)
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
        for (int i = 0; i < N; i++) {
            for (int y = 0; y < N; y++)
                System.out.print(matrix[i][y] + " ");
            System.out.println();
        }
    }
}
