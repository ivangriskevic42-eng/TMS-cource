import java.util.Random;
public class Main3 {
    public static void main(String[] args) {
        int[] array = new int[8];
        int max=array[0];

        Random random = new Random();
        System.out.print("Massiv : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }

     }
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Max= "+max);
        System.out.println("Min= "+min);

    }
}