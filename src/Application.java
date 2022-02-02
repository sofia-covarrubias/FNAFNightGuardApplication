public class Application
{
    // instance variables
    private String name;
    private String email;
    private String phoneNum;
    private String address;
    private String hireDate;
    private String federalEIN;
    private String socialSecurity;

    // constructor
    public Application (String name, String email, String phoneNum, String address, String hireDate, String federalEIN, String socialSecurity)
    {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
        this.hireDate = hireDate;
        this.federalEIN = federalEIN;
        this.socialSecurity = socialSecurity;
    }

    public Application ()
    {
        this.name = null;
        this.email = null;
        this.phoneNum = null;
        this.address = null;
        this.hireDate = null;
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
    public String getAddress ()
    {
        return address;
    }
    public String getHireDate ()
    {
        return hireDate;
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
    public void setAddress (String address)
    {
        this.address = address;
    }
    public void setHireDate (String hireDate)
    {
        this.hireDate = hireDate;
    }
    public void setFederalEIN (String federalEIN)
    {
        this.federalEIN = federalEIN;
    }
    public void setSocialSecurity (String socialSecurity)
    {
        this.socialSecurity = socialSecurity;
    }

    // methods
    public String toString ()
    {
        String output = "Name: " + name + "\nEmail: " + email + "\nPhone Number: " + phoneNum
        + "\nAddress: " + address + "\nHire Date: " + hireDate + "\nEIN: " + federalEIN + "\nSSN: " + socialSecurity;
        return output;
    }

}
