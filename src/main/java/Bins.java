import java.util.ArrayList;
import java.util.HashMap;

public class Bins {

    int low;
    int high;

    public Bins(int low, int high) {
        this.low = low;
        this.high = high;
    }

    static HashMap<Integer, Integer> binMap = new HashMap<Integer, Integer>();

    //creates Bins and puts them into a hashmap with (Key: low ++ until high )(Value: occurrences from dice rolled)
    public void createBins() {
        for (int i = low; i <= high; i++) {
            int temp = low++;
            binMap.put(temp,0);
        }
//        System.out.println(binMap);
    }

    public void incrementBin(int key){
        binMap.get(key);
        binMap.put(key, binMap.get(key) + 1);
    }

    public int getBin(int key){
        return binMap.get(key);
    }
}
