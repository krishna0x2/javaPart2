public class IsPalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome array checker");
        int[] arr = ArrayUtility.inputArray();
        boolean isPalindromeArray = isPalindromeArray(arr);
        if(isPalindromeArray){
            System.out.println("The array is palindrome array");
        }else {
            System.out.println("The array is not palindrome array");
        }
    }
    public static boolean isPalindromeArray(int[] arr){
        int i=0;
        while(i<arr.length/2){
            if(arr[i] != arr[arr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
