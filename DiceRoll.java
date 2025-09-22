public class DiceRoll {
    int roll(){
        double random = Math.random()*6;
        return (int) Math.ceil(random);
    }
    public static void main(String[] args) {
        DiceRoll dice =  new DiceRoll();
        System.out.println(dice.roll());
        // if we use 10 times dice roll
        System.out.println("Here rolling dice 10 times");
        for(int i=0;i<=10;i++){
            System.out.println(dice.roll());
        }
    }
    
}
