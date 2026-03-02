package collections.lab;

public class CollectionTest {

    public static void main(String[] args) {

        ListOperations listObj = new ListOperations();
        SetOperations setObj = new SetOperations();
        MapOperations mapObj = new MapOperations();

        System.out.println("----- LIST COLLECTION -----");
        listObj.displayLists();

        System.out.println("\n----- SET COLLECTION -----");
        setObj.displaySet();

        System.out.println("\n----- MAP COLLECTION -----");
        mapObj.displayMap();
    }
}
