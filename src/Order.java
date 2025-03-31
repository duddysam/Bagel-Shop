public class Order {

    //attributes
    public static int GlobalId = 0;
    // TODO: fix the line below (just need a constructor probably?)
    //private final int id;
    private DirectTo directTo;
    private boolean paid;
    private double price;
    private ListImpl<Item>items;
    // this is for the strategy design pattern
    private PaymentType paymentType;


}
