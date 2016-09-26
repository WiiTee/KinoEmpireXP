package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Bogi on 26/09/2016.
 */
public class DbConnection {

    final static String user = "kinodb";
    final static String pass = "kinodb";
    final static String db = "kinodb";
    final static String URL = "jdbc:mysql://db4free.net:3306/";


    public static Connection getConnection() {
        Connection conn;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL + db, user, pass);
            return conn;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
