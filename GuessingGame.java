import java.util.Scanner;
public class GuessingGame {
    int random;
    GuessingGame(){
        random = (int) Math.ceil(Math.random()*100);
    }
    /**
     * Guessnumber the number that player guessed
     * @return
     * - Negative if the guess number is smaller 
     * - 0 if the gussed number is correct
     * - 1 if the guessed number is positive
     */
    int guess(int gussNumber){
        return gussNumber -random;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Wlecome to the Guessing Game, Guess the number between 1 to 100");
        int guess=0;
        int result;
        do{
            System.out.print("Guess the number:: ");
            guess =sc.nextInt();
            result = game.guess(guess);
            if(result == 0){
                System.out.println("Congrats, your guess is correct");
            }else if(result<0){
                System.out.println("Please guss higher");
            }else{
                System.out.println("Please guess lower");
            }
        }while(result !=0);
    }
    
}
