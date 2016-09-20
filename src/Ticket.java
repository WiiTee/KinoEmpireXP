import java.sql.Timestamp;

/**
 * Created by Lasse on 20/09/16.
 */
public class Ticket
{
    private int theater;
    private Timestamp viewingTime;
    private int row;
    private int seatNumber;
    private double price;


    public Ticket(int theater, Timestamp viewingTime, int row, int seatNumber, double price) {
        this.theater = theater;
        this.viewingTime = viewingTime;
        this.row = row;
        this.seatNumber = seatNumber;
        this.price = price;
    }
}
