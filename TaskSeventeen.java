import java.util.Arrays;
import java.util.Scanner;

public class TaskSeventeen {
    public static void main(String[] args) {
        System.out.println("Сформировать квадратную матрицу порядка N по правилу: A[I,J]=sin((I^2+J^2)/N).");
        Scanner input = new Scanner(System.in);
        double element = 0.0;
        int positiveElements = 0;
        System.out.println("Input N");
        int N = input.nextInt();
        double[][] matrix = new double[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                element = Math.sin((Math.pow(i, 2) + Math.pow(j, 2)) / N);
                matrix[i][j] = element;
                System.out.print(matrix[i][j] + " \t");
                if (matrix[i][j] > 0) {
                    positiveElements++;
                }
            }
            System.out.println();
        }
        System.out.println("Amount of positive elements: " + positiveElements);
        //   System.out.println(Arrays.deepToString(matrix));
    }
}
