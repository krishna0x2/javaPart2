import java.util.Scanner;
public class OccurencesForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter the size of array::");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<arr.length;i++){
            System.out.print("enter "+i+" position number:: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Now enter that Number which find Occurences :: ");
        int number = sc.nextInt();
        System.out.println("the occuerences is :: "+findOccurens(arr, number));
    }
    public static int findOccurens(int[] arr,int number){
        int count =0;
        for(int num : arr){
            if(num == number){
                count ++;
            }
        }
        return count;
    }
}
