package database;

public class DBConnect {
    private static DBConnect singleInstance = new DBConnect();

    private DBConnect() {}

    public static DBConnect getDBInstance() {
        return singleInstance;
    }


}
