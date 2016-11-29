import java.util.HashMap;
import java.util.Map;

// Exercise 3
// Find the intersection of two given HashMaps that
// share the same keys and return it in a new Hashmap.

public class ds-ex3 {

    public static void main(String[] args) {

    	Map<Integer,String> mapA = new HashMap<>();
    	mapA.put(1, "Manolis");
    	mapA.put(2, "Anastasia");
    	mapA.put(3, "Lila");
    	mapA.put(4, "Charis");

    	Map<Integer,String> mapB = new HashMap<>();
    	mapB.put(5, "Manolis");
    	mapB.put(1, "Dimitris");
    	mapB.put(4, "Lila");
    	mapB.put(3, "Foteini");

    	Map<Integer,String> mapC = new HashMap<>();

    	for (Map.Entry<Integer, String> entryA : mapA.entrySet()) {
    	    Integer keyA = entryA.getKey();

    	    for (Map.Entry<Integer, String> entryB : mapB.entrySet()) {
        	    Integer keyB = entryB.getKey();
        	    String valueB = entryB.getValue();

        	    if (keyA == keyB) {
        	    	mapC.put(keyA, valueB);
        	    }
    	    }
    	}

    	for (Integer key : mapC.keySet()) {
    		System.out.println(mapC.get(key));
    	}

    }
}
