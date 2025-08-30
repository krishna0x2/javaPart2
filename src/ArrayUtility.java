import java.util.Scanner;
public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of the array::");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Please enter the "+(i+1)+"th element of the array::");
            arr[i]=input.nextInt();
            i++;
        }
        return arr;
    }

    public static void displayArray(int[] arr){
        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
    }
    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[2][2];
        System.out.print("please enter the number of rows in the array::");
        int row = input.nextInt();
        System.out.print("please enter the number of columns in the array::");
        int column = input.nextInt();
        int[][] arr2 = new int[row][column];

        int i=0;
        while(i<row){
            int j=0;
            while(j<column){
                System.out.print("Please enter the Row"+(i+1)+"th and Column "+(j+1)+"th element of the array::");
                arr2[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        return arr2;
    }
}
