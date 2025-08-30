public class DiagonalSum2DArray {

    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum 2D Array");
        int[][] arr = ArrayUtility.input2DArray();
        long sum = diagonalSum(arr);
        System.out.println("the sum of Array diagonals element is::"+sum);

    }
    public static long diagonalSum(int[][] arr){
        long leftSum = sumOfLeftDiagonal(arr);
        long rightSum = sumOfRightDiagonal(arr);
        long sum = leftSum+rightSum;
        if(arr.length % 2 != 0){
            int index = arr.length/2;
            sum -= arr[index][index];
        }

        return sum;
    }
    public static long sumOfLeftDiagonal(int[][] arr){
        long sum = 0;
        int i =0;
        while(i<arr.length){
            sum += arr[i][i];
            i++;
        }
        return sum;
    }
    public static long sumOfRightDiagonal(int[][] arr){
        long sum = 0;
        int i =0;
        while(i<arr.length){
            int col = arr.length-i-1;
            sum += arr[i][col];
            i++;
        }
        return sum;
    }
}
