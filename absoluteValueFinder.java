public class absoluteValueFinder {
    
    public static void main(String[] args) {
        int number = -10;
        int absValue = (number < 0) ? -number : number;
        System.out.println("The absolute value is: " + absValue);
    }
}
