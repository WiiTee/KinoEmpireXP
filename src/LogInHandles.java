/**
 * Created by Flemmer on 21-09-2016.
 */
public class LogInHandles {


    public void logInButtonPressed(){

        // Username = admin, password = pass --> admin-window
        if(usernameField.getText().equals("admin") && passwordField.getText().equals("pass")){
            // kode her til at vise Admin-vindue
        }

        // Username = superuser, password = pass --> superuser-window
        if(usernameField.getText().equals("superuser") && passwordField.getText().equals("pass")){
            // kode her til at vise Superuser-vindue
        }

        // Eventuel besked til brugeren om, at log-in er forkert
        else{
            usernameField.clear();
            passwordField.clear();
        }

    }

}
