import java.util.Locale;
import java.util.SimpleTimeZone;

abstract public class Automobiles {
    private String manufacturer;
    private String model;
    private Double price;
    private int year;
    private AutomobileTypes type;

    public Automobiles(String manufacturer, String model, Double price, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.year = year;
    }
    public Automobiles(String manufacturer, String model, Double price, int year,AutomobileTypes type) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.year = year;
        this.type=type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract AutomobileTypes GetType();


    @Override
    public String toString() {
        return "Automobiles{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", type=" + type +
                '}';
    }
}
