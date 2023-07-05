import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidSintaxOfautomobiles {
        Operations op=new OperationsManager();
        String filename="C:\\Users\\User\\IdeaProjects\\FinalExamExample\\src\\lists.txt";
        DB database=op.createDatabase();
        op.addtobdfromfile(filename);
        op.getAllAutos(database);

    }
}