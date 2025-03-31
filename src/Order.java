public class Order {

    //attributes
    public static int GlobalId = 0;
    private final int id;
    private DirectTo directTo;
    private boolean paid;
    private double price;
    private ListImpl<Item>items;
    // this is for the strategy design pattern
    private PaymentType paymentType;


}
