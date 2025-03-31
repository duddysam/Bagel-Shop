public class Order {

    //attributes
    public static int GlobalId = 0;
    private final int id;
    private boolean paid;
    private double price;
    private ListImpl<Item>items = new ListImpl<>();

    // this is for the strategy design pattern (or command?)
    private PaymentType paymentType;

    // constructor
    public Order(Item item, PaymentType paymentType) {
        id = ++GlobalId;
        // TODO: add item to items list
        this.paid = false;
        this.price = item.getPrice();
        this.paymentType = paymentType;
    }

    // getters
    public int getId() {
        return id;
    }


}
