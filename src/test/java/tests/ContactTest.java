package tests;

import model.Contact;
import model.User;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import service.NewContactService;

import static utils.RandomString.randomString;

public class ContactTest extends BaseTest {

    @DataProvider
    public Object[][] valuesForNewContactFields() {
        return new Object[][]{
                {"Prof.", randomString(10), "111-222-9999"},
        };
    }

    @Test(dataProvider = "valuesForNewContactFields")
    public void checkSuccessfulCreateContact(String salutation, String lastName, String phone){
        User user = new User();
        Contact contact = new Contact(salutation, lastName, phone);
        loginPageService.loginWithUser(user);
        NewContactService newContactService = new NewContactService();
        String contactNameOnThePage = newContactService.createContact(contact)
                .getSavedContactName();
        String joinedContactName = contact.getSalutation()+' '+contact.getLastName();
        Assert.assertEquals(joinedContactName, contactNameOnThePage, "Names are different");
    }
}
