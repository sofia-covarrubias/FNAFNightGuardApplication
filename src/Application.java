import java.util.Scanner;

public class Application
{
    // instance variables
    private String name;
    private String email;
    private String phoneNum;
    private String streetAddress;
    private String secondAddress;
    private String federalEIN;
    private String socialSecurity;

    // Scanner
    Scanner scan = new Scanner (System.in);

    // constructor
    public Application (String name, String email, String phoneNum, String streetAddress, String secondAddress, String federalEIN, String socialSecurity)
    {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.streetAddress = streetAddress;
        this.secondAddress = secondAddress;
        this.federalEIN = federalEIN;
        this.socialSecurity = socialSecurity;
    }

    public Application ()
    {
        this.name = null;
        this.email = null;
        this.phoneNum = null;
        this.secondAddress = null;
        this.streetAddress = null;
        this.federalEIN = null;
        this.socialSecurity = null;
    }

    // getters
    public String getName ()
    {
        return name;
    }
    public String getEmail ()
    {
        return email;
    }
    public String getPhoneNum ()
    {
        return phoneNum;
    }
    public String getStreetAddress ()
    {
        return streetAddress;
    }
    public String getSecondAddress ()
    {
        return secondAddress;
    }
    public String getFederalEIN ()
    {
        return federalEIN;
    }
    public String getSocialSecurity ()
    {
        return socialSecurity;
    }

    // setters
    public void setName (String name)
    {
        this.name = name;
    }
    public void setEmail (String email)
    {
        this.email = email;
    }
    public void setPhoneNum (String phoneNum)
    {
        this.phoneNum = phoneNum;
    }
    public void setStreetAddress (String streetAddress)
    {
        this.streetAddress = streetAddress;
    }
    public void setSecondAddress (String secondAddress)
    {
        this.secondAddress = secondAddress;
    }
    public void setFederalEIN (String federalEIN)
    {
        this.federalEIN = federalEIN;
    }
    public void setSocialSecurity (String socialSecurity)
    {
        this.socialSecurity = socialSecurity;
    }

    // user input validation
    public String validateName (String name)
    {
        String nameInput = name;
        while (!nameInput.matches("^[\\p{L} .'-]+$"))
        {
            System.out.println("Must be all letters. Enter full name: ");
            nameInput = scan.nextLine();
        } // end while
        setName(nameInput); // when name is validated, set object name attribute
        return nameInput;
    }
    public void validateEmail (String email)
    {
        String emailInput = email;
        while (!emailInput.matches("^.+@.+\\.(com|net)"))
        {
            System.out.println("Invalid email format. Must be the following format: username@domain.com or net.\nEnter email address: ");
            emailInput = scan.nextLine();
        } // end while
        setEmail(emailInput);
    }
    public void validatePhoneNum (String phoneNum)
    {
        String phoneNumInput = phoneNum;
        while (!phoneNumInput.matches("\\([0-9]{3}\\)[0-9]{3}-[0-9]{4}"))
        {
            System.out.println("Invalid phone number format. Must be in following format: (951)123-4567. \nEnter phone number: ");
            phoneNumInput = scan.nextLine();
        }
        setPhoneNum(phoneNumInput);
    }
    public void validateStreetAddress (String streetAddress)
    {
        String streetAddressInput = streetAddress;
        while (!streetAddressInput.matches("[0-9]{1,5} [A-Za-z]+ (st|ave|dr|cir|blvd)"))
        {
            System.out.println("Invalid street address. Must be in the following format: 123 bro st/ave/dr/cir/blvd. \nEnter street address: ");
            streetAddressInput = scan.nextLine();
        }
        setStreetAddress(streetAddressInput);
    }
    public void validateSecondAddress (String secondAddress)
    {
        String secondAddressInput = secondAddress;
        while (!secondAddressInput.matches("[A-Za-z]+, \\p{Alpha}{2} [0-9]{5}"))
        {
            System.out.println("Invalid format. Must be in the following format: Perris, CA 92558. \nEnter city, state, and zipcode: ");
            secondAddressInput = scan.nextLine();
        }
        setSecondAddress(secondAddressInput);
    }
    public void validateFederalEIN (String federalEIN)
    {
        String federalEINInput = federalEIN;
        while (!federalEINInput.matches("[0-9]{2}-[0-9]{7}"))
        {
            System.out.println("Invalid EIN. Must be in the following format: 12-1234567. \\nEnter EIN: ");
            federalEINInput = scan.nextLine();
        }
        setFederalEIN(federalEINInput);
    }
    public void validateSocialSecurity (String socialSecurity)
    {
        String socialSecurityInput = socialSecurity;
        while (!socialSecurityInput.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}"))
        {
            System.out.println("Invalid SSN. Must be in the following format: 123-45-6789. \nEnter SSN: ");
            socialSecurityInput = scan.nextLine();
        }
        setSocialSecurity(socialSecurityInput);
    }




    // methods
    public String toString ()
    {
        String output = "Name: " + name + "\nEmail: " + email + "\nPhone Number: " + phoneNum
        + "\nStreet Address: " + streetAddress + "\nCity, State, Zipcode: " + secondAddress + "\nEIN: " + federalEIN + "\nSSN: " + socialSecurity;
        return output;
    }


}
