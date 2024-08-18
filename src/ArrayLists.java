import java.util.ArrayList;

// carrier klass, RECORD. Vårt record kommer representera ett Item
// Item kommer har inparametrarna: name, type, count
record Item(String name, String type, int count) {
    // constructor
    public Item(String name) {
        this(name, "DAIRY", 1);
    }
}
public class ArrayLists {
    public static void main(String[] args) {
        Object[] shoppingArray = new Object[3];
        shoppingArray[0] = new Item("milk");
        shoppingArray[1] = new Item("tomatoes", "VEGETABLES", 2);
        shoppingArray[2] = "2 apples";

        //System.out.println(Arrays.toString(shoppingArray));

        Item[] shopArray = new Item[3];
        shopArray[0] = new Item("milk");
        shopArray[1] = new Item("tomatoes", "VEGETABLES", 2);
        //shopArray[2] = "2 apples";
        // här blir det ett fel, förväntar sig en array av bara Items och vi angav sträng
        shopArray[2] = new Item("apples", "FRUIT", 3);

        //System.out.println(Arrays.toString(shopArray));

        // LIST
        ArrayList itemList = new ArrayList();
        itemList.add(new Item("Bregott"));
        itemList.add("Grädde hejhej");

        ArrayList<Item> shopItemList = new ArrayList<>();
        shopItemList.add(new Item("Bregott"));
        //shopItemList.add("Grädde hejhej");
    }
}
