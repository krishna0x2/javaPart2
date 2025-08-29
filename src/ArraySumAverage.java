import java.util.Scanner;
public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wwelcome to Array Sum Average");
        int [] arr =ArrayUtility.inputArray();
        long sum= sum(arr);
        int avg = average(arr);
        System.out.println("The average is "+avg);
        System.out.println("The sum is "+sum);
    }
    public static long sum(int[] arr){
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return  sum;
    }
    public static int average(int[] arr){
        long sum = sum(arr);
        return (int)(sum / arr.length);
    }
    // adding more content for the git course practics
    //in this time we checked the command for the "git config --global core.editor "code --wait"

}
