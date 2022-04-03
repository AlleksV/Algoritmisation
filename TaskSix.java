import java.util.Random;
import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        System.out.println("Задана последовательность N вещественных чисел. Вычислить сумму чисел, " +
                "порядковые номера которых являются простыми числами");
        Random rnd = new Random();
        double[] arr = new double[24];
        double sum = 0.0;

        for (int i = 0; i < arr.length; i++) {
            double elem = rnd.nextDouble();
            arr[i] = elem;
//            System.out.print(arr[i] + ", ");
            int j = i + 1;
            if (j != 1 && j % 2 == 1 || j == 2 || j ==3) {
                if (j % 3 == 1 || j % 3 == 2 || j == 3){
                    sum += arr[i];
    //                System.out.print("\n elem= " + arr[i] + " i=" + i + "  j=" + j + " \n");
                    System.out.print("\n elem= " + arr[i] + "  j=" + j + " \n");
                }
            }
        }
        System.out.println("\n Sum of numbers: " + sum);
    }
}
