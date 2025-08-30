public class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to array sorting check post\n");
        int [] arr =ArrayUtility.inputArray();
        boolean incre = isIncreasing(arr);
        boolean dec = isdecreasing(arr);
        if (incre || dec) {
            System.out.println(" the array is sorted ");
        }else{
            System.out.println(" the array is not sorted ");
        }

    }
    public static boolean isIncreasing(int[] arr) {
        int i=1;
        while(i<arr.length){
            if(arr[i]<arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isdecreasing(int[] arr) {
        int i=1;
        while(i<arr.length){
            if(arr[i]>arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
