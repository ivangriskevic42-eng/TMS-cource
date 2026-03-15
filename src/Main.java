public class Main {
    public static void main(String[] args){
        int[]array=new int[]{1,45,34,-56,3,-4,-5};
        System.out.print("Massiv default: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("Massiv reverse: ");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }


    }
}