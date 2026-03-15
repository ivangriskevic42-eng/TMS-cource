/**
 * Grishkevich Ivan
 */
import java.util.Random;

public class Main8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[8];
        System.out.print("Исходный: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10); // 0-9
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                break;
            }
            arr[i] = 0;
        }
        System.out.print("После +1: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        boolean allZeros = true;
        for (int num : arr) {
            if (num != 0) {
                allZeros = false;
                break;
            }
        }

        if (allZeros) {
            System.out.println("Были все 9! Нужен массив: [1,0,0,0,0,0,0]");
        }
    }
}