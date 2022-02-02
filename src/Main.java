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
        System.out.println("Enter full name: ");
        name = scan.nextLine();
        // checking is name is all letters
        while (!name.matches("[A-Za-z]+"))
        {
            System.out.println("Must be all letters. Enter full name: ");
            name = scan.nextLine();
        } // end while
        application.setName(name); // when name is validated, set object name attribute

        System.out.println(application.toString());

        // getting initial input of email
        System.out.println("Enter email: ");
        email = scan.nextLine();
        // email must have @ and then .com
        while (!email.matches("^.+@.+\\.(com|net)"))
        {
            System.out.println("Invalid email format. Enter email address: ");
            email = scan.nextLine();
        } // end while
        application.setEmail(email);

        System.out.println(application.toString());

    } // end main method
} // end Main class
