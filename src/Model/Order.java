package Model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by Bogi on 26/09/2016.
 */
public class Order {

    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;
    private SimpleStringProperty emailAddress;
    private SimpleIntegerProperty phoneNumber;
    private SimpleStringProperty movieTitle;
    private SimpleIntegerProperty numberOfTickets;
    private SimpleIntegerProperty row;
    private SimpleIntegerProperty seat;
    private SimpleIntegerProperty theater;
    private SimpleStringProperty date;
    private SimpleDoubleProperty time;
    private SimpleDoubleProperty price;

    public Order( String firstName, String lastName, String emailAddress, int phoneNumber, String movieTitle, int numberOfTickets, int row, int seat, int theater, String date, double time, double price) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.emailAddress = new SimpleStringProperty(emailAddress);
        this.phoneNumber = new SimpleIntegerProperty(phoneNumber);
        this.movieTitle = new SimpleStringProperty(movieTitle);
        this.numberOfTickets = new SimpleIntegerProperty(numberOfTickets);
        this.row = new SimpleIntegerProperty(row);
        this.seat = new SimpleIntegerProperty(seat);
        this.theater = new SimpleIntegerProperty(theater);
        this.date = new SimpleStringProperty(date);
        this.time = new SimpleDoubleProperty(time);
        this.price = new SimpleDoubleProperty(price);
    }

    public Order(){
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress.set(emailAddress);
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle.set(movieTitle);
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets.set(numberOfTickets);
    }

    public void setRow(int row) {
        this.row.set(row);
    }

    public void setSeat(int seat) {
        this.seat.set(seat);
    }

    public void setTheater(int theater) {
        this.theater.set(theater);
    }

    public void setDate(String date) {
        this.date.set(date);
    }

    public void setTime(double time) {
        this.time.set(time);
    }

    public void setPrice(double price) {
        this.price.set(price);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public SimpleStringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public SimpleStringProperty lastNameProperty() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress.get();
    }

    public SimpleStringProperty emailAddressProperty() {
        return emailAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber.get();
    }

    public SimpleIntegerProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public String getMovieTitle() {
        return movieTitle.get();
    }

    public SimpleStringProperty movieTitleProperty() {
        return movieTitle;
    }

    public int getNumberOfTickets() {
        return numberOfTickets.get();
    }

    public SimpleIntegerProperty numberOfTicketsProperty() {
        return numberOfTickets;
    }

    public int getRow() {
        return row.get();
    }

    public SimpleIntegerProperty rowProperty() {
        return row;
    }

    public int getSeat() {
        return seat.get();
    }

    public SimpleIntegerProperty seatProperty() {
        return seat;
    }

    public int getTheater() {
        return theater.get();
    }

    public SimpleIntegerProperty theaterProperty() {
        return theater;
    }

    public String getDate() {
        return date.get();
    }

    public SimpleStringProperty dateProperty() {
        return date;
    }

    public double getTime() {
        return time.get();
    }

    public SimpleDoubleProperty timeProperty() {
        return time;
    }

    public double getPrice() {
        return price.get();
    }

    public SimpleDoubleProperty priceProperty() {
        return price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", emailAddress=" + emailAddress +
                ", phoneNumber=" + phoneNumber +
                ", movieTitle=" + movieTitle +
                ", numberOfTickets=" + numberOfTickets +
                ", row=" + row +
                ", seat=" + seat +
                ", theater=" + theater +
                ", date=" + date +
                ", time=" + time +
                ", price=" + price +
                '}';
    }
}