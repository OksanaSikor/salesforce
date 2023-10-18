package service;

import model.User;
import pages.LoginPage;

public class LoginPageService {

    private LoginPage loginPage = new LoginPage();

    public void loginWithUser(User user){
        loginPage.openPage(user.getUrl())
                .fillInUserName(user.getUserName())
                .fillInPassword(user.getPassword())
                .clickLoginButton();
    }
}
