import java.util.Arrays;
import java.util.Scanner;

public class TaskSixteen {
    public static void main(String[] args) {
        System.out.println("Сформировать квадратную матрицу n-порядка по заданому образцу (n-четное).");
        Scanner input = new Scanner(System.in);
        System.out.println("Input even n:");
        int sizeM = 6;
        int sizeN = 6;
        int indentL = 0; //indent left
        int size = input.nextInt();
        if (size % 2 == 0 && size > 0) {
            sizeM = size;
            sizeN = size;
        } else {
            System.out.println("input correct even n. Default n=6.");
        }
        int[][] matrix = new int[sizeM][sizeN];
        for (int i = 0; i < sizeM; i++) {
            int element1 = 1;
            int half = size / 2;
            if (i < half) {
                for (int j = indentL; j < sizeN; j++) {
                    matrix[i][j] = element1;
                }
            }
            sizeN--;
            indentL++;
            if (i >= (size / 2)) {
                for (int j = sizeN; j < indentL; j++) {
                    matrix[i][j] = element1;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
