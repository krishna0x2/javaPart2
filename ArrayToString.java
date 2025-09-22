import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{"this", "is", "a best", "course", "for students", "who want" ,"to learn", "core java", "concept."};
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);

        //if you want to take word by user input and make sentance
        System.out.print("Please Enter Number of word which is used to making the sentences:: ");
        int size = sc.nextInt();
        String[] arr2 = new String[size];
        for(int i=0;i<arr2.length;i++){
            System.out.print("Now enter the "+(i+1)+" position word::");
            arr[i]=sc.next();
        }
        // here stringbuilder has something is missing
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : arr2) {
            sb.append(str2).append(" ");
        }
        System.out.println(sb2);
    }
    
}
