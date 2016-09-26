package controller;


import Database.DbOrderHandle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import model.Order;



/**
 * Created by Bogi on 26/09/2016.
 */
public class ViewOrder {


//    ObservableList<Order> orderObservaleList = FXCollections.observableArrayList(DbOrderHandle.getAllOrders());
//    TableView<Order> orderTableView = new TableView<>();

    public static void updateTableView(){

        ObservableList<Order> orderObservaleList = FXCollections.observableArrayList(DbOrderHandle.getAllOrders());
        TableView<Order> orderTableView = new TableView<>();


        TableColumn<Order, String> firstNameColumn = new TableColumn<>("Fornavn: ");
        firstNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        firstNameColumn.setCellValueFactory(e -> e.getValue().firstNameProperty());
//        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("first_name"));

        TableColumn<Order, String> lastNameColumn = new TableColumn<>("Efternavn: ");
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("last_name"));

        TableColumn<Order, String> emailAddressColumn = new TableColumn<>("Email: ");
        emailAddressColumn.setCellValueFactory(new PropertyValueFactory<>("emailAddress"));

        TableColumn<Order, String> phoneNumberColumn = new TableColumn<>("Telefon: ");
        phoneNumberColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));

        TableColumn<Order, String> movieTitleColumn = new TableColumn<>("Titel: ");
        movieTitleColumn.setCellValueFactory(new PropertyValueFactory<>("movieTitle"));

        TableColumn<Order, String> numberOfTicketsColumn = new TableColumn<>("Antal Biletter: ");
        numberOfTicketsColumn.setCellValueFactory(new PropertyValueFactory<>("numberOfTickets"));

        TableColumn<Order, String> rowColumn = new TableColumn<>("Række: ");
        rowColumn.setCellValueFactory(new PropertyValueFactory<>("row"));

        TableColumn<Order, String> seatColumn = new TableColumn<>("Sæde: ");
        seatColumn.setCellValueFactory(new PropertyValueFactory<>("seat"));

        TableColumn<Order, String> theaterColumn = new TableColumn<>("Sal: ");
        theaterColumn.setCellValueFactory(new PropertyValueFactory<>("theater"));

        TableColumn<Order, String> dateColumn = new TableColumn<>("Dato: ");
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        TableColumn<Order, String> timeColumn = new TableColumn<>("Tidspunk: ");
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));

        TableColumn<Order, String> priceColumn = new TableColumn<>("Pris: ");
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));


        orderTableView.setItems(orderObservaleList);
        orderTableView.getColumns().addAll(firstNameColumn, lastNameColumn, emailAddressColumn, phoneNumberColumn, movieTitleColumn, numberOfTicketsColumn, rowColumn,
                                            seatColumn, theaterColumn, dateColumn, timeColumn, priceColumn);
        //Gør listen redigerbar
        orderTableView.setEditable(true);



    }










}
