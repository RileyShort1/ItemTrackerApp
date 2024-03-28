package database;

import java.io.BufferedReader;
import java.io.FileReader;

public class DBConnect {
    private static DBConnect singleInstance = new DBConnect();

    private DBConnect() {};

    public static DBConnect getDBInstance() {
        return singleInstance;
    }

    public void addCategory(String category) {

    }




}
