import java.util.Scanner;
public class Search2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Search 2D Array");
        int[][] arr =ArrayUtility.input2DArray();
        System.out.println("======================================");
        System.out.print("Now enter the number you want to search::");
        int x = sc.nextInt();
        System.out.println("======================================");
        boolean isFound = search(arr,x);
        if(isFound){
            System.out.println("Your number has been found");
        }else {
            System.out.println("Your number has NOT been found");
        }

    }
    public static boolean search(int[][] arr,int x){
        int i=0;

        while(i< arr.length){
            int j=0;
            while(j< arr[i].length){
                if(arr[i][j]==x){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
//632246