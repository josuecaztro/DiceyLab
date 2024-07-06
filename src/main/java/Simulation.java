import java.sql.SQLOutput;

public class Simulation {

    int numberOfDice;
    int numberOfTosses;

    public Simulation (int numberOfDice, int numberOfTosses){
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
    }

    //First create bins.
    //Then, loop through number of tosses...
    //...and store the "sum" we return in each toss into result variable
    //then we incrementBin(result) so everytime it's adding to the corresponding bin
    public void runSimulation(){
        Dice dice = new Dice(numberOfDice);
        Bins bin = new Bins(numberOfDice, (numberOfDice * 6));
        bin.createBins();
        for (int i = 0; i < numberOfTosses; i++){
            int result = dice.tossAndSum();
//            System.out.println("Increment number >>>" + (i + 1));
            bin.incrementBin(result);
        }
    }

    public void printResults (){
        Bins bin = new Bins(numberOfDice, (numberOfDice * 6));
        System.out.println("***");
        System.out.println("Simulation of " + numberOfDice + " dice tossed for " + numberOfTosses + " times.");
        System.out.println("***");
        System.out.println();

        for (int i : bin.binMap.keySet()){
            float ratio = (bin.binMap.get(i) / (float)numberOfTosses);
            int starNumber = (int) (ratio * 100);
            String stars = "*".repeat(starNumber);
            //3d formats i, 8d formats binmapgeti, .2f formats ratio to proper decimal, %n is for new line
            System.out.format("%3d : %8d : %.2f %s %n",i,bin.binMap.get(i),ratio,stars);
        }

    }

    public static void main(String[] args){
        Simulation simulation = new Simulation(2,1000000);

        simulation.runSimulation();
        simulation.printResults();
    }

}
