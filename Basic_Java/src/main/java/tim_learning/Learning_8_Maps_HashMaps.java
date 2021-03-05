package tim_learning;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Learning_8_Maps_HashMaps {
    public static void main(String[] args) {

        Map m = new HashMap();
        m.put("key1", 1);
        m.put("key2", 2);
        System.out.println("Here is the Map: ");
        System.out.println(m);
        System.out.println("Map size is: " + m.size());

        // if if need sorted Map, in that it is recommended to use TreeMap;
        Map tree = new TreeMap();
        tree.put('b', 1);
        tree.put('a', 2);
        System.out.println("Here is the TreeMap: ");
        System.out.println(tree);


    }

}
