/**
 * Created by inzamamrahaman on 12/10/2018.
 */
public class AuthenticatorFactory
{


    public AuthenticatorFactory()
    {

    }

    public AuthService create(String name)
    {
        if(name.equals("Google"))
        {
            return new GoogleService();
        }

        if (name.equals("Github"))
        {
            return new GithubService();
        }

        if(name.equals("Facebook"))
        {
            return new FacebookService();
        }

        return null;
    }
}
