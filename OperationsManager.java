import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ForkJoinWorkerThread;

public class OperationsManager implements Operations{
    DB database;
    @Override
    public DB createDatabase() {
        this.database=new DB();
        return database;
    }

    @Override
    public void getAllAutos(DB db) {
        System.out.println(db);
    }

    @Override
    public void addtodb(DB db ,Automobiles item) throws InvalidSintaxOfautomobiles {
        database.Additem(item);
    }

    @Override
    public void getbymodel(String model) {
        database.getAutomobileByModel(model);
    }

    private Automobiles createautomobiles(String manufacturer, String model, Double price, int year,String type){
        switch (AutomobileTypes.valueOf(type)){
            case SEDAN:
                System.out.println("seda");
                return new SEDAN(manufacturer, model, price, year,AutomobileTypes.SEDAN);
            case SUV:
                System.out.println("su");
                return new SUV(manufacturer, model, price, year,AutomobileTypes.SUV );
            case HATCHBACK:
                System.out.println("hath");
                return new HATCHBACK(manufacturer, model, price, year,AutomobileTypes.HATCHBACK);
            default:
                return null;
        }
    }
    @Override
    public void addtobdfromfile(String filename) {
        try (Scanner sc=new Scanner(new BufferedReader(new FileReader(filename)))){
            ArrayList<String> files=new ArrayList<>();
            while(sc.hasNext()){
                files.add(sc.next());
            }
            for( String str : files){
                String[] words=str.split(",");
                String manufacturer=words[0];
                String model=words[1];
                Double price=Double.parseDouble(words[2]);
                Integer year= Integer.parseInt(words[3]);
                String type=words[4];
                Automobiles example=createautomobiles(manufacturer,model,price,year,type);
                database.Additem(example);
                System.out.println(example);
                System.out.println(type);

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
