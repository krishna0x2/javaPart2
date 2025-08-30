import java.util.Scanner;
public class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("wlecome to array occurences in the array");
        int [] arr =ArrayUtility.inputArray();
        System.out.println("==========================================");
        System.out.print("Now enter the number you want to find::");
        int number = input.nextInt();
        System.out.println("==========================================");
        System.out.println("the no of the couurences " +number+" is ::"+occurences(arr,number));
    }
    public static int occurences(int [] arr,int number){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                count++;
            }
        }
        return  count;
    }
}
