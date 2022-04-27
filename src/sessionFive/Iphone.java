package sessionFive;

public class Iphone extends Phone{

    private String color;
    private boolean isNew;


    public Iphone(String model, String brand, boolean is5G, int capacity,String color, boolean isNew) {
        super(model, brand, is5G, capacity);
        this.color = color;
        this.isNew = isNew;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public void sendMessage(String message, String number) {
        super.sendMessage(message, number);
    }

    @Override
    public void call(String number) {
        super.call(number);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "color='" + color + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}
