import java.util.Random;
public class Main7 {
    public static void main(String[] args) {
        int[] array = new int[3];
        int a=0;
        Random random = new Random();
        System.out.print("Massiv : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
            }
        for(int i=0;i<array.length-1;i++){
           if(array[i+1]>array[i]){
            a++;
           }
        }
        if(a==array.length-1){
            System.out.println("Является возрастающей последовательностью");
        }
        else {
            System.out.println("Не является возрастающей последовательностью");
        }
    }

}
