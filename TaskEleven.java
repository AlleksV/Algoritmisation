import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        System.out.println("Дана матрица. Вывести на экран все нечетные столбцы, " +
                "у которых первый элемент больше последнего.");
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int min = 0;
//        System.out.println("Enter amount of lines and columns:");
        int m = 5;
        int n = 12;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int element = rnd.nextInt(10) + 10;
                matrix[i][j] = element;
                System.out.print("  " + matrix[i][j] + "  ");
            }
            System.out.println("");
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j += 2) {
                if (matrix[0][j] > matrix[m - 1][j]) {
                    System.out.print("  " + matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(Arrays.deepToString(matrix));
    }
}
