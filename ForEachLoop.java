public class ForEachLoop {
    public static void main(String[] args) {
        String[] arr =new String[]{"mohan","sohan","gita","rita","laxmi","krishna"};
        int[] array = new int[]{1,3,2,4,5,6,7,8,9};
        printNum(array);
        System.out.println();
        printNames(arr);
    }
    public static void printNames(String[] arr){
        for (String name : arr) {
            System.out.println(name);
        }
    }
    public static void printNum(int[] array){
        for(int num : array){
            System.out.print(num + " ");
        }
    }
}
