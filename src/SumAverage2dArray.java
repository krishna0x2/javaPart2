
public class SumAverage2dArray {
    public static void main(String[] args) {
        System.out.println(" Welcome to Sum Average 2D Array \n");
        int[][] arr = ArrayUtility.input2DArray();
        long ArrSum = sum2DArray(arr);
        double avg = average(arr);
        System.out.println("the sum of Array element is::"+ArrSum);
        System.out.print("the average of Array element is::"+avg);




    }
    public static long sum2DArray(int[][] arr){
        int i=0;
        int sum=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                sum+=arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double average(int[][] arr){
        if(arr==null||arr.length==0){
            return 0;
        }
        int row=arr.length;
        int col=arr[0].length;
        double size=row*col;
        return sum2DArray(arr)/size;
    }
}
