import java.util.Random;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        System.out.println("Дан массив действительных чисел размерностью N. Подсчитать количество положительных," +
                " отрицательных и нулевых элементов");
        int positive = 0, negative = 0, zero = 0;
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = input.nextInt();
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            float numbF = rnd.nextFloat();
            int numbInt = rnd.nextInt();
            arr[i] = numbF + numbInt;
            System.out.print(arr[i] + ", ");
            if (arr[i] > 0) {
                positive += 1;
            }
            if (arr[i] < 0) {
                negative++;
            }
            if (arr[i] == 0) {
                zero++;
            }
        }
        System.out.println("\n Sum of positive elements: " + positive);
        System.out.println(" Sum of negative elements: " + negative);
        System.out.println(" Sum of zero elements: " + zero);

    }
}
