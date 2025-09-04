import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean isValid;

        do {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();
            isValid = password.length() >= 8; // Example: password must be at least 8 characters
            
            if (!isValid) {
                System.out.println("Password is invalid. It must be at least 8 characters long.");
            }
        } while (!isValid);

        System.out.println("Password is valid.");
    }
}
