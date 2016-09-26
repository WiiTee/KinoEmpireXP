/*
Øpackage Database;


import java.sql.*;

public class DatabaseConnection {

    private static DatabaseConnection ourInstance = new DatabaseConnection();

    public static DatabaseConnection getInstance(){
        return ourInstance;
    }

    public Statement stmt;
    public String sqlString;

    private DatabaseConnection() {
        System.out.println("Database is created");
        try {
            //Register the JDBC driver for MySQL
//            Class.forName("com.mysql.jdbc.Driver");
//            String url = "jdbc:mysql://db4free.net:3306/";
//
//            //Get a connection to the database for a user named root with password admin
//            Connection con = DriverManager.getConnection(url, "kinodb", "kinodb");
//
//            //Display the URL and connection information
//            System.out.println("URL: " + url);
//            System.out.println("Connection: " + con);
//
//            //Get a Statement object
//            stmt = con.createStatement();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Creating movie table");
       try{
           //Dropping DB
           sqlString = "DROP SCHEMA IF EXISTS `kinodb` ";
           stmt.executeUpdate(sqlString);

           //Creating DB
           sqlString = "CREATE SCHEMA IF NOT EXISTS `kinodb` DEFAULT CHARACTER SET utf8 ;";
           stmt.executeUpdate(sqlString);

           //Choosing DB
           sqlString = "USE `kinodb` ;";
           stmt.executeUpdate(sqlString);

           //Drop statement
           sqlString = "DROP TABLE IF EXISTS `kinodb`.`movie` ;";
           stmt.executeUpdate(sqlString);

           //Creating movie table
           sqlString = "CREATE TABLE `movie` (\n" +
                   "  `title` varchar(45) NOT NULL,\n" +
                   "  `genre` varchar(45) NOT NULL,\n" +
                   "  `duration` double NOT NULL,\n" +
                   "  `start_date` date NOT NULL,\n" +
                   "  `end_date` varchar(15) NOT NULL,\n" +
                   "  `rating` int(11) NOT NULL,\n" +
                   "  PRIMARY KEY (`title`)\n" +
                   ") ENGINE=InnoDB DEFAULT CHARSET=utf8";
           stmt.executeUpdate(sqlString);


           System.out.println("Creating customer table");
           sqlString = "DROP TABLE IF EXISTS `kinodb`.`customer` ;";
           stmt.executeUpdate(sqlString);


           sqlString = "CREATE TABLE `customer` (\n" +
                   "  `first_name` varchar(45) NOT NULL,\n" +
                   "  `last_name` varchar(45) NOT NULL,\n" +
                   "  `email_address` varchar(45) NOT NULL,\n" +
                   "  `phone` int(20) NOT NULL,\n" +
                   "  PRIMARY KEY (`phone`)\n" +
                   ") ENGINE=InnoDB DEFAULT CHARSET=utf8";
           stmt.executeUpdate(sqlString);

           System.out.println("Creating orders table");
           sqlString = "DROP TABLE IF EXISTS `kinodb`.`orders` ;";
           stmt.executeUpdate(sqlString);


           sqlString = "CREATE TABLE `orders` (\n" +
                   "  `first_name` varchar(45) NOT NULL,\n" +
                   "  `last_name` varchar(45) NOT NULL,\n" +
                   "  `email_address` varchar(45) NOT NULL,\n" +
                   "  `phone` int(11) NOT NULL,\n" +
                   "  `title` varchar(45) NOT NULL,\n" +
                   "  `ticket_id` int(11) NOT NULL AUTO_INCREMENT,\n" +
                   "  `number_of_tickets` int(11) NOT NULL,\n" +
                   "  `row` int(11) NOT NULL,\n" +
                   "  `seat` int(11) NOT NULL,\n" +
                   "  `theater` int(11) NOT NULL,\n" +
                   "  `date` date NOT NULL,\n" +
                   "  `time` double NOT NULL,\n" +
                   "  `price` double NOT NULL,\n" +
                   "  PRIMARY KEY (`ticket_id`),\n" +
                   "  KEY `phone_idx` (`phone`),\n" +
                   "  KEY `title_idx` (`title`),\n" +
                   "  CONSTRAINT `phone` FOREIGN KEY (`phone`) REFERENCES `customer` (`phone`) ON DELETE NO ACTION ON UPDATE NO ACTION,\n" +
                   "  CONSTRAINT `title` FOREIGN KEY (`title`) REFERENCES `movie` (`title`) ON DELETE NO ACTION ON UPDATE NO ACTION\n" +
                   ") ENGINE=InnoDB DEFAULT CHARSET=utf8";
           stmt.executeUpdate(sqlString);

       }catch (Exception e){
           e.printStackTrace();
       }
    }


}
*/