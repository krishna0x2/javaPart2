import java.util.Scanner;
public class PalindromeUsingRecursion {
    public static void main(String[] args) {
        System.out.println("wlecome to checker of a sting is palindrome or not ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Stinng for checking the palindrome:: ");
        String st = sc.nextLine();

        System.out.println("your string is "+((IsPalindromeString(st)) ? "Palindrome":"Not Palindrome"));
    }
    public static boolean IsPalindromeString(String name){
        if(name.length()<=1){
            return true;
        }
        int lastpos = name.length()-1;
        if(name.charAt(0) != name.charAt(lastpos)){
            return false;
        }
        String newStr = name.substring(1, lastpos);

        return IsPalindromeString(newStr); //  use newStr for recursion
    }
}
