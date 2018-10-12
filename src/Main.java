public class Main {

    public static void main(String[] args)
    {
	    String name = "Github";
        AuthenticatorFactory factory = new AuthenticatorFactory();


        AuthService service = factory.create(name);
        Authenticator auth = new Authenticator(service);
        boolean b = auth.authenticate("Jane", "Doe");
        System.out.println(b);

        name = "Facebook";

        AuthService service1 = factory.create(name);
        Authenticator auth1 = new Authenticator(service1);
        b = auth1.authenticate("Joe", "Doe");
        System.out.println(b);
    }
}
