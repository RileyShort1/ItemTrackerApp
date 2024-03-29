package datamanager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataManager {
    private static DataManager singleInstance = new DataManager();

    private DataManager() {};

    public static DataManager getDBInstance() {
        return singleInstance;
    }

    public void addCategory(String category) {
        try {
            // opens file for writing or creates new file
            BufferedWriter out = new BufferedWriter(new FileWriter("src/datamanager/category.csv",true));
            out.write(category);
            out.newLine();
            out.close();
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
    public void addStorageLocation(String location, String description) {
        try {
            // opens file for writing or creates new file
            BufferedWriter out = new BufferedWriter(new FileWriter("src/datamanager/location.csv",true));
            // file should be written as "location, description"
            String line = location + "," + description;
            out.write(line);

            out.newLine();
            out.close();
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
