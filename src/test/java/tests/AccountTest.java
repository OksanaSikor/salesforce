package tests;

import model.Account;
import model.User;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import service.NewAccountService;

import static utils.RandomString.randomString;

public class AccountTest extends BaseTest {

    @DataProvider
    public Object[][] valuesForNewAccountFields() {
        return new Object[][]{
                {randomString(7), randomString(10), "Banking"}
        };
    }

    @Test(dataProvider = "valuesForNewAccountFields")
    public void checkSuccessfulCreateAccount(String accountName, String webSite, String industry){
        User user = new User();
        Account account = new Account(accountName, webSite, industry);
        loginPageService.loginWithUser(user);
        NewAccountService newAccountService = new NewAccountService();
        String accountNameOnThePage = newAccountService.createAccount(account)
                .getSavedAccountName();
        Assert.assertEquals(accountName, accountNameOnThePage, "Names are different");
    }
}
