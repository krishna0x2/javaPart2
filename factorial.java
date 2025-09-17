import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.println("Wlecome to Factorial Program");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        
        System.out.println("The factorial of " + num + " is: " + calculateFactorial(num));
    }
    public static int calculateFactorial(int num) {
        if(num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1; // Indicate an error
        }
        if(num == 0) {
            return 1; // 0! is 1
        }
        return (num <= 1) ? 1 : num * calculateFactorial(num - 1);
    }
}
