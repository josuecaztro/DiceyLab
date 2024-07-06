public class Dice {

    int numOfDice;

    public Dice (int numOfDice){
        this.numOfDice = numOfDice;
    }

    public int tossAndSum (){
        int sum = 0;
        for (int i = 0; i < numOfDice; i++){
            int diceRoll = (int)(Math.random() * 6 + 1);
//            System.out.println("one dice roll: " + diceRoll);
            sum += diceRoll;
        }
//        System.out.println(sum);
        return sum;
    }

}
