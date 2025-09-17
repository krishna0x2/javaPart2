import java.util.Scanner;
public class ExitOnExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter the Command::");
            String command =sc.nextLine();
            if(command.equals("exit") ){ // here we study about the differences between the == and .equals()
                break;                      // if we use here == then it will never be compared directly in the object
            }                           // if here also use .equalsInoreCase the we also exit on Using Uppercase later
            if(command.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("you have succefully exited.");
    }
}
