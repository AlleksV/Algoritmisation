import java.util.Random;

public class TaskEight {
    public static void main(String[] args) {
        System.out.println("Дана последовательность целых чисел a1,a2 ,an . Образовать новую последовательность, " +
                "выбросив из исходной те члены, которые равны min(a1,a2,...an)");
        Random rnd = new Random();
        int[] arr1 = new int[20];
        int min = 0;
        int count1 = 0;
        int count2 = 0;
        System.out.println("Array 1 with " + arr1.length + " elements: ");
        for (int i = 0; i < arr1.length; i++) {
            int numb = rnd.nextInt(10) - 5;
            arr1[i] = numb;
            System.out.print(arr1[i] + ", ");
            //define the min element
            if (min >= arr1[i]) {
                min = arr1[i];
                count1++;
            }
        }
        //find the amount of min elements
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[count1] == arr1[i]) {
                count2++;
            }
        }
        System.out.println("\nMin element: " + min);
        int arr_size = arr1.length - count2;
        System.out.println("Array 2 with " + arr_size + " elements:");
        int[] arr2 = new int[arr_size];
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] == min){
                arr2[i] = arr1[i+1];
            }
            else {
                arr2[i] = arr1[i];
            }
            System.out.print(arr2[i] + ", ");
        }
    }
}
