package service;

import model.Account;
import pages.NewAccountPage;
import pages.SavedAccountPage;

public class NewAccountService {

    private NewAccountPage newAccountPage = new NewAccountPage();

    public SavedAccountPage createAccount(Account account){
        newAccountPage.openAccountPage()
                .fillInAccountName(account)
                .fillInWebsite(account)
                .fillInIndustry(account)
                .clickSave();
        return new SavedAccountPage();
    }
}
