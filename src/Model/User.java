package Model;

/**
 * Created by Lasse on 20/09/16.
 */
public class User
{
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    //Wether the user is a super admin, admin or user.
    private int adminRights;
    /*  0 = super admin
        1 = admin
        2 = user */

    public User(String username, String password, String firstName, String lastName, String phoneNumber, String email, int adminRights) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.adminRights = adminRights;
    }
}
