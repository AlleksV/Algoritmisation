import java.util.Random;
import java.util.Scanner;

public class TaskTwelve {
    public static void main(String[] args) {
        System.out.println("Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.");
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Input number of lines and columns:");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int element = rnd.nextInt(10) + 10;
                matrix[i][j] = element;
                System.out.print("  " + matrix[i][j] + "  ");
            }
            System.out.println();
        }
        //This condition can be inserted into previously cycle
        System.out.println("Diagonal elements: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
        }
    }
}
