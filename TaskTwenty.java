import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskTwenty {
    public static void main(String[] args) {
        System.out.println("Найти положительные элементы главной диагонали квадратной матрицы. ");
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter square matrix dimension m: ");
        int a = scan.nextInt();
        int[][] matrix = new int[a][a];
        System.out.println("Positive elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int elements = rnd.nextInt(20) - 7;
                matrix[i][j] = elements;
                if (i == j && elements > 0) {
                    System.out.print("m = " + (i + 1) + "*" + (i + 1) + " --> " + elements + "\n");
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(matrix));
    }
}
