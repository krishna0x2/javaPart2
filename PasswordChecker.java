import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        boolean isValid;

        do {
            System.out.print("Enter your password: ");
            password = sc.next();
           // isValid = password.length() >= 8; // Example: password must be at least 8 characters
            
            if (!isValidPassword(password)) {
                System.out.println("Password is invalid. It must be at least 8 characters long.");
            }
        } while (!isValidPassword(password));

        System.out.println("Password is valid.");
    }
    public static boolean isValidPassword(String password) {
        return password.length() >= 8; // Example: password must be at least 8 characters
    }
}
