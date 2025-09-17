import java.util.Scanner;
public class SumPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wlecome to sum of all positive number using continue");
        System.out.print("please Enter the Size of Array:: ");
        int size = sc.nextInt();
        System.out.println("====================================================");
        int[] arr =new int[size];
        for(int i =0; i< arr.length; i++){
            System.out.print("please enter " +i+" possion of number:: ");
            arr[i]=sc.nextInt();
        }
         System.out.println("====================================================");
        System.out.println("Sum of positive number is "+AllPositiveSum(arr));
    }

    public static int AllPositiveSum(int[] arr){
        int sum=0;
        for(int num : arr){
            if(num<0){
                continue;
            }
            sum +=num;
        }
        return sum;
    }
    
}
