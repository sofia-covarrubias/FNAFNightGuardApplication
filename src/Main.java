import java.util.regex.*;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        // variables and objects instantiation
        String name, email, phoneNum, address, hireDate, federalEIN, SocialSecurity;
        Application application = new Application();
        Scanner scan = new Scanner(System.in);

        // getting initial input of name
        System.out.println("What is your name? ");
        name = scan.nextLine();
        // checking is name is all letters
        while (!name.matches("[A-Za-z]+"))
        {
            System.out.println("Must be all letters. What is your full name? ");
            name = scan.nextLine();
        }
        application.setName(name); // when name is validated, set object name attribute

        System.out.println(application.toString());

    }
}
