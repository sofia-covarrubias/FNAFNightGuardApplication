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
    public void validateName ()
    {

    }
    public void validateEmail ()
    {

    }
    public void validatePhoneNum ()
    {

    }
    public void validateStreetAddress ()
    {

    }
    public void validateSecondAddress ()
    {

    }
    public void validateFederalEIN ()
    {

    }
    public void validateSocialSecurity ()
    {

    }




    // methods
    public String toString ()
    {
        String output = "Name: " + name + "\nEmail: " + email + "\nPhone Number: " + phoneNum
        + "\nStreet Address: " + streetAddress + "\nCity, State, Zipcode: " + secondAddress + "\nEIN: " + federalEIN + "\nSSN: " + socialSecurity;
        return output;
    }


}
