package Database;


import Model.Order;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Bogi on 26/09/2016.
 */
public class DbOrderHandle {

    public static ObservableList getAllOrders(){

        ResultSet rs = null;
        ObservableList orderList = FXCollections.observableArrayList();
        try {
            Connection conn = DbConnection.getConnection();
            Statement stmt = conn.createStatement();

            String sqlString = ("SELECT * FROM orders;");
            rs = conn.createStatement().executeQuery(sqlString);

            while (rs.next()) {
                Order order = new Order();

                order.setFirstName(rs.getString("first_name"));
                order.setLastName(rs.getString("last_name"));
                order.setEmailAddress(rs.getString("email_address"));
                order.setPhoneNumber(rs.getInt("phone"));
                order.setMovieTitle(rs.getString("title"));
                order.setNumberOfTickets(rs.getInt("number_of_tickets"));
                order.setRow(rs.getInt("row"));
                order.setSeat(rs.getInt("seat"));
                order.setTheater(rs.getInt("theater"));
                order.setDate(rs.getString("date"));
                order.setTime(rs.getDouble("time"));
                order.setPrice(rs.getDouble("price"));

                orderList.add(order);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orderList;
    }
}
