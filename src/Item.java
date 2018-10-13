/**
 * Class represents an item that can be used in the crafting process
 *
 * @author Tobias Fetzer
 * @version 1.0
 * @date 13.10.2018
 *
 */
public class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
