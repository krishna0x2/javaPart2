import java.util.Scanner;
public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i=0;
        while(i<size){
            System.out.println("Please enter the "+(i+1)+"th element of the array::");
            arr[i]=input.nextInt();
            i++;
        }
        return arr;
    }
}
