import java.util.Random;
public class Main2 {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();
        System.out.print("Massiv default: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Massiv reverse: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}