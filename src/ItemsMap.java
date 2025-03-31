import java.util.HashMap;
import java.util.Map;

public class ItemsMap {

    static final Map<String, Double> items = new HashMap<>();

    static {
        items.put("Test1", 10.0);
        items.put("Test2", 5.0);
        items.put("cream cheese bagel", 4.59);
        items.put("latte", 4.99);
        items.put("basic breakfast sandwich", 7.99);
    }
}
