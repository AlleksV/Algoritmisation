import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskNineteen {
    public static void main(String[] args) {
        System.out.println("Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. " +
                "Определить какой столбец содержит максимальную сумму.");
        Random rnd = new Random();
        int max = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter dimension of matrix: \n m and n:");
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int element = rnd.nextInt(5) + 1;
                matrix[i][j] = element;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += matrix[j][i];
            }
            if (sum > max) {
                max = sum;
            }
            System.out.println("column " + (i+1) + ": suma=" + sum);
        }
        System.out.println("Max sum = " + max);
    }
}
