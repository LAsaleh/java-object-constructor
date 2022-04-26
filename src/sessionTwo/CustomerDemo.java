package sessionTwo;

public class CustomerDemo {
    public static void main(String[] args) {

        Customer myCustomer = new Customer("AYLLA SALEH", "123 MAIN STREET", 2000);

        myCustomer.withDraw(800);
        myCustomer.customerInfo();
        myCustomer.depositCheck("$1200.00 pay for aylla saleh".toUpperCase());
        myCustomer.customerInfo();
        myCustomer.depositCash(1100.00);
        myCustomer.customerInfo();
        myCustomer.withDraw(-3600);
        myCustomer.customerInfo();




    }

}
