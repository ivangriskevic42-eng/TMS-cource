import java.util.Random;
public class Main4 {
    public static void main(String[] args) {
        int[] array = new int[8];
        int max=array[0];
        int indexmax=0;

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
                indexmax=i;
            }

        }
        int min=array[0];
        int indexmin=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
                indexmin=i;
            }
        }
        System.out.println("Max= "+max);
        System.out.println("Min= "+min);
        System.out.println("indexmax= "+indexmax);
        System.out.println("indexmin="+indexmin);
        System.out.println("(Perviy element imeet index 0)");

    }
}