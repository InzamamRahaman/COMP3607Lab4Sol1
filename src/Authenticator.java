/**
 * Created by inzamamrahaman on 12/10/2018.
 */
public class Authenticator
{
    AuthService authService;

    public Authenticator(AuthService authService)
    {
        this.authService = authService;
    }

    public boolean authenticate(String username, String password)
    {
        boolean b = authService.authenticate(username, password);
        if(b == true)
        {
            System.out.println("LOL");
        }
        else
        {
            System.out.println("ROFL");
        }
        return b;
    }
}
