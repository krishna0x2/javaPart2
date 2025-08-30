public class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Welcome to max and min no In the Array");
        int [] arr =ArrayUtility.inputArray();
        System.out.println("Maximum no is:"+max(arr));
        System.out.println("Minimum no is:"+min(arr));

    }
    public static int max(int[] arr){
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        int max=arr[0];
        int i=1;
        while(i<arr.length){
            if(arr[i]>max){
                max=arr[i];
            }
            i++;
        }

        return max;
    }
    public static int min(int[] arr){

        int min=Integer.MAX_VALUE;
        int i=0;
        while(i<arr.length){
            if(arr[i]<min){
                min=arr[i];
            }
            i++;
        }
        return min;
    }
}
