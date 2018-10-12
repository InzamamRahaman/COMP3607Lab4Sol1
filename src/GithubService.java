/**
 * Created by inzamamrahaman on 12/10/2018.
 */

import java.util.Random;

public class GithubService implements AuthService
{

    Random rand;

    public GithubService()
    {
        this.rand = new Random();
    }

    public boolean authenticate(String username, String password)
    {
        Double d = this.rand.nextDouble();
        if(d <= 0.3)
            return false;
        return true;
    }

}
