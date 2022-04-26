package sessionThree;

//import java.text.DecimalFormat;
//
//public class DebitCard {
//    public static final String SECURITY_CODE_MUST_BE_3_OR_4_DIGITS = "SECURITY CODE MUST BE 3 OR 4 DIGITS ";
//    private String nameOnCard;
//    private String cardNumber;
//    private String securityCode;
//    private String bankName;
//    private String validThru;
//    private double balance;
//    private double overDraftLimit;
//    DecimalFormat format = new DecimalFormat("0.00");
//
//    public DebitCard(String nameOnCard, String cardNumber, String securityCode, String bankName,
//                     String validThru, double balance, double overDraftLimit) {
//        this.nameOnCard = nameOnCard;
//
//        if (String.valueOf(cardNumber).length() == 16) {
//
//            this.cardNumber = cardNumber;
//            return;
//
//        } else {
//            throw new IllegalArgumentException("CARD NUMBER CAN'T BE LESS OR GREATER THAN 16 DIGITS ...");
//        }
//
////
////        if (String.valueOf(securityCode).length() == 3 ||
////                String.valueOf(securityCode).length() == 4) {
//
////            this.securityCode = securityCode;
//
////            System.out.println("NUMBER IS ACCURATE");
////          return;
////
////        }else {
////            System.out.println("SECURITY CODE MUST BE 3 OR 4 DIGITS");
////        }
//
//
//        this.bankName = bankName;
//        this.validThru = validThru;
//        this.balance = Double.parseDouble(format.format((Math.random() * 500) + 100));
//        this.overDraftLimit = overDraftLimit;
//    }
//
//    public DebitCard() {
//
//    }
//
//    public void printCardDrtails() {
//        System.out.println("\n---------------------- CARD DETAILS -------------------");
//        System.out.println("NAME ON CARD: " + nameOnCard.toUpperCase());
//        System.out.println("CARD NUMBER: " + cardNumber);
//        System.out.println("SECURITY CODE: " + securityCode);
//        System.out.println("BANK NAME: " + bankName.toUpperCase());
//        System.out.println("BALANCE: " + balance);
//        System.out.println("OVER DRAFT LIMIT: " + overDraftLimit);
//        System.out.println("\n");
//
//    }
//
//
//    public String getNameOnCard() {
//        return nameOnCard;
//    }
//
//    public void setNameOnCard(String nameOnCard) {
//        this.nameOnCard = nameOnCard;
//    }
//
//    public String getCardNumber() {
//        return cardNumber;
//    }
//
//    public String getSecurityCode() {
//        return securityCode;
//    }
//
//    public String getBankName() {
//        return bankName;
//    }
//
//    public void setBankName(String bankName) {
//        this.bankName = bankName;
//    }
//
//    public String getValidThru() {
//        return validThru;
//    }
//
//    public void setValidThru(String validThru) {
//        this.validThru = validThru;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public double getOverDraftLimit() {
//        return overDraftLimit;
//    }
//
//    public void getCash(double cashAmount) {
//        if (cashAmount < 0) {
//            System.out.println("A valid amount ");
//            return;
//        }
//            if (cashAmount - balance < overDraftLimit) {
//                System.out.println("EXCEED THE BALANCE ");
//                return;
//
//            }else {
//                balance = balance - cashAmount;
//                System.out.println("SUCCESSFUL");
//
//
//            }
//        }
//
//
//            public void depositCheck (String check){
//                String[] spilt = check.split(" ");
//                String s = spilt[spilt.length-1];
//                String replace = s.replace("$", "");
//                double parseDouble = Double.parseDouble(replace);
//                if(parseDouble < 0) {
//                    System.out.println("INVALID AMOUNT.. ");
//                }else{
//                balance = balance + parseDouble;
//                    System.out.println("PROCESS SUCCESSFUL ");
//
//
//            }
//
//
//
//        }
//
//        public void cashDeposit(double cashAmount){
//        balance = balance + cashAmount;
//            System.out.println("CASH AMOUNT SUCCESSFUL ");
//    }
//
//    public void changeName(String name){
//        if (name.length() < 5 ){
//            System.out.println("NUMBER OF CHARS MUST BE MORE THAN 5 CHARS.... ");
//            return;
//    }else {
//            System.out.println("name on card: " + name);
//}
//    }
//}
//
//









//        changeNameOnCard(String name): this method will take a String argument called name, and it should replace the CardHolder Name on the Card. But before you change the
//        name of CardHolder make sure the new name argument has at least 5 characters (Hint: Use String methods to validate)
//
