import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
//        Random rnd = new Random();
        //      int number = rnd.nextInt(10);
        //    System.out.println("Random number: " + number);
        System.out.println("Дана последовательность действительных чисел. Заменить все ее члены, большие Z, этим числом." +
                " Подсчитать количество замен");
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Input Z: ");
        int z = input.nextInt();

        System.out.println("Input size of array:");
        int size = input.nextInt();
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            int numberInt = rnd.nextInt();
            float numberF = rnd.nextFloat();
            arr[i] = numberF + numberInt;
            System.out.print(arr[i] + ", ");
            if (arr[i] > z) {
                arr[i] = z;
                sum++;
                System.out.print(" - elements changed to Z! \n");
            }
        }
        System.out.println("\n New array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\n The number of changed array elements: " + sum);
    }
}
