package sessionFour;

import java.util.Scanner;

public class CustomerDemo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO TECHCENTURE FINANCIAL SERVICE ");

        System.out.print("PLEASE ENTER YOUR FIRST NAME ");
        String firstName = scanner.nextLine();

        System.out.print("PLEASE ENTER YOUR last NAME ");
        String lastName = scanner.nextLine();

        System.out.print("PLEASE ENTER YOUR DATE OF BIRTH ");
        String dob = scanner.nextLine();

        System.out.print("PLEASE ENTER YOUR ADDRESS ");
        String address = scanner.nextLine();

        System.out.print("ENTER AMOUNT FOR INSTALL BALANCE ");
        double balance = Double.parseDouble(scanner.nextLine());

        Customer customer = new Customer(firstName, lastName, dob, address, balance);

        System.out.println(" HERE IS OUR NEW CUSTOMER ");


        System.out.println(customer.toString());




    }
}
