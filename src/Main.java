import jdk.jfr.StackTrace;

import java.util.regex.*;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {

        Application jeremy = new Application ();
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scan.nextLine();
        jeremy.validateName(name);
        System.out.println(jeremy.getName());

        System.out.println("What is your email? ");
        String email = scan.nextLine();
        jeremy.validateEmail(email);
        System.out.println(jeremy.getEmail());

        System.out.println("What is your phone number? ");
        String phoneNum = scan.nextLine();
        jeremy.validatePhoneNum(phoneNum);
        System.out.println(jeremy.getPhoneNum());

        System.out.println("What is your federal EIN? ");
        String federalEIN = scan.nextLine();
        jeremy.validateFederalEIN(federalEIN);
        System.out.println(jeremy.getFederalEIN());

        System.out.println("What is your social security number? ");
        String socialSecurity = scan.nextLine();
        jeremy.validateSocialSecurity(socialSecurity);
        System.out.println(jeremy.getSocialSecurity());

        System.out.println("What is your street address? ");
        String streetAddress = scan.nextLine();
        jeremy.validateStreetAddress(streetAddress);
        System.out.println(jeremy.getStreetAddress());

        System.out.println("What is your second address? ");
        String secondAddress = scan.nextLine();
        jeremy.validateSecondAddress(secondAddress);
        System.out.println(jeremy.getSecondAddress());




        /*
        // variables and objects instantiation
        String name, email, phoneNum, streetAddress, secondAddress, federalEIN, socialSecurity;
        Application application = new Application();
        Scanner scan = new Scanner(System.in);

        // Night 1 Phone Guy lines
        System.out.println("HELLO! IF YOU ARE HERE, YOU ARE APPLYING FOR A JOB AT FREDDY FAZBEAR\'S PIZZA AS A NIGHT GUARD. FILL OUT THE FOLLOWING INFORMATION. \nPhone Guy: Uh, let's see, first there's an introductory greeting from the company that I'm supposed to read. Uh, it's kind of a legal thing, you know. Um, Welcome to Freddy Fazbear's Pizza. \nA magical place for kids and grown-ups alike, where fantasy and fun come to life. Fazbear Entertainment is not responsible for damage to property or person. \nUpon discovering that damage or death has occurred, a missing person report will be filed within 90 days, or as soon property and premises have been thoroughly \ncleaned and bleached, and the carpets have been replaced.");

        // getting initial input of name
        System.out.println("\nEnter full name: ");
        name = scan.nextLine();
        // checking is name is all letters
        while (!name.matches("^[\\p{L} .'-]+$"))
        {
            System.out.println("Must be all letters. Enter full name: ");
            name = scan.nextLine();
        } // end while
        application.setName(name); // when name is validated, set object name attribute

        System.out.println(application.toString());

        System.out.println("Phone Guy: Blah blah blah, now that might sound bad, I know, but there's really nothing to worry about. Uh, the animatronic characters here do get a bit quirky at night, but do I blame them? \nNo. If I were forced to sing those same stupid songs for twenty years and I never got a bath? I'd probably be a bit irritable at night too. So, remember, these characters hold a special place in the hearts of \nchildren and we need to show them a little respect, right? Okay.");

        // getting initial input of email
        System.out.println("\nEnter email address: ");
        email = scan.nextLine();
        // email must have @ and then .com
        while (!email.matches("^.+@.+\\.(com|net)"))
        {
            System.out.println("Invalid email format. Must be the following format: username@domain.com or net.\nEnter email address: ");
            email = scan.nextLine();
        } // end while
        application.setEmail(email);

        System.out.println(application.toString());

        // getting initial phone number input
        System.out.println("\nEnter phone number: ");
        phoneNum = scan.nextLine();
        while (!phoneNum.matches("\\([0-9]{3}\\)[0-9]{3}-[0-9]{4}"))
        {
            System.out.println("Invalid phone number format. Must be in following format: (951)123-4567. \nEnter phone number: ");
            phoneNum = scan.nextLine();
        } // end while
        application.setPhoneNum(phoneNum);

        System.out.println(application.toString());

        // getting initial federal EIN numbers
        System.out.println("\nEnter federal EIN: ");
        federalEIN = scan.nextLine();
        while (!federalEIN.matches("[0-9]{2}-[0-9]{7}"))
        {
            System.out.println("Invalid EIN. Must be in the following format: 12-1234567. \nEnter EIN: ");
            federalEIN = scan.nextLine();
        } // end while
        application.setFederalEIN(federalEIN);

        System.out.println(application.toString());

        // getting initial Social Security Number
        System.out.println("\nEnter SSN: ");
        socialSecurity = scan.nextLine();
        while (!socialSecurity.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}"))
        {
            System.out.println("Invalid SSN. Must be in the following format: 123-45-6789. \nEnter SSN: ");
            socialSecurity = scan.nextLine();
        } // end while
        application.setSocialSecurity(socialSecurity);

        System.out.println(application.toString());



        // getting initial street address
        System.out.println("\nEnter your street address: ");
        streetAddress = scan.nextLine();
        while (!streetAddress.matches("[0-9]{1,5} [A-Za-z]+ (st|ave|dr|cir|blvd)"))
        {
            System.out.println("Invalid street address. Must be in the following format: 123 bro st/ave/dr/cir/blvd. \nEnter street address: ");
            streetAddress = scan.nextLine();
        } // end while
        // getting second portion of address
        System.out.println("\nEnter your city, state, and zipcode: ");
        secondAddress = scan.nextLine();
        while (!secondAddress.matches("[A-Za-z]+, \\p{Alpha}{2} [0-9]{5}"))
        {
            System.out.println("Invalid format. Must be in the following format: Perris, CA 92558. \nEnter city, state, and zipcode: ");
            secondAddress = scan.nextLine();
        } // end while

        application.setAddress(streetAddress + ", " + secondAddress);

        System.out.println(application.toString());
        */

    } // end main method


} // end Main class
