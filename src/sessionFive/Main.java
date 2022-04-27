package sessionFive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO PHONE FACTORY");
        System.out.println("HOW KIND OF PHONE WOULD YOU LIKE US TO BUILD? ");
        System.out.println("samsung | iphone");

        String option = scanner.nextLine().toLowerCase();

        switch( option ){
            case "samsung":
                System.out.println("MODEL: ");
                String model = scanner.nextLine();

                System.out.println("brand: ");
                String brand = scanner.nextLine();

                System.out.println("touch screen? (true/false) ");
                boolean touchScreen = scanner.nextBoolean();


                System.out.println("capasity: ");
                int capasity = scanner.nextInt();



                System.out.println("5g : (true/false) ");
                boolean is5G = scanner.nextBoolean();
                scanner.nextLine();

                System.out.println("os: ");
                String os = scanner.nextLine();

                Samsung samsung = new Samsung(model, brand, touchScreen, capasity, is5G, os );
                System.out.println("YOUR PHONE IS READY");

                System.out.println(samsung);
                break;


            case "iphone":

                break;


            default:
                System.out.println("valid phone type");

        }


    }
}
