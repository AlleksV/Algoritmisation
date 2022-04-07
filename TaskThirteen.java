import java.util.Random;
import java.util.Scanner;

public class TaskThirteen {
    public static void main(String[] args) {
        System.out.println("Дана матрица. Вывести К-ю строку и Р-й столбец.");
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("input size of matrix m and n: ");
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Choose K-line and P-column: ");
        int k = input.nextInt() - 1;
        int p = input.nextInt() - 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int element = rnd.nextInt(10) + 10;
                matrix[i][j] = element;
                System.out.print("  " + matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println(" <<" + matrix[k][p] + ">> ");
    }
}
