import java.util.regex.*;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        // variables and objects instantiation
        String name, email, phoneNum, streetAddress, secondAddress, federalEIN, socialSecurity;
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
        System.out.println("Enter email address: ");
        email = scan.nextLine();
        // email must have @ and then .com
        while (!email.matches("^.+@.+\\.(com|net)"))
        {
            System.out.println("Invalid email format. Enter email address: ");
            email = scan.nextLine();
        } // end while
        application.setEmail(email);

        System.out.println(application.toString());

        // getting initial phone number input
        System.out.println("Enter phone number: ");
        phoneNum = scan.nextLine();
        while (!phoneNum.matches("\\([0-9]{3}\\)[0-9]{3}-[0-9]{4}"))
        {
            System.out.println("Invalid phone number format. Enter phone number: ");
            phoneNum = scan.nextLine();
        } // end while
        application.setPhoneNum(phoneNum);

        System.out.println(application.toString());

        // getting initial federal EIN numbers
        System.out.println("Enter federal EIN: ");
        federalEIN = scan.nextLine();
        while (!federalEIN.matches("[0-9]{2}-[0-9]{7}"))
        {
            System.out.println("Invalid EIN. Enter EIN: ");
            federalEIN = scan.nextLine();
        } // end while
        application.setFederalEIN(federalEIN);

        System.out.println(application.toString());

        // getting initial Social Security Number
        System.out.println("Enter SSN: ");
        socialSecurity = scan.nextLine();
        while (!socialSecurity.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}"))
        {
            System.out.println("Invalid SSN. Enter SSN: ");
            socialSecurity = scan.nextLine();
        } // end while
        application.setSocialSecurity(socialSecurity);

        System.out.println(application.toString());



        // getting initial street address
        System.out.println("Enter your street address: ");
        streetAddress = scan.nextLine();
        while (!streetAddress.matches("[0-9]{1,5} [A-Za-z]+ (st|ave|dr|cir|blvd)"))
        {
            System.out.println("Invalid street address. Enter street address: ");
            streetAddress = scan.nextLine();
        } // end while
        // getting second portion of address
        System.out.println("Enter your city, state, and zipcode: ");
        secondAddress = scan.nextLine();
        while (!secondAddress.matches("[A-Za-z]+, [A-Z]{2} [0-9]{5}"))
        {
            System.out.println("Invalid (must be in this format: Perris, CA 92558). Enter city, state, and zipcode: ");
            secondAddress = scan.nextLine();
        } // end while

        application.setAddress(streetAddress + ", " + secondAddress);

        System.out.println(application.toString());

    } // end main method
} // end Main class
