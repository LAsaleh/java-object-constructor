package sessionFive;

public class Phone {
    private String model;
    private String brand;
    private boolean is5G;
    private int capacity;

    public Phone(String model, String brand, boolean is5G, int capacity) {
        this.model = model;
        this.brand = brand;
        this.is5G = is5G;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isIs5G() {
        return is5G;
    }

    public void setIs5G(boolean is5G) {
        this.is5G = is5G;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void sendMessage(String message, String number){
        System.out.println("This phone will send " + message + "to this " + number );
    }

    public void call(String number){
        System.out.println("This phone will call " + " this " + number );
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + getModel() + '\'' +
                ", brand='" + getBrand() + '\'' +

                ", capacity=" + getCapacity() +
                '}';
    }
}
