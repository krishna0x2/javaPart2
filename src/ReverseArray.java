public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to reverse array");
        int[] arr=ArrayUtility.inputArray();
        reverse(arr);
        System.out.println("your reversed array is:");
        ArrayUtility.displayArray(arr);
    }
    public static void reverse(int[] arr){
        int i=0;
        while(i<arr.length/2){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
            i++;
        }
    }
}
