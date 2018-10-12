/**
 * Created by inzamamrahaman on 12/10/2018.
 */
public class FacebookService implements AuthService {

    @Override
    public boolean authenticate(String username, String password) {
        System.out.println("HAHA I'm so super secure :D");
        return true;
    }
}
