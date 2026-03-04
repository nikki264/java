//SetOperations.java
import java.util.*;

public class SetOperations {

    public void showSet() {

        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicate removed automatically

        System.out.println("\nHashSet Elements:");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
