package sessionFour;


import java.util.Arrays;

public class ChocolateBar {
    private final String brand = "Techcenture";
    private String type;
    private String netWeight;
    private final String manufacturedIn = "123 Chocolate Drive, Mclean, VA, 22102";
    private final String manufacturedBy = "Techcenture Chocos Inc on a class level";
    private String barCode;
    private String bestBefore;
    private String direction;
    private String unitPrice;
    private String keepCool;
    private short totalFat;
    private short cholesterol;
    private int sodium;
    private int vitaminD;
    private int calcium;
    private int totalCarbohydrates;
    private int numberOfCalories;
    private int totalSugar;
    private int protein;
    private String servingSize;
    private String[] ingredients;


    public ChocolateBar(String type, String netWeight, String barCode, String bestBefore, String direction, String unitPrice, String keepCool, short totalFat, short cholesterol, int sodium, int vitaminD,
                        int calcium, int totalCarbohydrates, int numberOfCalories, int totalSugar, int protein, String servingSize, String[] ingredients) {
        this.type = type;
        this.netWeight = netWeight;
        this.barCode = barCode;
        this.bestBefore = bestBefore;
        this.direction = direction;
        this.unitPrice = unitPrice;
        this.keepCool = keepCool;
        this.totalFat = totalFat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.vitaminD = vitaminD;
        this.calcium = calcium;
        this.totalCarbohydrates = totalCarbohydrates;
        this.numberOfCalories = numberOfCalories;
        this.totalSugar = totalSugar;
        this.protein = protein;
        this.servingSize = servingSize;
        this.ingredients = ingredients;
    }

    public ChocolateBar(){

    }


    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    public String getManufacturedIn() {
        return manufacturedIn;
    }

