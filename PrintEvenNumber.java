public class PrintEvenNumber {
    public static void main(String[] args) {
        System.out.println("Wlecome to print even number 1 to 100 using continue");
        for(int i=1; i<=100; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
