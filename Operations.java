import java.util.ArrayList;

public interface Operations {
    DB createDatabase();
    void getAllAutos(DB db) ;
    void addtodb(DB db ,Automobiles item) throws InvalidSintaxOfautomobiles;
    void getbymodel(String model) ;
    void addtobdfromfile(String filename);

}
