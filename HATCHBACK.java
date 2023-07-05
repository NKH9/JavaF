public class HATCHBACK extends Automobiles{
    AutomobileTypes type;
    public HATCHBACK(String manufacturer, String model, Double price, int year, AutomobileTypes type) {
        super(manufacturer, model, price, year);
        this.type=type;
    }

    @Override
    public AutomobileTypes GetType() {
        return type;
    }

}
