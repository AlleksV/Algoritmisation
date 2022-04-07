import java.util.Arrays;
import java.util.Scanner;

public class TaskFifteen {
    public static void main(String[] args) {
        System.out.println("Сформировать квадратную матрицу n-порядка по заданому образцу (n-четное).");
        Scanner input = new Scanner(System.in);
        int sizeM = 4;
        int sizeN = 4;
        System.out.println("Input even n: ");
        int inputN = input.nextInt();
        if (inputN % 2 == 0 && inputN > 0) {
            sizeM = inputN;
            sizeN = inputN;
        } else {
            System.out.println("Input even n. Default n=4");
        }
        int[][] matrix = new int[sizeM][sizeN];
        for (int i = 0; i < sizeM; i++) {
            int element = 1 + i;
            for (int j = 0; j < sizeN; j++) {
                matrix[i][j] = element;
            }
            sizeN--;
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
