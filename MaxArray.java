import java.util.Scanner;
public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = MaxArray.findMax(numbers);
        System.out.println("The maximum value in the array is: " + max);
    }
    public static int findMax(int[] numbers){
        int max = numbers[0];
        for (int num : numbers) {
            max = (num > max) ? num : max;
        }
        return max;
    }
    
}
