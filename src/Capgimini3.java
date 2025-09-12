import java.util.HashMap;
import java.util.Map;

public class Capgimini3 {


    public static void main(String[] args) {
        int[] arr = {1,1,2,5,1,4,3};
        Map<Integer,Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }

    }
}
