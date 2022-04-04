import java.util.Random;
import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        System.out.println("В массиве целых чисел с количеством элементов N найти наиболее часто встречающееся число." +
                "Если таких чисел несколько, то определить наименьшее из них.");
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = input.nextInt();
        int min = 0;
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] popularElements = new int[size];
        int[] popularArr = new int[size];
        for (int i = 0; i < size; i++) {
            int element = rnd.nextInt(20) - 10;
            array1[i] = element;
            array2[i] = array1[i];
        }
        //           System.out.print(array1[i] + ", ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array1[i] == array2[j]) {
                    popularElements[i]++;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            if (popularElements[i] >= 2) {
                popularArr[i] = array1[i];
                if (popularArr[i] < min) ;
                {
                    min = popularArr[i];
                }
            }
        }
        System.out.println("Your array is:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println("\nArray of reps (elements repeated one, two and more times):");
        for (int i = 0; i < popularElements.length; i++) {
            System.out.print(popularElements[i] + ", ");
        }
        System.out.println("\nArray of popular elements:");
        for (int i = 0; i < popularArr.length; i++) {
            System.out.print(popularArr[i] + ", ");
        }
        System.out.println("\n min=" + min);
    }
}
