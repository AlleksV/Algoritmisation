import java.util.Random;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        System.out.println("Дан массив действительных чисел размерностью N. " +
                "Поменять местами наибольший и наименьший элементы");
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        double min = 0.0, max = 0.0;
        int min_coef = 0, max_coef = 0;

        System.out.println("Input size of array: ");
        int size = input.nextInt();
        double[] arr = new double[size];

        for (int i = 0; i < size; i++) {
            int numbInt = rnd.nextInt();
            float numbF = rnd.nextFloat();
            arr[i] = numbF + numbInt;
            System.out.print(arr[i] + ", ");
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] == max) {
                max_coef = i;
            }
            if (arr[i] == min) {
                min_coef = i;
            }
        }
        System.out.println("\n max=" + max + "  min=" + min);
        System.out.println("mincoef: " + min_coef + ";   maxcoef: " + max_coef);
        arr[min_coef] = max;
        arr[max_coef] = min;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
