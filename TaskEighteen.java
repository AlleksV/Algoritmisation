import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskEighteen {
    public static void main(String[] args) {
        System.out.println("В числовой матрице поменять местами два столбца, т.е. все элементы одного столбца " +
                "поставить на соответствующие позиции другого, а элементы второго - переместить в первый. " +
                "Номера столбцов вводит пользватель!");
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Enter size of Matrix m = ?, n = ? : ");
        System.out.print("m = ");
        int m = input.nextInt();
        System.out.print("n = ");
        int n = input.nextInt();
        int[][] matrix = new int[m][n];
        int[][] column = new int[m][n];
        System.out.println("Input numbers of columns (a and b) which we need to change places: ");
        if (m != 0 && n != 0) {
            m = m;
            n = n;
        } else {
            System.out.println("input correct size. Try again!");
            return;
        }
        int a = input.nextInt();
        int b = input.nextInt();
        if (a <= n && b <= n && a != b) {
            a = a - 1;
            b = b - 1;
        } else {
            System.out.println("input correct columns. Try again!");
            return;
        }
        System.out.println("Your random matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int element = rnd.nextInt(10)+10;
                matrix[i][j] = element;
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix with changed a and b: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                column[i][b] = matrix[i][b];
                matrix[i][b] = matrix[i][a];
                matrix[i][a] = column[i][b];
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
               System.out.println(Arrays.deepToString(column));
    }
}
