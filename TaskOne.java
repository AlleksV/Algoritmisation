import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println("В массив A [N] занесены натуральные числа. Найти сумму тех элементов, " +
                "которые кратны данному К.");
        Scanner input = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int k, sum = 0;
        int size = input.nextInt();
        System.out.println("input k (odd = 3 or even = 2): ");
        k = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                sum += arr[i];
            }
        }
        System.out.println("\n the sum of those elements that are multiples of a " + k + " is equal: " + sum);
        //   System.out.println("\n" + arr[3]);
    }
}
