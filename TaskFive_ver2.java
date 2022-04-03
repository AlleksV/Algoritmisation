import java.util.Random;
import java.util.Scanner;

public class TaskFive_ver2 {
    public static void main(String[] args) {
        System.out.println("Данны целые числа. Вывести на печать только те числа, для которых ai>i");
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = input.nextInt();
        int[] arr_1 = new int[size];
        int elem = 0;
        //    int [] arr_2 = new int[size];
        System.out.println("Elements of array for which ai>i: ");
        for (int i = 0; i < size; i++) {
            int numb = rnd.nextInt();
            arr_1[i] = numb;
            //         System.out.print(arr_1[i] + ", ");
            if (arr_1[i] > i) {
                System.out.print(arr_1[i] + ", ");
            }
        }

    }
}
