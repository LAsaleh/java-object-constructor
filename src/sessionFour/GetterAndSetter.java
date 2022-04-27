package sessionFour;



 class Customer {
    private String firstName;
    private String lastName;
    private String dob;
    private String address;
    private double balance;


    /**
     * this constructor hold args
     * @param firstName
     * @param lastName
     * @param dob
     * @param address
     * @param balance
     */

    public Customer(String firstName, String lastName, String dob, String address, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
        this.balance = balance;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "-----------------------Customer info -------------------------" + '\n' +
                " firstName: " + firstName + '\n' +
                " lastName: " + lastName + '\n' +
                " dob: " + dob + '\n' +
                " address: " + address + '\n' +
                " balance: " + balance +
                "" ;
    }
}