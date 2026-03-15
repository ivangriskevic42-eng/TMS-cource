/**
 * Grishkevich Ivan
 */
import java.util.Random;
public class Main5 {
    public static void main(String[] args) {
        int[] array = new int[8];
        int max=array[0];
        int Kolvonuley=0;
        Random random = new Random();
        System.out.print("Massiv : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
            if (array[i]==0){Kolvonuley++;
            }

        }
        System.out.println();
        if(Kolvonuley>=1){
            System.out.println("Kolichestvo nuley = "+Kolvonuley);
        }
        else{
            System.out.println("Net nuley");
        }

    }
}


