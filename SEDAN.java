public class SEDAN extends Automobiles{
    AutomobileTypes type;
    public SEDAN(String manufacturer, String model, Double price, int year,  AutomobileTypes type) {
        super(manufacturer, model, price, year);
        this.type=type;
    }

    @Override
    public AutomobileTypes GetType() {
        return type;
    }

}

