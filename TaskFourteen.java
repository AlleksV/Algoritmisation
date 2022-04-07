import java.util.Arrays;
import java.util.Scanner;

public class TaskFourteen {
    public static void main(String[] args) {
        System.out.println("Сформировать квадратную матрицу n-порядка по заданому образцу (n-четное).");
        Scanner input = new Scanner(System.in);
        System.out.println("Input even n:");
        int numbN = 4;
        int inputN = input.nextInt();
        if (inputN % 2 == 0 && inputN > 0) {
            numbN = inputN;
        } else {
            System.out.println("Try again and Input even n... default n=4 ");
        }
        int[][] matrix = new int[numbN][numbN];
        for (int i = 0; i < numbN; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numbN; j++) {
                    int k1 = j + 1;
                    matrix[i][j] = k1;
                    System.out.print("  " + matrix[i][j] + "  ");
                }
                System.out.println();
            } else {
                for (int j = 0; j < numbN; j++) {
                    int k2 = numbN - j;
                    matrix[i][j] = k2;
                    System.out.print("  " + matrix[i][j] + "  ");
                }
                System.out.println();
            }
        }
        //      System.out.println(Arrays.deepToString(matrix));
    }
}