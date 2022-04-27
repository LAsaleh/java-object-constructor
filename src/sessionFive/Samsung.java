package sessionFive;

public class Samsung extends Phone{


    private boolean isTouch;
    private String os;

    public Samsung(String model, String brand, boolean is5G, int capacity,  boolean isTouch, String os) {
        super(model, brand, is5G, capacity);
        this.isTouch = isTouch;
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public boolean isTouch() {
        return isTouch;
    }

    public void setTouch(boolean touch) {
        isTouch = touch;
    }

    @Override
    public void call(String number) {
        super.call(number);
    }

    @Override
    public void sendMessage(String message, String number) {
        super.sendMessage(message, number);
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "os='" + os + '\'' +
                '}';
    }
}