    public String getManufacturedBy() {
        return manufacturedBy;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(String bestBefore) {
        this.bestBefore = bestBefore;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getKeepCool() {
        return keepCool;
    }

    public void setKeepCool(String keepCool) {
        this.keepCool = keepCool;
    }

    public short getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(short totalFat) {
        this.totalFat = totalFat;
    }

    public short getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(short cholesterol) {
        this.cholesterol = cholesterol;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getVitamin() {
        return vitaminD;
    }

    public void setVitamin(int vitamin) {
        this.vitaminD = vitamin;
    }

    public int getCalcium() {
        return calcium;
    }

    public void setCalcium(int calcium) {
        this.calcium = calcium;
    }

    public int getTotalCarbohydrates() {
        return totalCarbohydrates;
    }

    public void setTotalCarbohydrates(int totalCarbohydrates) {
        this.totalCarbohydrates = totalCarbohydrates;
    }

    public int getNumberOfCalories() {
        return numberOfCalories;
    }

    public void setNumberOfCalories(int numberOfCalories) {
        this.numberOfCalories = numberOfCalories;
    }

    public int getTotalSugar() {
        return totalSugar;
    }

    public void setTotalSugar(int totalSugar) {
        this.totalSugar = totalSugar;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public String getServingSize() {
        return servingSize;
    }

    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "-------------------------------- Nutrition Facts ------------------------------ " +
                " ServingSize: " + servingSize + "\n" +
                " Calories:  " + numberOfCalories + "\n" +
                " TotalFat: " + totalFat + "\n" +
                " Cholesterol: " + cholesterol + "\n"+
                " Sodium: " + sodium + "\n" +
                " Vitamin D: " + vitaminD + "\n" +
                " Calcium: " + calcium + "\n" +
                " Carbohydrates: " + totalCarbohydrates + "\n" +
                " TotalSugar: " + totalSugar + "\n" +
                " Protein: " + protein + "\n" +
                "\n" +
                " Ingredients: " + Arrays.toString(ingredients).replace("{", " ").replace("}", " ").toUpperCase() + "\n" +
                "\n" +
                "\n" +
                "May contain tree nuts" + "\n" +
                "\n" +
                "Manufactured by: " + manufacturedBy + manufacturedIn + "\n" +
                " Best before: " + bestBefore + "\n" +
                " BarCode: " + barCode + '\n' +
                " KeepCool: " + keepCool + '\n' ;

    }
}




// 1. Techcenture Academy is building a chocolate factory which is expected to be the largest chocolate distributor across the United States.
//         However, in order to capture the hearts of millions and millions of chocolate lovers, we need to manufacture high quality and exceptional
//         chocolate bars which will compete in the chocolate industry.
//
//         In order to manufacture these chocolate bars, the company deploys high-end AI equipment to produce the chocolate bars in relatively short
//         period of time (1-3 days usually) so that we can distribute the products as quickly as possible to major wholesale stores. This AI machine was
//         written in Java, so it only understands the Java syntax. The only problem is that this AI machine cannot produce the chocolate bars on its own; it needs a
//         blueprint (Java Class) to produce the millions of chocolate bars (i.e Objects). In the past few weeks, the company spent over 3 million dollars in Research
//         and Development to develop the finest and efficient Java Classes but unfortunately, the results were disappointing.
//
//         Therefore, Techcenture Academy's LAST HOPE is Batch 6 for the most efficient and promising Java Class Blueprint, so we can revolutionize the taste of chocolate
//         and show our competitor what a real chocolate bar should be like!
//
//         Here is your requirement:
//         Design a Java class called Chocolate Bar. You should have the following class properties:
//
//        brand: brand is final and set to TechChocos
//        type: currently we have these types: Milk Hazelnut Classic, Dark Hazelnut Classic, OatMilk Classic, White Chocolate Classic, Cookie & Creme Classic
//        net weight: e.g 4.4 OZ
//        manufactured in: all chocolate bars are manufacture in 123 Chocolate Drive, Mclean, VA, 22102
//        manufactured by: must be set to Techcenture Chocos Inc on a class level
//       bar code
//               best before: e.g 09-30-2022
//        directions: a short direction on how to best consume it
//        unit price
//        keep cool: integer in Fahrenheit
//
//        total fat: %
//        cholesterol: %
//        sodium: %
//        vitamin D: %
//        calcium: %
//        total carbohydrates: %
//        number of calories
//        total sugar: in grams
//        protein: in grams
//        serving size: in pieces or grams
//        ingredients: must be a String array which contains multiple ingredients like sugar, cocoa, butter, hazelnuts etc
//
//        Constructors:
//        You should have 2 constructor, a no-args and an all-args constructor. No need to include brand, manufactured in, manufactured by since they are final and set on a class level.
//
//        Getters and Setters
//        Encapsulate all properties and generate getters and setters
//
//        Every consumer wants to be able to see the nutrition facts on a chocolate bar. To do that, implement the toString() method in your class and return a meaningful nutrition
//        facts as well as additional information about the chocolate bar and company.
//        Apart from the nutrition facts, you can return the following property fields in your toString method. Here is an example:
//
//        ---------------------------------------------------------------------------------------------------------------------------
//        NUTRITION FACTS
//        SERVING SIZE        7 Pcs
//        CALORIES              160
//        TOTAL FAT             13%
//        CHOLESTEROL            2%
//        SODIUM                 1%
//        TOTAL CARBOHYDRATES    5%
//        PROTEIN                3g
//        TOTAL SUGARS          14g
//        VITAMIN D              7%
//        CALCIUM                2%
//
//        INGREDIENT: Sugar, cocoa butter, hazelnuts, milk, chocolate, skim milk, soy lecithin, barley mold powder, artificial flavor.
//
//        May contain tree nuts
//
//        Manufactured by TechChocos Inc, 123 Chocolate Drive, Mclean, VA, 22102
//
//        Best Before: 09-30-2022
//
//        Bar Code: 0 030455 3454 9
//
//        Keep cool (60-68F) and dry
//        ---------------------------------------------------------------------------------------------------------------------------
//
//        Note:
//        1. Ingredients are in array, so think how you can print the contents of it in the toString method.
//        2. Please do not copy and paste the above toString implementation, rather you should create an object and pass the values to your constructor and
//        your toString method should read from the class variables.