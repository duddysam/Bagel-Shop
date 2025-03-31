public class Main {

    public static void main(String[] args) {
        Item i1 = new Item("latte", 2);

        System.out.println(i1);

        i1.addQuantity(3);
        System.out.println(i1);
    }
}
