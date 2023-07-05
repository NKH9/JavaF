import java.util.concurrent.atomic.AtomicBoolean;

public class SUV extends Automobiles{
    AutomobileTypes type;
    public SUV(String manufacturer, String model, Double price, int year, AutomobileTypes type) {
        super(manufacturer, model, price, year);
    }

    @Override
    public AutomobileTypes GetType() {
        AutomobileTypes type= AutomobileTypes.SUV;
        return type;
    }


}
