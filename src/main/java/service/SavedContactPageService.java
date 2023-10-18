package service;

import pages.SavedContactPage;

public class SavedContactPageService {
    private SavedContactPage savedPage = new SavedContactPage();

    private String savedContactNameOnPage;

    public String getSavedContactNameFromPage() {
        return savedPage.getSavedContactName();
    }
}
