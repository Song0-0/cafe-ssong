package cafe;

public class Menu {
    private String name;
    private String size;
    private String temperature;
    private int price;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSize() {
        return size;
    }

    void setSize(String size) {
        this.size = size;
    }

    String getTemperature() {
        return temperature;
    }

    void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }
}
