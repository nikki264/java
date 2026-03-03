// ListOperations.java
import java.util.*;

public class ListOperations2 {

    public void showList() {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");

        System.out.println("ArrayList Elements:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
