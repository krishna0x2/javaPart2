import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Wlecome to the Fibonacci Series program using recurtion");
        System.out.println("Please enter the number where you want to print the Fibonacci series::");
        int count = sc.nextInt();
        for(int i =1;i<=count;i++){
            System.out.print(Fibonacci(i)+" ");
        }

    }
    public static int Fibonacci(int position){  
        if(position == 1){
            return 0;
        }else if(position == 2){
            return 1;
        }
        return Fibonacci(position - 1) + Fibonacci(position -2);
    }
    
}
