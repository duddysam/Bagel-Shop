public class Item {

    // attributes
    private double price;
    private String name;
    private int quantity;

    // constructor
    // TODO: throw exception if name does not match?? Not realistic since it will be generated from pre-set button
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        setPrice(name, quantity);
    }

    // getters
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getName() {
        return name;
    }

    // methods
    private void setPrice(String name, int quantity) {
        this.price = ItemsMap.items.get(name) * quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
        setPrice(name, getQuantity());
    }

    @Override
    public String toString() {
        return quantity + " x " + name + ": $" + String.format("%.2f", getPrice());
    }



}
