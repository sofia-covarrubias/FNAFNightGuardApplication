import org.junit.Test;
import java.util.regex.*;

import static org.junit.Assert.*;

public class ApplicationTest
{
    @Test
    public void validateNameFail ()
    {
        Application jeremy = new Application();
        jeremy.setName("125 654sd");
        assertTrue(jeremy.getName().matches("^[\\p{L} .'-]+$"));
    }
    @Test
    public void validateNamePass ()
    {
        Application jeremy = new Application();
        jeremy.setName("Sofia Covarrubias");
        assertTrue(jeremy.getName().matches("^[\\p{L} .'-]+$"));
    }
    @Test
    public void validateEmailPass ()
    {
        Application jeremy = new Application();
        jeremy.setEmail("sofia@gmail.net");
        assertTrue(jeremy.getEmail().matches("^.+@.+\\.(com|net)"));
    }
    @Test
    public void validateEmailFail ()
    {
        Application jeremy = new Application();
        jeremy.setEmail("bruh@bro.comm");
        assertTrue(jeremy.getEmail().matches("^.+@.+\\.(com|net)"));
    }
    @Test
    public void validatePhoneNumPass ()
    {
        Application jeremy = new Application();
        jeremy.setPhoneNum("(951)111-1111");
        assertTrue(jeremy.getPhoneNum().matches("\\([0-9]{3}\\)[0-9]{3}-[0-9]{4}"));
    }
    @Test
    public void validatePhoneNumFail ()
    {
        Application jeremy = new Application();
        jeremy.setPhoneNum("(951)sss-ssss");
        assertTrue(jeremy.getPhoneNum().matches("\\([0-9]{3}\\)[0-9]{3}-[0-9]{4}"));
    }
    @Test
    public void validateFederalEINFail ()
    {
        Application jeremy = new Application();
        jeremy.setFederalEIN("ss-sssssss");
        assertTrue(jeremy.getFederalEIN().matches("[0-9]{2}-[0-9]{7}"));
    }
    @Test
    public void validateFederalEINPass ()
    {
        Application jeremy = new Application();
        jeremy.setFederalEIN("11-1111111");
        assertTrue(jeremy.getFederalEIN().matches("[0-9]{2}-[0-9]{7}"));
    }
    @Test
    public void validateSocialSecurityFail ()
    {
        Application jeremy = new Application ();
        jeremy.setSocialSecurity("sss-ss-ssss");
        assertTrue(jeremy.getSocialSecurity().matches("[0-9]{3}-[0-9]{2}-[0-9]{4}"));
    }
    @Test
    public void validateSocialSecurityPass ()
    {
        Application jeremy = new Application ();
        jeremy.setSocialSecurity("111-11-1111");
        assertTrue(jeremy.getSocialSecurity().matches("[0-9]{3}-[0-9]{2}-[0-9]{4}"));
    }
    @Test
    public void validateStreetAddressPass ()
    {
        Application jeremy = new Application ();
        jeremy.setStreetAddress("123 bro st");
        assertTrue(jeremy.getStreetAddress().matches("[0-9]{1,5} [A-Za-z]+ (st|ave|dr|cir|blvd)"));
    }
    @Test
    public void validateStreetAddressFail ()
    {
        Application jeremy = new Application ();
        jeremy.setStreetAddress("sss 123 st");
        assertTrue(jeremy.getStreetAddress().matches("[0-9]{1,5} [A-Za-z]+ (st|ave|dr|cir|blvd)"));
    }
    @Test
    public void validateSecondAddressFail()
    {
        Application jeremy = new Application ();
        jeremy.setSecondAddress("bro, ca 55555");
        assertTrue(jeremy.getSecondAddress().matches("[A-Za-z]+, \\p{Alpha}{2} [0-9]{5}"));
    }
    @Test
    public void validateSecondAddressTrue()
    {
        Application jeremy = new Application ();
        jeremy.setSecondAddress("bro, CA 55555");
        assertTrue(jeremy.getSecondAddress().matches("[A-Za-z]+, \\p{Alpha}{2} [0-9]{5}"));
    }



}