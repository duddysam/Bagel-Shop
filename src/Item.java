public class Item {


    // TODO: need way of automatically setting whether an order is drinks, takeout, etc..
    // attributes
    private double price;
    private String name;
    private int quantity;
    private DirectTo directTo;

    // constructor
    // TODO: throw exception if name does not match?? Not realistic since it will be generated from pre-set button
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        setPrice(name, quantity);
        setDirectTo(name);
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
    public DirectTo getDirectTo() {
        return directTo;
    }

    // methods
    private void setPrice(String name, int quantity) {
        this.price = ItemsMap.items.get(name) * quantity;
    }

    private void setDirectTo(String name){
        this.directTo = ItemsMap.directTo.get(name);
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
        setPrice(name, getQuantity());
    }

    @Override
    public String toString() {
        return getDirectTo() + "\n" + getQuantity() + " x " + getName() + ": $" + String.format("%.2f", getPrice());
    }



}
