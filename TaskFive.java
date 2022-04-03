import java.util.Random;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        System.out.println("Данны целые числа. Вывести на печать только те числа, для которых ai>i");
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = input.nextInt();
        int[] arr_1 = new int[size];
        int[] arr_2 = new int[size];
        System.out.println("Array 1: ");
        for (int i = 0; i < size; i++) {
            int numb = rnd.nextInt();
            arr_1[i] = numb;
            System.out.print(arr_1[i] + ", ");
            if (arr_1[i] > i) {
                arr_2[i] = arr_1[i];
            }
        }
        System.out.println("\n Array 2: ");
        for (int i = 0; i < arr_2.length; i++) {
            System.out.print(arr_2[i] + ", ");
        }
    }
}
