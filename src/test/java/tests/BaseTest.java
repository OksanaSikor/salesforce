package tests;

import driver.DriverSingleton;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import service.LoginPageService;

public class BaseTest {

    protected LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @AfterClass
    public void stopBrowser() {
        DriverSingleton.getInstance().closeDriver();
    }
}
