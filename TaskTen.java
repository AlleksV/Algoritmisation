import java.util.Random;
import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        System.out.println("Дан целочисленный массив n. Сжать массив, выбросив каждый второй элемент " +
                "(освободившиеся элементы заменить нулями). Дополнительный массив не использовать!");
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Input size of array:");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            int element = rnd.nextInt(20) - 5;
            array[i] = element;
            if (i % 2 == 0) {
                array[i] = array[i];
            }
            else {
                array[i] = 0;
            }
            System.out.print(array[i] + ", ");
        }
    }
}
