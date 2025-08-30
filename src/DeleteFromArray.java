import java.util.Scanner;
public class DeleteFromArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Delete from Array");
        int [] arr =ArrayUtility.inputArray();
        System.out.printf("The number you want to delete from the array ::");
        int numberToDelete = sc.nextInt();
        int[] newArr = deleteNum(arr,numberToDelete);
        System.out.println("Here is the your array");
        ArrayUtility.displayArray(newArr);

    }
    public static int[] deleteNum(int[] arr,int numberToDelete){
        int occ = OccurrencesArray.occurences(arr,numberToDelete);
        if(occ==0){
            return arr;
        }
        int newSize = arr.length-occ;
        int[] newArr = new int[newSize];

        int i=0, j=0;
        while(i<newArr.length){
            if(arr[i]!=numberToDelete){
                newArr[j]=arr[i];
                j++;
            }
            i++;
        }

        return newArr ;
    }
    // soem thing went wrong this program
    // check another time why occure the last element always zero in new arr

}
