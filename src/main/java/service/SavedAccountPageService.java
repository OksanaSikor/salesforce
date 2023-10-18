package service;

import pages.SavedAccountPage;

public class SavedAccountPageService {

    private SavedAccountPage savedPage = new SavedAccountPage();

    private String savedAccountNameOnPage;

    public String getSavedAccountNameFromPage() {
        return savedPage.getSavedAccountName();
    }
}
