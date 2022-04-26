package sessionTwo;

public class Customer {

    String fullName;
    String address;
    double balance;


    public Customer(String fullName, String address, double balance ){
        this.fullName = fullName;
        this.address = address;
        this.balance = balance;

    }
    public Customer(){

    }

    public void depositCash(double cashAmount){
        System.out.println("SYSTEM PROCESSING...... ");
        if(cashAmount < 0){
            System.out.println("A VALID NUMBER");
        }else {
        balance = balance + cashAmount;
            System.out.println("PROCESS SUCCESSFUL ");
    }
    }

    public void depositCheck(String check) {
        //$1200.00 for jack smith
        System.out.println("SYSTEM PROCESSING .......");
        String[] splitCheck = check.split(" ");
        String amount = "";

        for (int i = 0; i < splitCheck.length; i++) {
            if (splitCheck[i].startsWith("$")) {
                amount = splitCheck[i];
            }
        }
        String amountStr = amount.replace("$", " ");
        double amountDouble = Double.parseDouble(amountStr);

        if (amountDouble < 0) {
            System.out.println("INVALID AMOUNT");
            return;

        } else {
            System.out.println("DEPOSIT SUCCESSFUL");
            balance = balance + amountDouble;
        }
    }

    public void withDraw(double withDrawAmount){
        if(withDrawAmount > balance  ){
            System.out.println("INVALID NUMBER");
            return;

        }else if (withDrawAmount < 0 ) {
            System.out.println("INVALID NUMBER ");
            return;

        }else {
            System.out.println("SYSTEM PROCESSING ....... ");

        balance = balance - withDrawAmount;
            System.out.println("PROCESS SUCCESSFUL ");
    }
    }


    public void customerInfo() {
        System.out.println("\n-------------------- customer info ----------------------- ");
        System.out.println("FULLNAME: " + fullName);
        System.out.println("ADDRESS: " + address);
        System.out.println("BALANCE: " + balance);
        System.out.println("\n");


}
}